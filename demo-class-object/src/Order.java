import java.math.BigDecimal;

public class Order {
 //Attributes
  private long saleid;
  private Item[] items;


  //Constructor
  public Order(long saleid){
    this.saleid = saleid;
    this.items =  new Item[0];
  }


  //Getter
  public long getSaleId(){
    return this.saleid;
  }

  //Setter
  public void placeItem(Item item){
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++){
      newItems[i] = this.items[i];
    }
    newItems[this.items.length - 1] = item;
    this.items = newItems;
  }

  totalOrderAmount = totalAmount[i]++;

  
   


  public static void main(String[] args){
    Order o1 = new Order(11L);

    System.out.println();


  }
  


}
