public class DemoForLoop {
  public static void main(String[] agrs){

    for (int i = 0; i < 3; i++){
      System.out.println("hello");
    }

    for (int i = 0; i < 5; i++){
      System.out.println(i);
    }

    for (int i = 0; i < 10; i++){
      if (i % 2 == 0){
        System.out.println(i);
      }
    }

    for (int i = 0; i < 101; i++){
      if(i % 3 == 0 && i % 4 == 0){
        System.out.println(i);
      }
    }

    int sum = 0;
    for (int i = 0; i < 21; i++){
      sum += i;
        System.out.println(sum);
  }
}
}