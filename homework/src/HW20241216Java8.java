public class HW20241216Java8 {
  public static void main(String[] args){

  
    
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 };
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] > max){
        secondMax = max;
        max = nums[i];
      } else if (nums[i] > secondMax && nums[i] < max){
        max = nums[i];
      }
      if (secondMax != Integer.MIN_VALUE){
        System.out.println(secondMax);
      }else{


      }
      System.out.println(nums[i]);


    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; 
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 };
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; 

    

  }
}
}