import java.math.BigDecimal;
import java.math.RoundingMode;

public class LABJ05arrays {
  public static void main(String[] args) {

    //01 avg
    double[] arr1 = new double[]{5.0,12.0,46.0,95.0,70.0};
    double sum = 0;
    for (int i = 0; i < arr1.length; i++){
      sum = (sum + arr1[i]);
      System.out.println("avg=" + BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(arr1.length)).setScale(1, RoundingMode.HALF_EVEN));
      }
    //arr.length = count

    //02 min, max
    int[] arr2 = new int[]{42,57,97,23,65,87,48,61,53,26};

    int min = Integer.MAX_VALUE; // min不可set做0, 不然出黎既答案是0, 而不是最小數
    for (int i = 0; i < arr2.length; i++){
      if (arr2[i] < min){
        min = arr2[i];
      }
    }
    System.out.println("min=" + min);

    int max = 0;
    for (int i = 0; i < arr2.length; i++){
      if (arr2[i] > max){
        max = arr2[i];
      }
    }
    System.out.println("max=" + max);

    //03
    String[] arr31 = new String[]{"Python", "JAVA", "PHP", "C#", "C++"};
    String[] arr32 = new String[]{"SQLite", "Oracle", "C++", "DB2", "JAVA"};
    String same ="JAVA";
    boolean str = false;
    for (int i = 0; i < arr31.length; i++){
      for (int j = 0; j < arr32.length; j++){
        //if (same.equals(arr31[i])){
        if (arr31[i].equals(arr32[j]) && arr31[i].length() > 5 || arr32[j].length() > 5){
          str = true;
          
        }
      }
    }
    System.out.println(str);
    //when i = 0 , j =
    //when i = 1,
    






    
  }
}
