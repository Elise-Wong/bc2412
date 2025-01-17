import java.util.Scanner;

public class ExceptionEx2_20250114 {
  // Question: Write a program that takes an array of integers and prints the element at a
  // user-provided index. Handle ArrayIndexOutOfBoundsException and NumberFormatException.

  // step 2 - 1. If ArrayIndexOutOfBoundsException is caught, print "Error: Index is out of bounds."
  // step 1 - 2. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 3. If no exception is caught, print "Element at index X: Y"
  // 3. No matter if the exception is caught, finally print "Array retrieval attempt completed."

  public static void main(String[] args) {
   
    int[] numbers = {10, 20, 30, 40, 50};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index to retrieve: ");

    //for input sth
    String str = scanner.nextLine(); //read String //str=input

    scanner.close();

// code here ...
    try{
    //String to int
    int num = Integer.parseInt(str); //num=idx
    int result = numbers[num];
    System.out.println("Element at index " + num + ": " + result); //4 [base on 012341] -> Element at index 4: 50
    } catch (NumberFormatException e){
      System.out.println("Error: Please enter a valid number."); //abc
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Error: Index is out of bounds."); //any number
    } finally{
    System.out.println("Array retrieval attempt completed.");
    }

    
   


  }
}
