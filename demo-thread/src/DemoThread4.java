import java.util.ArrayList;

public class DemoThread4 {
  private ArrayList<Integer> integers;

  public DemoThread4(){
    this.integers = new ArrayList<>();
  }

  public ArrayList<Integer> getIntegers(){
    return this.integers;
  }

  public synchronized void addOne(){
    this.integers.add(1);
  }

  public static void main(String[] args) {

    //ArrayList<Integer> i1 = new ArrayList<>();
    //i1.add(123);
    //i1.add(123);
    DemoThread4 i1 = new DemoThread4();
    System.out.println(i1.getIntegers());

    Runnable placeAddTenTask = () -> {
      for (int i = 0; i < 10; i++){
      i1.addOne();
      }
    };


    Thread workerB = new Thread(placeAddTenTask); //placeAddoneTask
    workerB.start();

    Thread workerC = new Thread(placeAddTenTask);
    workerC.start();

    try{
      workerB.join(); //main thread wait untill workerB complete the task
      workerC.join(); //main thread wait untill workerC complete the task
    } catch (InterruptedException e){
    }


    System.out.println(i1.getIntegers().size());
    




  }

}
