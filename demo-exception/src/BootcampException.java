public class BootcampException extends RuntimeException {
  //once you extends Exception Family, your class become an exception class
  //you can now throw the object of this class
  public static String concat(String x, String y){
    if (x == null){
      throw new IllegalArgumentException();
    }
    return x.concat(y);
  }

  public static void main(String[] args) {
    
    throw new BootcampException(); //Syntax OK
    //throw new Cat(); //Class Cat didn't extend Exception Family, it cant be thrown.

    //caller: call the below method by try-catch
    try{
      int z = 100 * 0;
    } catch (IllegalArgumentException e){
      System.out.println("zeroo");
    }


    //write a method to throw BootcampException




  }

}
