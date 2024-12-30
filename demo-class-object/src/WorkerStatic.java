public class WorkerStatic {
  //Attribute (can be public)
  public WorkerStatic(){
  }

  //Getter-Static
  public void moveIn(int quantity){
    SupermarketStatic.availableStock += quantity;
  }

  public void moveOut(int quantity){
    SupermarketStatic.availableStock -= quantity;
  }

  //Getter-Instance
  public int checkStockQuantity(){
    return SupermarketStatic.availableStock;
  }


  public static void main(String[] args){
    WorkerStatic w1 = new WorkerStatic();
    w1.moveIn(100);
    w1.moveOut(23);
    System.out.println(w1.checkStockQuantity());

  }

}
