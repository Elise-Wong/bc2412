import java.math.BigDecimal;
import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args){

        int x1 = 3;
        int x2 = 10;
        int x3 = 11;

        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 11;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= 10){
                System.out.println(arr[i]);
            }
        }

        double y1 = 10.4; 
        double y2 = 4.3;
        double y3 = 3.3; 
        double y4 = 1.9; 
        double y5 = 9.9;

        double[] arr2 = new double[5];
        arr2[0] = 10.4; 
        arr2[1] = 4.3;
        arr2[2] = 3.3; 
        arr2[3] = 1.9; 
        arr2[4] = 9.9;
        
        double sum = 0;
        for (int y = 0; y < arr2.length; y++){
            sum = sum + arr2[y];
            System.out.println(sum);
        }


        String z1 = "abc";
        String z2 = "def";
        String z3 = "ijk";

        String[] arr3 = new String[3];
        arr3[0] = "abc";
        arr3[1] = "def";
        arr3[2] = "ijk";

        String target = "abc";
        boolean isTargetExist = false;
        for (int z = 0; z < arr3.length; z++){
        if (target.equals(arr3[z])){
            isTargetExist = true;
          System.out.println(isTargetExist);  
        }
    }

        
        char[] arr4 = new char[]{'b','c','a'};
        int[] ascii = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++){
            ascii[i] = arr4[i];
        }
        for (int i = 0; i < ascii.length; i++){
            System.out.println(ascii[i]);
        }



        int max = 0;
        for (int i = 0; i < ascii.length; i++){
            if(ascii[i] > max){
            max = ascii[i];
        }
        }
        System.out.println(max);
       
       

        
        int [] arr5 = new int[]{9, 8, 99, 98};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr5.length; i++){
            if(arr5[i] < min){
            min = arr5[i];
            System.out.println(min); 
        }
    }

        int [] arr6 = new int[]{9, 8, 99, 98};
        sum = 0;
        for (int i = 0; i < arr6.length; i++){
            sum = sum + arr6[i];
         }
         System.out.println(sum);


        int left = 7;
        int right = 8;
        int temp = left; 
        left = right;
        right = temp;
        System.out.println(left);
        System.out.println(right);


       
        int [] arr7 = new int []{9, -8, 109, 99, 98};
            for (int i = 0; i < arr7.length - 1; i++){
                System.out.println(arr7[i] + arr7[i + 1]);
            }
        




        int [] arr8 = new int [] {9, -8, 109, 99, 98};
            for (int i = 0; i < arr8.length - 1; i++){
                if (arr8[i] > arr8[i + 1]){
                    temp = arr8[i];
                    arr8[i] = arr8[i + 1];
                    arr8[i + 1] = temp;
                  }
                }
                System.out.println(Arrays.toString(arr8));


        Integer[] arr9 = new Integer[]{9, 6, 4};
        int product = 1;
        for (int i = 0; i < arr9.length; i++){
            product *= arr9[i];
        }
        System.out.println(product);



        double[] prices = new double[]{8.2, 6.5, 10.5};
        int[] quantities = new int[]{9, 8, 3};
        double totalAmount = 0.0;
        for (int i = 0; i < prices.length; i++){
            totalAmount += prices[i] * quantities[i];
        }
        System.out.println(totalAmount);



        String s = String.valueOf(123);
        System.out.println(s);

        s = String.valueOf(true);
        System.out.println(s);

        System.out.println(String.valueOf('A'));

        Integer i1 = Integer.valueOf("123");
        System.out.println(i1);

        char[] chArr = "hello".toCharArray();
        char cTemp;
        for (int i = 0; i < chArr.length / 2; i++){
            cTemp = chArr[i];
            chArr[i] = chArr[chArr.length - i - 1];
            chArr[chArr.length - i - 1] = cTemp;
        }
        String result = "";
        for (int i = 0; i < chArr.length; i++){
            result += chArr[i];
        }
        System.out.println(result);
    

        chArr = "hello".toCharArray();
        for (int i = 0; i < chArr.length; i++){
            chArr [i] = (char)(chArr[i] + 1);
        }
        System.out.println(String.valueOf(chArr));


        char[] arr12 = new char[]{'p','a','p','b','a','p'};
        int count = 0;
        
        for(int i = 0; i < arr12.length; i++){
            if(arr12.charAt(i) == 'p'){
                count++;
            }
            
        }

        System.out.println(count);

    }
}