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

    sum = 0;
    for (int i = 0; i <= 10; i++){
      if(i % 2 == 1){
        sum += i;
        System.out.println(sum);
      }
    }

    int sum2 = 0;
    for (int x = 0; x <= 10; x++){
      if(x % 2 ==0){
        sum2 += x;
      }
    }
    System.out.println("* " + (sum2-sum));


    int oddSum = 0;
    int evenSum = 0;

    for (int i = 0; i <= 10; i++){
      if (i % 2 == 1){
        oddSum += i;
      } else{
        evenSum += i;
      }
    }
    int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
        System.out.println("*" + diff);
    



    String str = "abcdefijk";
    boolean isCharExist = false;
    
    for (int i = 0; i < str.length(); i++){
    if (str.charAt(i) == 'd'){
      isCharExist = true;
      break;
      }
      }
      System.out.println(isCharExist);


    String str2 = "hello";
    String substr = "ll";
    boolean isSubstringExist = false;
    for (int i = 0; i < str2.length() - substr.length() + 1; i++){
      if(str2.substring(i,i + substr.length()).equals(substr)){
        isSubstringExist = true;
        break;
      }
    }
    System.out.println(isSubstringExist);


    String s = "hello";
    int count = 0;
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == 'l'){
        count++;
      } 
    }
    System.out.println(count);

    String s1 = "hello";
    int num = 0;
    for (int i = 0; i < s1.length(); i++){
      if (s1.charAt(i) != 'l'){
        continue;
      } 
      num++;
    }
    System.out.println(num);


}
}