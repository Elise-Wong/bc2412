import java.math.BigDecimal;

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
    .doubleValue();
  }
  
    
  //setter
  public void come(){
    System.out.println("Square is coming...");
  }
  
  
  public static void main(String[] args) {
    Square s1 = new Square("yellow", 5.0, 5.0);
    System.out.println(s1.getColor() + "," + s1.Area());
    
  }
  
  }


