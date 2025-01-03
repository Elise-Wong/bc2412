import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

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

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Triangle))
      return false;
    Triangle triangle = (Triangle) obj;
      return Objects.equals(triangle.getWeight(), this.weight)
          && Objects.equals(triangle.getHeight(), this.height)
          && Objects.equals(triangle.getColor(), super.getColor());
    }

  @Override
  public int hashCode(){
    return Objects.hash(this.weight, this.height, super.getColor());
  }

  @Override
  public String toString(){
    return "Triangle["
          + "weight=" + this.weight
          + ", height=" + this.height
          + ", color=" + super.getColor()
          + "]";
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
    Triangle t1 = new Triangle("red", 5.0, 13.0);
    System.out.println(t1.getColor() + "," + t1.Area());
    
    Triangle t2 = new Triangle("red", 5.0, 13.0);
    System.out.println(t1);
    System.out.println(t1.equals(t2));
    System.out.println(t1.hashCode());
    System.out.println(t2.hashCode());


  }
  }