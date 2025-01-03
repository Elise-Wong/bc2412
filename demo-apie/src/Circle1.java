import java.math.BigDecimal;

public class Circle1 extends Shape{
  //Attributes
  private double radius;
  
  
    
  //construtor
  public Circle1(String color, double radius){
    super(color);
    this.radius = radius;
  }


  //empty construtor
  public Circle1(){
  }
  
  
  //getter
  public double getRadius(){
    return this.radius;
  }



  public double Area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  
    
  //setter
  public void come(){
    System.out.println("Circle is coming...");
  }
  
  
  public static void main(String[] args) {
    Circle1 c1 = new Circle1("white", 9.0);
    System.out.println(c1.getColor() + "," + c1.Area());
    
  }
  
  }


