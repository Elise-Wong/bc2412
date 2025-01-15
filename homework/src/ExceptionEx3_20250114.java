import java.util.Scanner;

public class ExceptionEx3_20250114 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge(). 
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."
  public static class InvalidAgeException extends RuntimeException{

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String age = scanner.nextLine();

    String str = "Age X is accepted";
    int x = 0;
    try{
   //   age = Integer.parseInt(str);
    checkAge(x);
    } catch (NumberFormatException e){
      System.out.println("Error: Please enter a valid number.");
    }
    System.out.println("Age is invalid. Please input again later.");

  }

    // code here for the method
    public static int checkAge(int age){
      if (age < 18){
        throw new InvalidAgeException();
      }
      return age;
      //System.out.println("Age X is accepted");
    }





}
