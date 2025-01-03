import java.math.BigDecimal;
import java.util.Objects;

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

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Circle1))
      return false;
    Circle1 circle1 = (Circle1) obj;
      return Objects.equals(circle1.getRadius(), this.radius)
          && Objects.equals(circle1.getColor(), super.getColor());
    }

  @Override
  public int hashCode(){
    return Objects.hash(this.radius, super.getColor());
  }

  @Override
  public String toString(){
    return "Circle["
          + "radius=" + this.radius
          + ", color=" + super.getColor()
          + "]";
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

    Circle1 c2 = new Circle1("white", 9.0);
    System.out.println(c1);
    System.out.println(c1.equals(c2));
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    
  }
}