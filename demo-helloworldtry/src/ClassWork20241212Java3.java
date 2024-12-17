import java.util.Scanner;

public class ClassWork20241212Java3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;
    String monthOfName = "Unknown";
    
    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12
    if (month >= 1 && month <= 12){
      System.out.println(month);
    } else {
      System.out.println("error");
    }
    
    
      

    

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0
    
    
    if(month == 1){
          numberOfDaysInMonth = 31;
        } else if(month == 2){
          if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            numberOfDaysInMonth = 29;
          } else{
            numberOfDaysInMonth = 28;
          }
        } else if(month == 3){
          numberOfDaysInMonth = 31;
        } else if(month == 4){
          numberOfDaysInMonth = 30;
        } else if(month == 5){
          numberOfDaysInMonth = 31;
        } else if(month == 6){
          numberOfDaysInMonth = 30;
        } else if(month == 7){
          numberOfDaysInMonth = 31;
        } else if(month == 8){
          numberOfDaysInMonth = 31;
        } else if(month == 9){
          numberOfDaysInMonth = 30;
        } else if(month == 10){
          numberOfDaysInMonth = 31;
        } else if(month == 11){
          numberOfDaysInMonth = 30;
        } else if(month == 12){
          numberOfDaysInMonth = 31;
        }
    

  System.out.println(monthOfName+" "+year+" has "+numberOfDaysInMonth+" days");

}
}
