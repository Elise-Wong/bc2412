import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PersonInfo {
  //Attributes
  private String name;
  private double weight;
  private double height;

  //Constructor
  public PersonInfo(String name, double weight, double height){
    this.name = name;
    this.weight = weight;
    this.height = height;
  }

  //Getter
   public double calculateBMI(){
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP)
    .doubleValue();
    }

    //Setter
    public void setWeight(double weight){
      this.weight = weight;
    }

    public static double BMI(double weight, double height){
      return BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2, RoundingMode.HALF_UP)
      .doubleValue();
      }

    public String getCategory(){
      double calculateBMI = this.calculateBMI();
      if (calculateBMI < 18.5){
        return "underWeight";
      } else if (calculateBMI >= 18.5 && calculateBMI <= 24.9){
        return "normal";
      } else if (calculateBMI >= 25.0 && calculateBMI <= 29.9){
        return "overweight";
      } else if (calculateBMI >= 30.0 && calculateBMI <= 34.9){
        return "obese";
      } else{
        return "extremelyObese";
      }
     }




  public static void main(String[] args){
    PersonInfo p1 = new PersonInfo("Jimmy", 68.0, 1.74);
    PersonInfo p2 = new PersonInfo("Jams", 78.0, 1.78);
    System.out.println(p1.calculateBMI() + ", " + p1.getCategory());

  

    System.out.println(PersonInfo.BMI(65.5, 1.79));

}
  }