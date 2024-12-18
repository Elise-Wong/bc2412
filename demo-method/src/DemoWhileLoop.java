import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {

    public static boolean isDuplicated(int[] arr, int newValue){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == newValue)
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        for (int i = 0; i < 3; i++){
            System.out.println(i);
         }

         int j = 0;
         while (j < 3){
            System.out.println(j);
            j++;
            j++;
            j++;
         }


         String s = "hello";
         char target = 'e';
         int k = 0;
         boolean found = false;
         while (k < s.length()){
            if(s.charAt(k) == target){
                found = true;
                break;
                }
               k++;
         }
        System.out.println(found);

         int number = new Random().nextInt(3);
         System.out.println(number);

         int marksix = new Random().nextInt(49) + 1;
         System.out.println(marksix);


         int[] marksixArr = new int[6];
         int count = 0;
         int value = 0;
         while (count < 6){
            value = new Random().nextInt(49) + 1;
            if(!isDuplicated(marksixArr, value)){
                marksixArr[count] = value;
                count++;
            }
            }
                System.out.println(Arrays.toString(marksixArr));


        int min = 1;
        int max = 100;
        int bomb = new Random().nextInt(max) + 1;
        int input = -1;
        Scanner scanner = new Scanner(System.in);
        while (bomb != input){
            System.out.println("Please input a number:"+ min + "-" + max);
             input = scanner.nextInt();
         if (input < min || input > max){
         continue;
         }
            if (input < bomb){
                min = input + 1;
            } else {
                max = input - 1;
                
            }
        }
        System.out.println("Bomb!");
        scanner.close();

       



        


    }
}
