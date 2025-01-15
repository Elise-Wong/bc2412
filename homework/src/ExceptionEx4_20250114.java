import java.util.Scanner;

public class ExceptionEx4_20250114 {
  // Follow the instructions below to complete the User Registration Process.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();

    // code here ...

    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."
    try{
      registerUser(username, password, email);
      System.out.println("User Registeration is success.");
    } catch (UserRegistrationException e){
      System.out.println("User Registeration is fail.");
    }



  }

  public static class UserRegistrationException extends RuntimeException{

  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
        try{
          validateUsername(username); //vali: if email checking fail, throw adn exit this method
          validateEmail(email);
          validatePassword(password);
          System.out.println("User registered sucessfully: " + username);
        } catch (IllegalArgumentException e){
          //re-throw: 重新說明事件
          throw new UserRegistrationException();
        }

        }


  

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    if (username == null || username.isEmpty()){ //== null 空置針
      throw new IllegalArgumentException();
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    if (password == null || password.length() < 8 
      || (!password.contains("!")
        && !password.contains("@")
        && !password.contains("$")
        && !password.contains("&")
        && !password.contains("_"))){
      throw new IllegalArgumentException();
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    if (email == null || !email.contains("@"))
      throw new IllegalArgumentException();
  }

}

