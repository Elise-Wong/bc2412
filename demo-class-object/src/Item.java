import java.math.BigDecimal;

public class Item {
  //Attributes
  private String product;
  private double price;
  private int quantity;

  //empty constructor
  public Item(){

  }


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
  

  //Setter - instance method
  public double totalAmount(){
    return BigDecimal.valueOf(this.price)
    .multiply(BigDecimal.valueOf(this.quantity))
    .doubleValue();
  }
  
  
  public static void main(String[] args){


  } 





}
