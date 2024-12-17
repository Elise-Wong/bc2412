import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args){

    double result = 0.2 + 0.1;
    System.out.println(result); 
    if (result == 0.3){
      System.out.println("Result is 0.3.");
      } else {
        System.out.println("Result is NOT 0.3.");
      }


      BigDecimal bd1 = BigDecimal.valueOf(0.2); 
      BigDecimal bd2 = BigDecimal.valueOf(0.1);
      BigDecimal bd3 = bd1.add(bd2);
      System.out.println(bd3.doubleValue()); 
      
      BigDecimal bd4 = BigDecimal.valueOf(0.3);
      BigDecimal bd5 = BigDecimal.valueOf(0.1);
      BigDecimal bd6 = bd4.subtract(bd5);
      System.out.println(bd6.doubleValue()); 


      
      BigDecimal bd7 = bd5.multiply(bd1);
      System.out.println(bd7.doubleValue());

      BigDecimal bd8 = bd4.divide(bd5);
      System.out.println(bd8.doubleValue());


      BigDecimal bd9 = BigDecimal.valueOf(10);
      BigDecimal bd10 = BigDecimal.valueOf(3);
      BigDecimal bd11 = bd9.divide(bd10, BigDecimal.ROUND_DOWN);
      System.out.println(bd11.doubleValue());


      BigDecimal bd12 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN);
      System.out.println(bd12.doubleValue());

      BigDecimal bd13 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_UP);
      System.out.println(bd13.doubleValue());

      BigDecimal bd15 = BigDecimal.valueOf(4.565);
      System.out.println(bd15.setScale(2, RoundingMode.HALF_DOWN));
      System.out.println(bd15.setScale(2, RoundingMode.HALF_UP));

      BigDecimal bd14 = BigDecimal.valueOf(4.566);
      System.out.println(bd14.setScale(2, RoundingMode.HALF_DOWN));
      System.out.println(bd14.setScale(2, RoundingMode.HALF_UP));


      double length = 4.2;
      double squareArea = BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(length)).doubleValue();
        System.out.println(squareArea);



        double pi = 3.14159;
        double radius = 4.5;
        double circleArea = BigDecimal.valueOf(pi).
        multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
        System.out.println(circleArea);

        circleArea = BigDecimal.valueOf(Math.pow(radius, 2.0))
        .multiply(BigDecimal.valueOf(Math.PI)).
        doubleValue();
        System.out.println(circleArea);



        int x = 8;
        int y = 9;
        int max = Integer.MIN_VALUE;
        max = Math.max(x, max);
        max = Math.max(y, max);

        int[] arr = new int[]{10, 9, 3};
        for (int i = 0; i < arr.length; i++){
          max = Math.max(arr[i], max);
        }
          
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(-10));


        double u = 3.456;
        double u2 = 3.556;
        System.out.println(Math.round(u));  // 3
        System.out.println(Math.round(u * 100.0) / 100.0);  // 3
        System.out.println(Math.round(u2));

        System.out.println(Math.abs(-9L));
        

  }
}
