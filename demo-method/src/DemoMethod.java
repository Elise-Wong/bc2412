public class DemoMethod {
  public static int sum(int x, int y){
    int result = x - y;
    return result;
  }

  public static double subtract (double a, double b){
    return a - b;
  }

  public static int countCharacter(String source, char target){
    int count = 0;
    for (int i = 0; i < source.length(); i++){
      if (source.charAt(i) == target){
        count++;
      }
    }
    return count;
  }

  public static double sum(int a, double b){
    return a + b;
  }

  public static double sum(double a, int b){
    return a + b;
  }

  public static double sum(double a, double b){
    return a + b;
  }

  public static double sum(int a, String b){
    return a + Integer.valueOf(b);
  }

  public static int totalMinutes(int day){
    int minutes = 0;
    for (int i = 0; i < day; i++){
      for (int j = 0; j < 24; j++){
        minutes +=60;
      }
    }
    return minutes;
      }
    
  
  public static int countEven(int[] arr){
    int count = 0;
    for (int i = 0, i <arr.length; i++){
      if (arr[i] % 2 == 0){
        count++;
      }
      return count;
    }
  }

  public static int countEven(long[] arr){
    int count = 0;
    for (int i = 0, i <arr.length; i++){
      if (arr[i] % 2 == 0){
        count++;
      }
      return count;
    }
  }


  public static void main(String[] args){
    int x = 3;
    int a = 10;
    int b = 11;
    int y = a + b;
    System.out.println(y);
    a = 19;
    b = 21;
    y = a + b;
    System.out.println(y);

    
    y = sum(10, 11);
    System.out.println(y);
    y = sum(19, 21);
    System.out.println(y);


    System.out.println(subtract(100,98));


    System.out.println(countCharacter("hello", 'l'));
    System.out.println(countCharacter("abc", 'l'));
    System.out.println(countCharacter("abc", 'a'));
    System.out.println(countCharacter(" ", 'c'));

    sum(1, 2.0);
    sum(1, 2);
    sum(1.0, 2);
    sum(1.0, 2.0);
    System.out.println(sum(2, "123"));

    System.out.println(countEven(new long[] {1L, 3L, 2L, 6L}));
    System.out.println(countEven(new int[] {1, 3, 2, 6}));


  }
  
  
}
