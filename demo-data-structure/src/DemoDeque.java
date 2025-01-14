import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
  public static void main(String[] args) {
    //get some comment for using Deque as below: e.g.場景
    Deque<String> strings = new LinkedList<>();
    strings.add("Lucas"); //addLast, add tail
    strings.add("Vincent");
    strings.add("Oscar");
    strings.addFirst("Jenny"); //打尖
    System.out.println(strings); //[Jenny, Lucas, Vincent, Oscar]

    System.out.println(strings.poll());//Jenny; pollFirst()
    System.out.println(strings.pollLast());//Oscar

    System.out.println(strings.peek());//Lucas; peekFirst
    System.out.println(strings.peekLast());//Vincent

    //support for loop
    //support remove
    //contains

    //Practice ArrayDeque
    ArrayDeque<String> ss2 = new ArrayDeque<>();
    Deque<String> ss3 = new ArrayDeque<>(); //Deque has wider scope (i.e. add/remove/poll/peek first & last)
    //ss2 = new LinkedList<>();

    Queue<String> ss4 = new ArrayDeque<>();


    Queue<String> ss5 = null;
    //ss3是為了解底層
    int x = 3;
    if (x > 2){
      ss5 = new ArrayDeque<>();
      } else{
        ss5 = new LinkedList<>();
      }
    

    //ss3.poll(); //difference implimentations -> performance according to scenario.
    

    


  }
}
