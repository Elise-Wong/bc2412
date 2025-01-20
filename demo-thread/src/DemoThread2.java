import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
  //private int x; //Primitive (not thread-safe)
    //解決開門關門
  private AtomicInteger x = new AtomicInteger(0); //Primitive (thread-safe)


  public int getX(){
    //return this.x;
    return this.x.get();
  }

  public void addOne(){
    //this.x++;
    this.x.getAndIncrement(); //blocked by key
  }

  public static void main(String[] args) {
    DemoThread2 place = new DemoThread2();
    place.addOne();
    System.out.println(place.getX());

    DemoThread2 central = new DemoThread2();
    Runnable placeAddoneTask = () -> central.addOne();

    Runnable placeAddMillionTask = () -> {
      for (int i = 0; i < 1_000; i++){
      central.addOne();
      }
    };


    Thread workerB = new Thread(placeAddMillionTask); //placeAddoneTask
    workerB.start();

    Thread workerC = new Thread(placeAddMillionTask);
    workerC.start();


    try{
      workerB.join(); //main thread wait untill workerB complete the task
      workerC.join(); //main thread wait untill workerC complete the task
    } catch (InterruptedException e){
    }


    System.out.println(central.getX()); //
    // 18xxxxx(likely/not certain), when Primitive (not thread-safe)



  }

}
