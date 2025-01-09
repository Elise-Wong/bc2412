public class Calculator<T extends Number> { //Byte, Short, Integer, Long, Float, Double
  //if we achieve the same purpose without generics,
  // ByteCalculator.class
  // ShortCalculator.class
  // IntegerCalculator.class
  // LongCalculator.class
  // FloatCalculator.class
  // DoubleCalculator.class
  // NumberCalculator.class**
  private T x;
  private T y;


  public Calculator(T x, T y){
    this.x = x;
    this.y = y;
  }


  //allow overflow
  public Number sum(){ //Short is hardly to upgrade to Long: (short) Short -> long -> Long
    if (this.x instanceof Byte && this.y instanceof Byte){
      return (byte) this.x + (byte) this.y; //(byte) +(byte) = int -->Integer
      //with x & y !>= 128 || !< -127
    } else if (this.x instanceof Short && this.y instanceof Short){
      return (Short) this.x + (Short) this.y;
    } else if (this.x instanceof Integer && this.y instanceof Integer){
      return (Integer) this.x + (Integer) this.y;
    } else if (this.x instanceof Long && this.y instanceof Long){
      return (Long) this.x + (Long) this.y;
    } else if (this.x instanceof Float && this.y instanceof Float){
      return (Float) this.x + (Float) this.y;
    } else if (this.x instanceof Double && this.y instanceof Double){
      return (Double) this.x + (Double) this.y;
    } 
    
  }

  public static void main(String[] args) {

    Calculator<Byte> calculator = new Calculator<Byte>(Byte.valueOf("2"), Byte.valueOf("2"));

    //<Number> is Parent, 
    //private Number x;
    //private Number y;
    //not that easy
    Calculator<Number> calculator2 = new Calculator<>(Byte.valueOf("2"), Short.valueOf("20")); 


  }


}
