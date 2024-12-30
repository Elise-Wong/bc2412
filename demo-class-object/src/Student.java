import java.math.BigDecimal;

public class Student {
  //Attributes
  private int score;
  private int candy;


  //Constructor
  public Student(int score){
    this.score = score;
    this.candy = candy;
  }



  //Getter
  public int getScore(){
    return this.score;
  }




  //Setter
  public static int getCandy(int noOfCandy){
    int score = 0;

    for (int i = 0; i < 20 ; i++){

    
    if (score >= 80){
      return noOfCandy = 2 ;
    } else if (score >= 60 && score >= 79){
      return noOfCandy = 1 ;
    } else{
      return noOfCandy = 0;
    }
  }
  }


  public static void main(String[] args) {
    Student s1 = new Student(67);
    Student s2 = new Student(89);
    Student s3 = new Student(50);
    Student s4 = new Student(99);
    Student s5 = new Student(60);
    Student s6 = new Student(59);


    System.out.println(s2.getCandy(89));


  }

}
