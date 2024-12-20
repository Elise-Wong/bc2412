import java.util.Arrays;
import java.util.Scanner;

public class HW20241218Java10 {
  public static boolean isDuplicated(int[] arr, int newValue){
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == newValue){
        return true;
      
    }
  }
  public static void main(String[] args){

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

   
    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    
    System.out.println("Original Array : " + Arrays.toString(my_array));




    int[] newArr = {newValue};
    my_array = newArr;

    if (indexPosition > my_array.length){
     
    System.out.println(" Array : " + Arrays.toString(my_array));
    }      System.out.println("New Array: " + Arrays.toString(newArr));
   

    input.close();
  }
}
