import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args){

    int[] arr = new int[]{3, 4, 5};
    for (int i = 0; i < arr.length; i++){ 
      System.out.println(arr[i]);
    }
    
    for (int i = 0; i < arr.length - 1; i++){ 
      System.out.println("*" + arr[i] + arr[i + 1]);
    }
    
    int temp = -1;
    for (int i = 0; i < arr.length / 2; i++){  //for-each做唔到
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(arr)); //[5,4,3]

    
    for (int integer : arr){
      System.out.println(integer);
    }


    char[] arr2 = new char[]{'p', 't', 'e'};
    String str = "";
    for (char c : arr2){
      str += c;
     } 
      System.out.println(str);


     String[] arr3 = new String[]{"abc","ijk","def"};
     String target = "ijk";
     boolean allowed = false;
     for (String s : arr3){
        allowed = true;
    }
    System.out.println(allowed);

    


  }
}
