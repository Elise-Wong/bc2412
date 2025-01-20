public class DemoThread3 {
  private String x;  //if no constructor, private String x = "";

  public DemoThread3(){
    this.x = "";
  }

  public String getX(){
    return this.x;
  }

  //solution for String (synchoronised)
  //lock the door for method addA()
  public synchronized void addA(){ //public void addA(){....before solutiopn
    this.x += "A"; //immutable
  }

  public static void main(String[] args) {
    DemoThread3 central = new DemoThread3();
    Runnable concatATask = () -> {
      for (int i = 0; i < 10; i++){
        central.addA();
      }
    };

    Thread workerB = new Thread(concatATask);
    workerB.start();

    Thread workerC = new Thread(concatATask);
    workerC.start();

    try{
      workerB.join(); //main thread wait untill workerB complete the task
      workerC.join(); //main thread wait untill workerC complete the task
    } catch (InterruptedException e){
    }
    System.out.println(central.getX());


  }
}
