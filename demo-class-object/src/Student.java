import java.math.BigDecimal;

public class Student {
  //Attributes
  private long id;
  private int score;
  
  private int receivedCandy;

  private static int totalCandy = 0; // = candyCount


  //Constructor
  public Student(long id, int score){
    this.id = id;
    this.score = score;

    this.receivedCandy = 0;
  }



  //Getter
  public long getId(){
    return this.id;
  }
  
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


  public void addOneCandy(){
    this.candyCount++;
  }

  public void addTwoCandy(){
    this.candyCount += 2;
  }


  public static void main(String[] args) {
    Student s1 = new Student(1L, 67);
    Student s2 = new Student(2L, 89);
    Student s3 = new Student(3L, 50);
    Student s4 = new Student(4L, 99);
    Student s5 = new Student(5L, 60);
    Student s6 = new Student(6L, 59);

    Student[] students = new Student[]{s1,s2,s3,s4,s5,s6};
    //Student[] students = new Student[]{new Student(67), new Student(89), new Student(50), new Student(99), new Student(60), new Student(59)};


    //if int candyCount = 20; in main, only run once, but if in Attributes, can run many times
    while (totalCandy.count > 0){  // = Candy.count

      for (Student s: students){ //老師望住D學生D分去派糖
        if (s.getScore() >= 80 && totalCandy.count >= 2){
          s.addTwoCandy();
          totalCandy.count -= 2;
        } else if (s.getScore() >= 60 && s.getScore() < 80 && totalCandy.count >= 1){
          s.addOneCandy();
          totalCandy.count--;
        }
      
      }

    }


    for (int i = 0; i < students.length; i++){
      
      System.out.println(students[i].getScore());
      int result = Student.getCandy();
      System.out.println(result);
    }
  

   


  }

}
