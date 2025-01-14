import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball implements Comparable<Ball>{
  //attribute
  private Color color;
  private int value;

  //constructor
  public Ball(Color color, int value){
    this.color = color;
    this.value = value;
  }

  //getter
  public Color getColor(){
    return this.color;
  }

  public int getValue(){
    return this.value;
  }

  //setter
  public void setColor(Color color){
    this.color = color;
  }

  public void setValue(int value){
    this.value = value;
  }

  @Override
  public int compareTo(Ball ball){
    //Compare 2 balls
    //誰行先用()內的數去return: this.ball (-1), ball(1)
    //our task, lower value, return first
   // if (this.value > ball.getValue()){ // > 由大至小 ; < 由小至大
   //   return -1;
  //  }
  //  return 1;

    //order by color: red, blue, yellow
    //for same color, descending order of value
    if (this.color == ball.getColor())
      if (this.value > ball.getValue()){
      return -1;
    } else{
      return 1;
     } 
  
    if (this.color == Color.RED)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.BLUE)
      return -1; 
  
      return 1;
    } 
  


  public static enum Color{
    RED, YELLOW, BLUE,;
  }

  @Override
  public String toString(){ //for 亂碼
    return "Ball["
        + "color=" + this.color
        + ", value=" + this.value
        + "]";
  }

  public static void main(String[] args) {
    //ball list: red 1, yellow 9, blue 7, yellow 3, red 8
    List<Ball> balls = new ArrayList<>() ;
    balls.add(new Ball(Ball.Color.RED, 1)); //public class
    balls.add(new Ball(Color.YELLOW, 9)); //private class
    balls.add(new Ball(Color.BLUE, 7));
    balls.add(new Ball(Color.YELLOW, 3));
    balls.add(new Ball(Color.RED, 8));
    System.out.println(balls);

    //sort by Values
    //Approach 1: Comparable<Ball> (Disadvatage: only 1 rule for sort)
    Collections.sort(balls); //Ball.class comply with the contract of Collections.sort()
    System.out.println(balls); //順次序排了

    //Approach 2: Comparator<Ball> (better design)
    Comparator<Ball> sortFormula;
    int x = 3;
    if (x > 2){
      sortFormula = new SortByColor();
    } else {
      sortFormula = new SortByValue();
    }
    Collections.sort(balls, sortFormula); //Comparator.sort(balls, new SortByColor());
    System.out.println(balls);



  }

}
