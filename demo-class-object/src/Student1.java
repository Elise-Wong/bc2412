public class Student1 {
  //Attributes
  private long id;
  private int score;
  private int totalCandy; //x
  private int receivedCandy; //x
  private Candy[] candies;


  //Constructor
  public Student1(long id, int score){
    this.id = id;
    this.score = score;
    this.totalCandy = totalCandy; //x
    this.receivedCandy = 0; //x
    this.candies = new Candy[0];

    ///x
    this.candies = new Candy[Candy.COLORS.length * Candy.NOOFCANDYS.length];

    int idx = 0;
    for (char color : Candy.COLORS){
      for (int noOfCandy : Candy.NOOFCANDYS){
        this.candies[idx++] = new Candy(color, noOfCandy);
      }
    }

  }


  //Getter
  public long getId(){
    return this.id;
  }
  public int getScore(){
    return this.score;
  }

  public int getTotalCandy(){ //x
    return this.totalCandy;
  }

  public int getReceivedCandy(){ //x
    return this.receivedCandy;
  }

  public int getCandyCount(){
    return this.candies.length;
  }

  public Candy[] getCandies(){
    return this.candies;
  }

  public String getCandiesInfo(){
    String info = "";
    for (Candy candy : this.candies){
      info += "[" + candy.getColor() + ",";
    }
    return info.substring(0, info.length()) + "]";
  }
  

  //Setter
  public void placeCandy(Candy candy){ //x
    Candy[] newOrders = new Candy[this.candys.length + 1];
    for (int i = 0; i < this.candys.length; i++){
      newOrders[i] = this.candys[i];
    }
    newOrders[newOrders.length - 1] = candy;
    this.candys = newOrders;
  }

  public void receivedCandy(Candy candy){
    //new array
    Candy[] candies = new Candy[this.candies.length + 1];

    //for loop to copy
    for (int i = 0; i < this.candies.length; i++){
      candies[i] = this.candies[i];
    }

    //place candy at the tail
    candies[candies.length - 1] = candy;

    //replace the reference
    this.candies = candies;


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
