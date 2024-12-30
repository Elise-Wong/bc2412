import java.math.BigDecimal;

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



  //Getter
    public long getId(){
      return this.id;
    }


    public int orderSize(){ //getOrders..order object  -->  order array(?)
      return this.orders.length;
    }


    public Item[] getItem(long orderId){  //order id -->item
      for (Order order : this.orders){
        if (order.getOrderId() == orderId){
          return order.getItems();
        }
      }
      return new Item[0];  //or return null
    }
  

    public Order[] getOrders(){ //getOrders
      return this.orders;
    }

    public double getTotalOrderAmount(long orderId){  //totalOrderAmount
      for (Order order : this.orders){
        //System.out.println(order.getOrderId() + "  aadadasdadadadasd" + order.totalOrderAmount());
        if (order.getOrderId() == orderId){
          return order.totalOrderAmount();
        }
      }
      return -1.0;
    }
  

    public boolean isVip(){ //isVip:100_100
     BigDecimal total = BigDecimal.valueOf(0.0);
      for (Order order : this.orders){
        total = total.add(BigDecimal.valueOf(order.totalOrderAmount()));
      }
      return total.doubleValue() >= 100_100.0;
    }
     


  //Setter
    public void placeOrder(Order order){
      Order[] newOrders = new Order[this.orders.length + 1];  //+1係為左之後-1
      for (int i = 0; i < this.orders.length; i++){
        newOrders[i] = this.orders[i];
      }
      newOrders[newOrders.length - 1] = order; //-1去到最後1格
      this.orders = newOrders;
    }

    //totalOrderAmount 係由好多張sale order (totalAmount) 組成


  public static void main(String[] args){
    //create customer object & them, write down the "address" into c1.
    Customer c1 = new Customer(1l);


    Item i1 = new Item("diamond", 8888.8, 10);
    Item i2 = new Item("jade", 333.3, 28);
    Item i3 = new Item("pearl", 66.6, 72);
    Item i4 = new Item("pearl", 66.6, 10);

    Order o1 = new Order (11L);
    o1.addItem(new Item("ABC", 5.4, 5));
    o1.addItem(new Item("DEF", 1.3, 3));
    c1.placeOrder(o1);

    Order o2 = new Order(12L);
    o2.addItem(new Item("IJK", 1.0, 2));
    o2.addItem(new Item("LLL", 2.0, 3));
    c1.placeOrder(o2);

    Order o3 = new Order(13L);
    o3.addItem(new Item("KKK", 1.2, 2));
    o3.addItem(new Item("JJJ", 2.2, 3));
    c1.placeOrder(o3);

    System.out.println(i2.totalAmount());




    
    System.out.println(c1.orderSize()); //3
    System.out.println(c1.getTotalOrderAmount(2L));
    System.out.println(c1.isVip()); //false


    Order o4 = new Order(14L);
    o4.addItem(new Item("AAA", 100.2, 2000));
    c1.placeOrder(o4);
    System.out.println(c1.isVip()); //true



    //c1.getOrders --> Order[]
    //so, getOrders[0] --> Order
    //so, getOrders[0].getItems() --> Item[]
    //so, getOrders[0].getItems()[1] --> Item
    //so, getOrders[0].getItems()[1].getPrice() --> double
    System.out.println(c1.getOrders()[0].getItems()[1].getPrice());  //1.3
    System.out.println(c1.getOrders()[0].getItems()[1].totalAmount());  //3.9=(1.3*3)
    System.out.println(c1.getOrders()[0].totalOrderAmount());  //30.9
    System.out.println(c1.getTotalOrderAmount(11));  //30.9...11 is integer...long to int is upgrading, so "11" is ok, no need "11L"

    


  }

}
