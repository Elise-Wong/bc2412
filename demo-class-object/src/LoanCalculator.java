import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {
  private double principle;
  private double annualInverestRate;
  private int numOfYears;

  //constructor
  public LoanCalculator(double principle, double annualInverestRate, int numOfYears){
    this.principle = principle;
    this.annualInverestRate = annualInverestRate;
    this.numOfYears = numOfYears;
  }

  //Getter
  public double totalSimpleInterestAfterYears1(){
    return BigDecimal.valueOf(this.principle)
    .multiply(BigDecimal.valueOf(this.annualInverestRate))
    .multiply(BigDecimal.valueOf(this.numOfYears))
    .doubleValue();
  }

  public double totalCompoundInterestAfterYears1(){
    return BigDecimal.valueOf(this.principle)
    .multiply(BigDecimal.valueOf(
      (Math.pow((1.0 + this.annualInverestRate / 100.0), this.numOfYears)))
    .subtract(BigDecimal.valueOf(this.principle)))
    .doubleValue();
  }

  public static double totalSimpleInterestAfterYears2(double principle, double annualInverestRate, int numOfYears){
    return BigDecimal.valueOf(principle)
    .multiply(BigDecimal.valueOf(annualInverestRate))
    .multiply(BigDecimal.valueOf(numOfYears))
    .doubleValue();
  }

  public static double totalCompoundInterestAfterYears2(double principle, double annualInverestRate, int numOfYears){
    return BigDecimal.valueOf(principle)
    .multiply(BigDecimal.valueOf(
      (Math.pow((1.0 + annualInverestRate), numOfYears))))
    .subtract(BigDecimal.valueOf(principle))
    .doubleValue();
  }

  public static void main(String[] args){
    LoanCalculator l1 = new LoanCalculator(10000, 4, 5);
    System.out.println(l1.totalCompoundInterestAfterYears1());

    System.out.println(LoanCalculator.totalSimpleInterestAfterYears2(10000, .04, 1));
    System.out.println(LoanCalculator.totalCompoundInterestAfterYears2(10000, .04, 5));

  }

}
