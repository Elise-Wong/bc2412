import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PersonInfo {
  //Attributes
  private String name;
  private double weight;
  private double height;
  private char gender;

  //Constructor
  public PersonInfo(String name, double weight, double height, char gender){
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.gender = gender;
  }


  //Getter
  public double getWeight(){
    return this.weight;
    }

  public double getHeight(){
    return this.height;
    }

  public char getGender(){
    return this.gender;
    }

  
   public double calculateBMI(){
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP)
    .doubleValue();
    }

    //Setter
    public void setWeight(double weight){
      this.weight = weight;
    }

    // - static method
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
    PersonInfo p1 = new PersonInfo("Jimmy", 68.0, 1.74, 'M');
    PersonInfo p2 = new PersonInfo("Jams", 78.0, 1.78, 'M');
    System.out.println(p1.calculateBMI() + ", " + p1.getCategory());

  

    System.out.println(PersonInfo.BMI(65.5, 1.79));

    PersonInfo h2 = new PersonInfo("Ann", 45, 160, 'F');
    System.out.println(h2.getHeight());

    if(h2.getGender() == '\u0000'){
      System.out.println("char's default value.");
    }



}
  }