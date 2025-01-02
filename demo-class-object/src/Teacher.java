public class Teacher {  //who hold no. of candies
  //Attributes
  private Candy[] candies; //object reference
  private Student1[] students; //object reference


  //Constructor
  public Teacher(Candy[] candies, Student1[] students){
    this.candies = candies;
    this.students = students;
  }


  //Getter


  //Setter
  public static boolean shouldDistribute(int score, char color){
    return score >= 80 && color == 'R'
        || score >= 60 && score < 80 && color == 'B'
        || score < 60 && color == 'Y';
  }
  
  
  public void distribute(){
    //for (Candy candy : this.candies){//....只派到第1個分數的人
    int position = 0;

    while (true){ //永遠進入, 不用break;   = position < this.candies.length
      for (Student1 student : this.students){
       //System.out.println("sid=" + student.getId());
        if (shouldDistribute(student.getScore(), this.candies[position].getColor())){
          student.receivedCandy(this.candies[position]); //student's candy bay + 1
          this.candies[position] = null; //teacher's candy bay - 1
          //System.out.println("pos=" + position);
          if (++position >= this.candies.length){
            return;
          }
        }
      }
    }
  }

  public void clearCandy(int position){  //not a must
    this.candies[position] = null;
  }



  public static void main(String[] args) {
    //new Candy('R')
    Candy[] candies = new Candy[]{
    new Candy('R', 1),
    new Candy('Y', 2),
    new Candy('Y', 3),
    new Candy('Y', 4),
    new Candy('B', 5),
    new Candy('B', 6),
    new Candy('B', 7),
    new Candy('Y', 8),
    new Candy('R', 9),
    new Candy('B', 10)};
    System.out.println(candies.length);

    Student1[] students = new Student1[]{
    new Student1(1L, 67),
    new Student1(2L, 89),
    new Student1(3L, 50),
    new Student1(4L, 99),
    new Student1(5L, 60),
    new Student1(6L, 59)};


    Teacher t1 = new Teacher(candies, students);
    //Student[] students = new Student[]{new Student(67), 
    t1.distribute(); //how does teacher distribute candies to student1?
    
    //t1.distribute() <-> s1.setCandies()
    for (Student1 student : students);
    System.out.println("Student " + Student1.getId() + "-" + Arrays.toString(student.getCandy()));


  }

}
