import java.math.BigDecimal;

public class CirclefrWeb implements ShapefrWeb{
  private double radius;

  public CirclefrWeb (double radius){
    this.radius = radius;

  }

  @Override
  public double areafrweb(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

}
