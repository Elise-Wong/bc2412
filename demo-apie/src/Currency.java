public enum Currency {
  HKD("Hong Kong Dollar", 1),
  USD("US Dollar", 3),
  CNY("Chinese Yuan", 2),
  ;

  //attribute 
  private final String desc;  //cant change anymore
  private final int value;


  //constructor
  //private constructor in enum: becos not for others use
  private Currency(String desc, int value){
    this.desc = desc;
    this.value = value;
  }

  //getter
  public String getDesc(){
    return this.desc;
  }

  public int getValue(){
    return this.value;
  }


  public static String getDescription(Currency currency){
    ///before Java 14 的 switch
    //switch (currency){
    //  case HKD:
    //    return "Hong Kong Dollar";
    //  case USD:
    //    return "US Dollar";
    //  case CNY:
    //    return "Chinese Yuan Renminbi";
    //  default:
    //    return ""; // this is bug of java 13 or before

    if (currency == Currency.HKD){
      return "Hong Kong Dollar";
    } else if (currency == Currency.USD){
      return "US Dollar";
    } else if (currency == Currency.CNY){
      return "Chinese Yuan";
    } return "";
  }

  //ch18
  @Override
  public String toString(){
    return String.format("Currency [desc=%s]", this.desc);
  }


  public static void main(String[] args) {
    System.out.println(Currency.getDescription(Currency.USD)); //US Dollar

    System.out.println(Currency.CNY.getDesc()); //Chinese Yuan
    System.out.println(Currency.CNY.getValue()); //2

    Currency hkd = Currency.HKD;
    System.out.println(hkd.getDesc()); //Hong Kong Dollar

    Currency usd = Currency.USD;
    System.out.println(usd.getDesc() + " "+ usd.getValue()); //US Dollar 3


  }


}