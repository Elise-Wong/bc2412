public class Ball {
  private int value;

  //getter
  public int getValue(){
    return this.value; //[????]
  }

  //setter
  public Ball addValue(int value){
    this.value = value;
    return this;
  }



  public static void main(String[] args) {
    Ball ball = new Ball();
    ball = ball.addValue(3);
    ball = ball.addValue(4);
    System.out.println(ball.getValue());  //7
  }
}
