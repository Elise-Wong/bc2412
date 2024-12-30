public class Supermarket {
  private int availableStock;




  //construtor
  public Supermarket(int availableStock){
    this.availableStock = availableStock;
  }


  //Getter
  public int getAvailableStock(){
    return this.availableStock;
  }


  //static
  public void setAvailableStock(int availableStock){
    this.availableStock = availableStock;
  }

  //too long to write!
  public static void move(Supermarket from, Supermarket to, Worker worker, int quantity, boolean isMoveIn){

  }
  //public void moveIn(int numOfStock){
  //  this.availableStock += numOfStock;
  //}

  //public void moveOut(int numOfStock){
  //  this.availableStock -= numOfStock;
  //}

  public static void main(String[] args){

    //this class is for Multiple supermarkets (多間分店)
    Supermarket s1 = new Supermarket(0);
    //s1.moveIn(10); //10
    //s1.moveIn(13); //23
    //s1.moveOut(4); //19


    Worker worker1 = new Worker(s1);
    Worker worker2 = new Worker(s1);
    worker1.moveIn(30);
    worker2.moveOut(4);
    System.out.println(Worker.getWorkCount());


    //Single Supermarket scienario

  }

}
