import java.math.BigDecimal;
import java.util.Objects;

public class Circle1 extends Shape{
  //Attributes
  private double radius;
  
  
    
  //construtor
  public Circle1(double radius){
    
    this.radius = radius;
  }


  
  
  //getter
  public double getRadius(){
    return this.radius;
  }



  public double area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  
    
  //setter

  
  
  public static void main(String[] args) {


    
  }
}