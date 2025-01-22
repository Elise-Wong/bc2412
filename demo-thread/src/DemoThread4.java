import java.util.ArrayList;
import java.util.Vector;
//Soluction
//1.	Native data structure(Vector)
public class DemoThread4 {
  private Vector<Integer> integers;

  public DemoThread4(){
    this.integers = new Vector<>(); //polymorphism: Stack, Vector, ArraryList, LinkedList
  }

  //public ArrayList<Integer> getIntegers(){
  //  return this.integers;
  //}

  public synchronized boolean add(Integer integer){
    //this.integers.contains(2);  //lock the Vector
    return this.integers.add(integer); //lock the line of code
  }

  //public synchronized void addOne(){ //synchronised void ...someone would write that
  //  this.integers.add(1);
  //}

  public int size(){
    return this.integers.size();
  }

  public static void main(String[] args) {

    //ArrayList<Integer> i1 = new ArrayList<>();
    //i1.add(123);
    //i1.add(123);
    DemoThread4 i1 = new DemoThread4();
    //System.out.println(i1.getIntegers());

    Runnable placeAddTenTask = () -> {
      for (int i = 0; i < 1_000_000; i++){
      i1.add(i);
      }
    };


    Thread workerB = new Thread(placeAddTenTask);
    workerB.start(); //main thread to execute another thread; main thread initialize another thread (workerB) to execute the task.
    //the workerB execute the task only.

    Thread workerC = new Thread(placeAddTenTask);
    workerC.start(); 

    //main thread
    try{
      workerB.join();//wait until workerB complete the task
      workerC.join();//wait until workerC complete the task
    } catch (InterruptedException e){
    }


    System.out.println(i1.size());
    




  }

}
