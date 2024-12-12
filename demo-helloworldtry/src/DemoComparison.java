public class DemoComparison {
  public static void main(String[] args){
    int age = 20;
    boolean isAdult = age > 18;
    System.out.println(isAdult); 

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println(isCorrect);

    char gender = 'M';
    boolean isMale = gender == 'F';
    System.out.println(isMale);

    float price = 10.2f;
    System.out.println(price != 10.2);


    boolean result = !isAdult;
    System.out.println(result);


    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = age2 >= 30 && gender2 == 'M';
    System.out.println(result2); 

    boolean result3 = age2 >= 30 || gender2 == 'M';
    System.out.println(result3);

    boolean result4 = age2 <30 || gender2 != 'F';
    System.out.println(result4);

    boolean result5 = age2 >=30 && (gender2 == 'M' || age2 >18);
    System.out.println(result5);
    
    boolean result6 = age2 >=30 && gender2 == 'M' || age2 >18;
    System.out.println(result6);

  }
}
