import java.math.BigDecimal;

public class Student {
  //Attributes
  private int score;
  private int totalCandy;
  private int receivedCandy;


  //Constructor
  public Student(int score){
    this.score = score;
    this.totalCandy = totalCandy;
    this.receivedCandy = 0;
  }



  //Getter
  public int getScore(){
    return this.score;
  }

  public int getTotalCandy(){
    return this.totalCandy;
  }

  public int getReceivedCandy(){
    return this.receivedCandy;
  }




  //Setter
  //static
  public static int getCandy(){
    
    int score = 0;
    int totalCandy = 20;
    int receivedCandy = 0;

    //totalCandy - candyCount = remainCandy
    
    
      
    if (receivedCandy < totalCandy){
    if (score >= 80 && receivedCandy + 2 <= totalCandy){
      receivedCandy = 2;
      return 2;
    } else if (score >= 60 && score >= 79 && receivedCandy + 1 <= totalCandy){
      receivedCandy = 1;
      return 1;
    } else{
      receivedCandy = 0;
      return 0;
      
    }
    
  }
   return receivedCandy;
   
  }


  public static void main(String[] args) {
    Student s1 = new Student(67);
    Student s2 = new Student(89);
    Student s3 = new Student(50);
    Student s4 = new Student(99);
    Student s5 = new Student(60);
    Student s6 = new Student(59);

    Student[] students = new Student[]{s1,s2,s3,s4,s5,s6};

    for (int i = 0; i < students.length; i++){
      
      System.out.println(students[i].getScore());
      int result = Student.getCandy();
      System.out.println(result);
    }
  

   


  }

}
