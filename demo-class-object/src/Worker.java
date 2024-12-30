public class Worker {
  //Attributes
  //private String gradingOfWorker;
  //private String deptOfWorker;
  //private int nums;

  private Supermarket supermarket;

  private static int workerCount = 0;  //公家地方


  //Constructor
  //public Worker(String gradingOfWorker, int nums){
  //  this.gradingOfWorker = gradingOfWorker;
  //  this.nums = nums;
  //}

  public Worker(Supermarket supermarket){
    this.supermarket = supermarket;
    Worker.workerCount++;
  }

  
  //Setter
  public void moveIn(int quantity){
    supermarket.setAvailableStock(supermarket.getAvailableStock() + quantity);
  }

  public void moveOut(int quantity){
    supermarket.setAvailableStock(supermarket.getAvailableStock() - quantity);
  }

  
  //Getter
  //if read private static variable, we should use a static method
  public static int getWorkCount(){
    return Worker.workerCount;
  }

}
