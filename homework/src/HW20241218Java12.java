import java.util.Arrays;

public class HW20241218Java12 {
  public static int[] twoSum(int[] dataset, int target){
    int a = 0;
    int b = 0;
    return new int[] {a, b};
  }
  
  public static void main(String[] args){

    int[] dataset = new int[] {2, 7, 11, 15};
    
    int[] answers = twoSum(dataset, 9);
    int[] answers2 = twoSum(new int[] {3, 2, 4}, 6);
    int[] answers3 = twoSum(new int[] {3, 3}, 7);

    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));

  }
}
