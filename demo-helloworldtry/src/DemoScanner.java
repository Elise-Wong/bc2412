import java.util.Scanner;
public class DemoScanner {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int num = scanner.nextInt();
    num = num * 2;
    System.out.println("num=" + num);

    scanner.nextLine(); 

    System.out.println("Please input a String:");
    String str = scanner.nextLine();
    System.out.println("str=" + str);


    for (int i = 0; i < num; i++){
      System.out.println("Hello");
    }

    scanner.nextLine(); 

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Please input numbers of days:");
    int day = scanner1.nextInt();
    day = day * 7;
    System.out.println("day=" + day);

    int totalHours = 8;
    for (int i = 0; i < day; i++){
      totalHours += 24;
      System.out.println("totalHours");


  }
}
}