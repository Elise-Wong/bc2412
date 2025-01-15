public class LoginManager {
  //attributes
  private String usernmae;
  private String password;


  //constructor
  public LoginManager(String usename, String password){
    this.usernmae = usename;
    this.password = password;
  }

  //getter


  //setter - instand method
  //Approach 1:
  public void validateUsername() {
    if (this.usernmae == null || this.usernmae.isEmpty()) {
      throw new InvalidUsernameException("Username is invalid: " + this.usernmae);
    }
  }

  public void validatePassword() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw new InvalidPasswordException("Password is invalid: " + this.password); //new InvalidPasswordException() 本身是empty constructor 
    }
  }


  //Approach 2:
  public void validateUsername2() {
    if (this.usernmae == null || this.usernmae.isEmpty()) {
      throw BusinessRuntimeException.of(SysError.INVALID_USERNAME);
    }
  }

  public void validatePassword2() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw BusinessRuntimeException.of(SysError.INVALID_PASSWORD);//xxx.of()背後是new, 可收埋new
    }
  }

    //Approach 1: InvalidUsernameExceptio + InvalidPasswordExceptio
    //another class
    public static class InvalidUsernameException extends RuntimeException{
      public InvalidUsernameException(String message){ //from java 原始code
        super(message); //所以用super
      }
    }

    //another class
    public static class InvalidPasswordException extends RuntimeException{
      public InvalidPasswordException(String message){
        super(message);
      }
    }

    //Approach 2: BusinessRuntimeException
    //another class
    public static class BusinessRuntimeException extends RuntimeException{
      //Runtime: spelling misktake -> "Invalid User Name.", "Invalid Password."
      
      //contstructor
      //如果有人改野, 一睇就知道
      private BusinessRuntimeException(SysError sysErr){ //用enum去fix desc //the Best!
        super(sysErr.getDesc()); //this.BusinessRuntimeException 可call 自己constructor
      }

      public static BusinessRuntimeException of(SysError sysError){ //xxxof()背後是new
        return new BusinessRuntimeException(sysError);
      }

    }

  public static void main(String[] args) {
    LoginManager loginManager = new LoginManager("JackWong", "abcd123!"); //correct pw

    //1. we can define the programme flow by custoime exceptions.
    //Approach 1:
    try{
      loginManager.validateUsername();
      loginManager.validatePassword();
      System.out.println("Validate Success");
    } catch (InvalidUsernameException e){ //e can carry message, e is an object
      System.out.println(e.getMessage());
    } catch (InvalidPasswordException e){
      System.out.println(e.getMessage());
    }

    //Approach 2:
    LoginManager loginManager2 = new LoginManager("JackWong", "abcd1234"); //incorrect pw
    try{
      loginManager2.validateUsername2();
      loginManager2.validatePassword2();
      System.out.println("Validate Success");
    } catch (BusinessRuntimeException e){
      System.out.println(e.getMessage());
    } catch (DemoUncheckedException.BusinessRuntimeException e){
      System.out.println(e.getMessage());
    }


  }

}
