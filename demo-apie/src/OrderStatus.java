public enum OrderStatus {
  PAID(1),
  READY_FOR_SHIP(2),
  DELIVERING(3),
  DELIVERED(4),
  ;

  //attribute 
  private final int step;
 
  
  //construtor
  private OrderStatus(int step){
    this.step = step;
  }
  
  
  //getter
  public int getStep(){
    return this.step;
  }
  
  
  //DELIVERED.next() -> null
  public OrderStatus next(){
    for (OrderStatus o : values()){
      if (o.step == this.step + 1){
        return o;
      } 
    }
    return null;
  }


  public static void main(String[] args) {
    System.out.println(OrderStatus.PAID.next()); //toString()
    System.out.println(OrderStatus.PAID.name()); 
    System.out.println(DELIVERED.next());

    System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID); //true
    //System.out.println(OrderStatus.valueOf("Paid") == OrderStatus.PAID); //java.lang.IllegalArgumentException


  }

}
