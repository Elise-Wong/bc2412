public class DemoIf {
  public static void main(String[] args){

    int x = 3;
    if (x > 2){
      System.out.println("x is > 2.");
    }

    String s = "hello";
    if (s.length() > 3){
      System.out.println("s length is > 3.");
    }
    
    if (s.equals("hello")){
      System.out.println("s is equals to hello.");
    }

    if (s.charAt(4) == 'o'){
      System.out.println("the last character is o.");
    }

    if (x > 5){
      System.out.println("x > 5");
    }else {
      System.out.println("x <= 5");
    }

    int y = 10;
    if (y % 2 == 0){
      System.out.println("it is an even number.");
    }

    if (y % 2 == 1){
      System.out.println("it is an odd number.");
    }

    if (y > 3 && y % 2 == 0 ){
      System.out.println("y > 3 and is an even number.");
    }


    char k = 'k';
    if (k == 'k'){
      System.out.println("it is k.");
      }


      int age = 17;
      boolean isAdult = age >= 18;
      if(!isAdult){
        System.out.println("it is not an adult");
      }


      int score = 85;
      char gender = 'M';
      char grade = ' ';
      if (score >= 90){
        grade = 'A';
      } else if (score >= 85 && score <= 89 && gender == 'F' || score >= 87 && score <= 89 && gender == 'M'){
        grade = 'T';
      } else if (score >= 80 && score <= 84 && gender == 'F' || score >= 80 && score <= 86 && gender == 'M'){
        grade = 'B';
      } else if (score >= 70 && score <= 79){
        grade = 'C';
      } else {
        grade = 'F';
      }
        System.out.println(grade);




}
}
