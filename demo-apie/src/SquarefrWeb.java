import java.math.BigDecimal;

public class SquarefrWeb implements ShapefrWeb{
  private double length;

  public SquarefrWeb (double length){
    this.length = length;

  }

  @Override
  public double areafrweb(){
    return BigDecimal.valueOf(this.length)
          .multiply(BigDecimal.valueOf(this.length))
          .doubleValue();
  }

 

  public static void main(String[] args) {
    SquarefrWeb s10 = new SquarefrWeb(10);
    System.out.println(s10.areafrweb());


  }
  

}
