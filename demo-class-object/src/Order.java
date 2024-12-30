import java.math.BigDecimal;

public class Order {
 //Attributes
  private long orderId;
  private Item[] items;  //address or reference (item[] array) , defort null


  //Constructor
  public Order(long orderId){
    this.orderId = orderId;
    this.items = new Item[0];
  }


  //Getter
  public long getOrderId(){
    return this.orderId;
  }

  public Item[] getItems(){
    return this.items;
  }

  ///Order order = new Order(items);
  ///order.totalOrderAmount();
  public double totalOrderAmount(){//order.totalOrderAmount()
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Item item : items){
      total = total.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return total.doubleValue();
  }


  //Setter
  public void addItem(Item item){ //冇length (?)
    Item[] newArr = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++){
      newArr[i] = this.items[i];
    }
    newArr[newArr.length - 1] = item;
    this.items = newArr;
  }

  public void removeItem(Item item){ //resize array,, i.e. -1
    int idx = 0;
    int countTarget = 0;
    Item[] newArr = new Item[this.items.length - 1];
    for (int i = 0; i < this.items.length; i++){  //this.items: Item array object....verrrry important!!...s = array
      if (this.items[i].equals(item) && countTarget == 0){ //this.items[i]: Item Object....verrrry important!!
        countTarget++; //要count左先
        continue;
      newArr[idx++] = this.items[i]; //cant use i , plx use idx , so can fill fully
    }
    this.items = newArr;
  }



  
   


  public static void main(String[] args){
    Order o1 = new Order(11L);

    System.out.println();


  }
  


}
