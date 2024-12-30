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
  public static int getCandy(int candyCount){
    
    int score = 0;
    int candyC = 0;
    while(candyCount < 20){
      
    
    if (score >= 80){
      return candyCount = 2 ;
    } else if (score >= 60 && score >= 79){
      return candyCount = 1 ;
    } else{
      return candyCount = 0;
      
    }
    
  }
   return candyCount;
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
