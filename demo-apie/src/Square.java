import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape {
  //Attributes
  private double weight;
  private double height;
  
    
  //construtor
  public Square(String color, double weight, double height){
    super(color);
    this.weight = weight;
    this.height = height;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Square))
      return false;
    Square square = (Square) obj;
      return Objects.equals(square.getWeight(), this.weight)
          && Objects.equals(square.getColor(), super.getColor());
    }

  @Override
  public int hashCode(){
    return Objects.hash(this.weight, super.getColor());
  }

  @Override
  public String toString(){
    return "Square["
          + "weight=" + this.weight
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

  public double areaa(){
    return BigDecimal.valueOf(this.weight)
    .multiply(BigDecimal.valueOf(this.height))
    .doubleValue();
  }
  
    
  //setter
  public void come(){
    System.out.println("Square is coming...");
  }
  
  
  public static void main(String[] args) {
    Square s1 = new Square("yellow", 5.0, 5.0);
    System.out.println(s1.getColor() + "," + s1.areaa());
  
    Square s2 = new Square("yellow", 5.0, 5.0);
    System.out.println(s1);
    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

  }
  
  }