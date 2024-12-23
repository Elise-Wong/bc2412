import java.math.BigDecimal;

public class Circle { //Blueprint
  //Attributes
  private double radius;
  private String color;

  //Constructor
  public Circle(double radius, String color){
    this.radius = radius;

  }

  //Getter
  public double getRadius(){
    return this.radius;
  }

  public double calculateArea(){
    return this.radius * this.radius * Math.PI;
  }


  //instance method
  public double Area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }


    //static method
    public static double Area2(double radius){
      return BigDecimal.valueOf(radius)
      .multiply(BigDecimal.valueOf(radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
    }


  //Setter
  public void setRedius(double radius){
    this.radius = radius;
  }

  
  public static void main(String[] args){
    Circle c1 = new Circle(3.0, "red");

    //presentation
    System.out.println(c1.calculateArea());
    System.out.println(c1.Area());

    //formula
    System.out.println(Circle.Area2(3.0));



  }
}
