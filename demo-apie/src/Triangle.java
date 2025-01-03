import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape{
  //Attributes
  private double weight;
  private double height;
  
    
  //construtor
  public Triangle(String color, double weight, double height){
  super(color);
  this.weight = weight;
  this.height = height;
    
  }
  
  
  //getter
  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }

  public double Area(){
  return BigDecimal.valueOf(this.weight)
  .multiply(BigDecimal.valueOf(this.height))
  .divide(BigDecimal.valueOf(2.0))
  .setScale(2, RoundingMode.HALF_EVEN)
  .doubleValue();
  }
  
    
  //setter
  public void come(){
    System.out.println("Triangle is coming...");
  }
  
  
  public static void main(String[] args) {
    Triangle t1 = new Triangle("red", 5.0, 5.0);
    System.out.println(t1.getColor() + "," + t1.Area());
    
  }
  
  }
