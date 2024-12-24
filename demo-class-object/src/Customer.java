public class Customer {
  //Attribute
  private long id;
  private Order[] orders;
  private String name;
  private int age;

  //Constructor
  public Customer(long id){
    this.id = id;
    this.orders = new Order[0];
  }

  public Item[] getItem(long orderId){  //order id -->item
    return(orderId); 
  }

  public double getTotalOrderAmount(long orderId){  //totalOrderAmount

  }

  public boolean isVip(){ //isVip:100_100
    double totalOrderAmount = 0;
    if (totalOrderAmount >= 100000){
      boolean isVip = true;
    } else {
      boolean isVip = false;
      return 
    }
  }

  //Getter
    public long getId(){
      return this.id;
    }

    public Order getOrders(){  //order object  -->  order array
      
      return this.orders;
    }

  //Setter
    public void placeOrder(Order order){
      Order[] newOrders = new Order[this.orders.length + 1];  //+1係為左之後-1
      for (int i = 0; i < this.orders.length; i++){
        newOrders[i] = this.orders[i];
      }
      newOrders[this.orders.length - 1] = order; //-1去到最後1格
      this.orders = newOrders;
    }

    //totalOrderAmount 係由好多張sale order (totalAmount) 組成


  public static void main(String[] args){
    Item i1 = new Item("diamond", 8888.8, 10);
    Item i2 = new Item("jade", 333.3, 28);
    Item i3 = new Item("pearl", 66.6, 72);
    Item i4 = new Item("pearl", 66.6, 10);

    Order o1 = new Order(11L, new Item[]{i1, i2});
    Order o2 = new Order(12L, new Item[]{i4});
    Order o3 = new Order(13L, new Item[]{i1, i2, i3, i4});

    System.out.println(i2.totalAmount());


    Customer c1 = new Customer(1l);
    c1.placeOrder(new Order());


    


  }

}
