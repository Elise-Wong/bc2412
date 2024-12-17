public class HW20241213Java6 {
  public static void main(String[] args){
    
    int count = 10;
    int first = 0, second = 1;
    int[] fibonacci = new int[10];

    fibonacci[0] = 0;
    fibonacci[1] = 1;

    for (int i = 0; i < count; i++){
      fibonacci[i] = fibonacci[i + 1] + fibonacci[i + 2];
     
      int next = first + second;
      first = second;
      second = next;
    System.out.println(next);
    
    }


    

  }
}
