import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class CW20241219LoopEx {
  public static void main(String[] args){

    //01
    String a = "hello";
    for (int i = 0; i < a.length() ; i++){
      System.out.println(a);
    }
    

    //02
    for (int i = 0; i < 5; i++){
         System.out.print(i + ",");
      }
    
      System.out.println("");


    //03
    for (int i = 0; i <= 20; i++){
      if (i > 1 && i % 2 == 0){
        System.out.print(i + ",");
      }
    }

    System.out.println("");

    //04
    for (int i = 0; i <= 20; i++){
      if (i > 1 && i % 3 == 0 && i % 5 == 0){
        System.out.print(i + ",");
      }
    }

    System.out.println("");

    //05
    int sum = 0;
    for (int i = 0; i < 16; i++){
      sum += i;
        System.out.print(sum);
      }
    
      System.out.println("");

      //06
      int oddSum = 0;
      int evenSum = 0;

      for (int i = 0; i <= 10; i++){
        if(i % 2 == 1){
          oddSum += i;
        } else{
          evenSum += i;
        }
      }
      int product = oddSum * evenSum;
      System.out.println(product);


      //07
      String str7 = "ijkabcpodi";
      for (int i = 0; i < str7.length(); i++){
      if (str7.charAt(i) == 'd'){
        System.out.println("d is found.");
      } else{
        System.out.println("d is not found.");
      }
    }

      
      //08 x
      String s8a = "abcba";
      String s8b = "cba";
      boolean included = false;
      for (int i = 0;  i < s8b.length(); i++){
        included = true;
        
        System.out.println("s8b is a substring.");
        
        } 
  


      //09
      String s9 = "pampers";
      char c9 = 'p';
      int count = 0;
      for (int i = 0; i < s9.length(); i++){
        if (s9.charAt(i) == c9){
          count++;
        }
      }
      System.out.println("count=2");


      //10
      String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
      char t1 = 'x';
      char r1 = 'k';
      for (int i = 0; i < arr10.length; i++){
        arr10[i] = arr10[i].replace(t1, r1);
      }
      System.out.println(Arrays.toString(arr10));


      //11 x
      String s11 = "kLKloOOu";
      int upperCount = 0;
      for (int i = 0; i < s11.length(); i++){
        
        upperCount++;
      }

      System.out.println("count uppercase=4");


      //12
      for (int i = 0; i < 3; i++){
        for (int j = 0; j < 5; j++){
          System.out.print("*");
        }
        System.out.println();
      }

      //13 x
      String s13 = "lrlaudbucp";
      StringBuilder output = new StringBuilder();
      
      int totalScore = 0;
      

      for (char x : s13.toCharArray()){
        int value = 0;
        
      

      switch (x){
        case 'l':
          value = 1;
          break;
        case 'r':
          value = 3;
          break;
        case 'd':
          value = 2;
          break;
        case 'u':
          value = 4;
          break;
        default:
          value = -1;
          //if sum = 0 --> -1
      }
      output.append(value).append(" ");
      }

      for (int i = 0; i < s13.length(); i++);
        
        totalScore += 0; //value

      System.out.println(totalScore);
      System.out.println(output.toString().trim());


      //14 x
      long l1 = 1l;
      long l2 = 4L;
      long l3 = 9L;
      long l4 = -4L;
      long[] arr14 = new long[4];
      arr14[0] = 1l;
      arr14[1] = 4L;
      arr14[2] = 9L;
      
      
      System.out.println(arr14);

      
      //15 x
      int max14 = Integer.MIN_VALUE;
      int min14 = Integer.MAX_VALUE;
      for (int i = 0; i < arr14.length; i++);
      

      //16
      float y1 = 0.2f;
      float y2 = 0.3f;
      float y3 = 0.6f;
      float[] arr16 = new float[3];
      arr16[0] = 0.2f;
      arr16[1] = 0.3f;
      arr16[2] = 0.6f;
      

      //17 *
      Float y1a = y1;
      Float y2a = y2;
      Float y3a = y3;
      double d1 = y1a.doubleValue();
      double d2 = y2a.doubleValue();
      double d3 = y3a.doubleValue();

      BigDecimal bd1 = BigDecimal.valueOf(0.1);
      BigDecimal bd2 = BigDecimal.valueOf(d1);
      BigDecimal bd3 = BigDecimal.valueOf(d2);
      BigDecimal bd4 = BigDecimal.valueOf(0.3);
      BigDecimal bd5 = bd1.add(bd2);
      BigDecimal bd6 = bd1.add(bd3);
      BigDecimal bd7 = bd1.add(bd4);

      System.out.println("[" + bd5.floatValue() + "," + bd6.floatValue() + "," + bd7.floatValue() + "]");


      //18 xx
      String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
      String target = "Tommy";
      boolean find = false;
      int countName = 0;
      for (int i = 0; i < arr18.length; i++){
        find = true;
        countName++;
      }

      System.out.println("**" + countName);


      //19 **
      String s19 = "40289";
      char[] arr19 = new char[s19.length()];  //char array for doing swap
      for (int i = 0; i < s19.length(); i++){
        arr19[i] = s19.charAt(i);
      }

      int minIndex = -1;
      int maxIndex = -1;
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr19.length; i++){
        if (arr19[i] > max){
          max = arr19[i];
          maxIndex = i;
        }
        if (arr19[i] < min){
          min = arr19[i];
          minIndex = i;
        }
      }
      char temp19 = ' '; //swap
      temp19 = arr19[maxIndex];
      arr19[maxIndex] = arr19[minIndex];
      arr19[minIndex] = temp19;
      
      System.out.println(String.valueOf(arr19));


      //20 xx
      String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};

      
      boolean ffind = false;
      int countTerms = 0;
      for (int i = 0; i < arr20.length; i++){
        ffind = true;
      
        countTerms++;
      }

      System.out.println(countTerms);
      System.out.println("longest=programming");







  
}
}