public abstract class Account {
  //private char type;
  private int id;
  private Currency currency;
  private double balance;
  

  //construtor
  public Account(Currency currency, double balance){
    //this.type = type;
    this.currency = currency;
    this.balance = balance;
  }


  //getter
  ///public char getType(){
  ///  return this.type;
  ///}

  public Currency getCurrency(){
    return this.currency;
  }

  public double getBalance(){
    return this.balance;
  }

  //substring 1000--> 1,000
  public String getBalanceDesc(){
    return this.currency.name() + this.balance; //HKD100.0
  }


  //setter



  public static void main(String[] args) {
    
    Ball b1 = new Ball(Color.BLUE);
    b1.number = 3;
    System.out.println(b1.number);//3



  }
}
