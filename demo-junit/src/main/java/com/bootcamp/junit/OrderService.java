package com.bootcamp.junit;

// Person has name and age....dependance
public class OrderService { //OrderService(p1) manage PaymentService(p2) & inventoryService(p3), can share the things to earh other
  private PaymentService paymentService; //冇任何參數
  private InventoryService inventoryService;

  // ! Dependency  Injection (for Spring)
  public OrderService(PaymentService paymentService, InventoryService inventoryService){
    this.paymentService = paymentService;
    this.inventoryService = inventoryService;
  }


  // ! unit test
  // 1. stock <= 0 -> throw
  // 2. pay() -> true, deductStock() -> true
  // 3. pay() -> false, deductStock() -> true
  // 4. pay() -> true, deductStock() -> false
  // 5. pay() -> false, deductStock() -> false
  
  public boolean order(){
    if(this.inventoryService.checkAvailableStock() <= 0) // how about when it is 0
      throw new IllegalStateException();
    return this.paymentService.pay() //return new PaymentService.pay() ....mock 就冇用了, 即係分離唔到
        && this.inventoryService.deductStock();
  }

  public static void main(String[] args) {
    PaymentService ps = new PaymentService();
    InventoryService is = InventoryService.getInstance(); //new InventoryService()
    OrderService os1 = new OrderService(ps, is);
    OrderService os2 = new OrderService(ps, is);


    
  }

}
