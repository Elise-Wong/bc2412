import java.util.Scanner;

public class ExceptionEx2_20250114 {
  // Question: Write a program that takes an array of integers and prints the element at a
  // user-provided index. Handle ArrayIndexOutOfBoundsException and NumberFormatException.

  // 1. If ArrayIndexOutOfBoundsException is caught, print "Error: Index is out of bounds."
  // 2. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 3. If no exception is caught, print "Element at index X: Y"
  // 3. No matter if the exception is caught, finally print "Array retrieval attempt completed."

  public static void main(String[] args) {
    try{
    int[] numbers = {10, 20, 30, 40, 50};
    Scanner scanner = new Scanner(System.in);

    //for input sth
    String str = scanner.nextLine();

    //String to int
    int num = Integer.parseInt(str);


    scanner.close();
  

    System.out.print("Enter the index to retrieve: ");
    // code here ...
 
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Error: Index is out of bounds.");



    } catch (NumberFormatException e){
      System.out.println("Error: Please enter a valid number.");
    } finally{
    System.out.println("Element at index X: Y");  
    System.out.println("Array retrieval attempt completed.");
    }


    //


  }
}
