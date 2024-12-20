import java.math.BigDecimal;

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
      for (int i = 0;  i < s8b.length(); i++){
        
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


      //10 x
      String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};



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
      int x = 0;
      int totalScore = 0;
      int value = 0;

      switch (x){
        case 1:
          if (s13.equals("l")){
            x = 1;
          }
          break;
        case 2:
          if (s13.equals("r")){
            x = 3;
          }
          break;
        case 3:
          if (s13.equals("d")){
          x = 2;
          }
          break;
        case 4:
          if (s13.equals("u")){
          x = 4;
          } else{
            x = -1;
          }
          break;
      }
      for (int i = 0; i < s13.length(); i++);
        
        totalScore += value;

      System.out.println(totalScore);


      //14 x
      
      int[] arr14 = new int[]{1, 4, 9, -4};
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
      

      //17
      Float y1a = y1;
      Float y2a = y2;
      Float y3a = y3;
      double d1 = y1a.doubleValue();
      double d2 = y2a.doubleValue();
      double d3 = y3a.doubleValue();



      BigDecimal bd1 = BigDecimal.valueOf(0.1);
      BigDecimal bd2 = BigDecimal.valueOf(d1);
      BigDecimal bd3 = BigDecimal.valueOf(d2);
      BigDecimal bd4 = BigDecimal.valueOf(d3);
      BigDecimal bd5 = bd1.add(bd2);
      BigDecimal bd6 = bd1.add(bd3);
      BigDecimal bd7 = bd1.add(bd4);

      System.out.println("[" + bd5.floatValue() + "," + bd6.floatValue() + "," + bd7.floatValue() + "]");


      //18 xx
      String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
      String target = "Tommy";

      System.out.println("count name=2");


      //19 xx
      String s19 = "40289";

     

      System.out.println("49280");


      //20 xx
      String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};

      System.out.println("longest=programming");







  
}
}