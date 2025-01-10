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
    Deque<String> ss3 = new ArrayDeque<>();
    Queue<String> ss4 = new ArrayDeque<>();
    

    


  }
}
