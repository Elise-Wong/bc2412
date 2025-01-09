import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape{
  //Attributes
  private double weight;
  private double height;
  
    
  //construtor
  public Square(double weight){
    this.weight = weight;
  }

  
  //getter
  public double getWeight(){
    return this.weight;
  }


  public double area(){
    return BigDecimal.valueOf(this.weight)
    .multiply(BigDecimal.valueOf(this.weight))
    .doubleValue();
  }
  
    
  //setter

  
  
  public static void main(String[] args) {


  }
  
  }