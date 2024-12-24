import java.math.BigDecimal;

public class Item {
  //Attributes
  private String product;
  private double price;
  private int quantity;


  //Constructor
  public Item (String product, double price, int quantity){
    this.product = product;
    this.price = price;
    this.quantity = quantity;
  }


  //Getter
  public String getProduct(){
    return this.product;
  }

  public double getPrice(){
    return this.price;
  }

  public int getQuantity(){
    return this.quantity;
  }
  

  //Setter
  public double totalAmount(){
    return BigDecimal.valueOf(this.price)
    .multiply(BigDecimal.valueOf(this.quantity))
    .doubleValue();
  }
  
  public static void main(String[] args){
    Item i1 = new Item("diamond", 8888.8, 9);
    Item i2 = new Item("jade", 333.3, 28);

    System.out.println(i2.totalAmount());

  } 





}
