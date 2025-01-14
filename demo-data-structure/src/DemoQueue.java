import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    //FIFO; Add last, remove first
    Queue<String> strings = new LinkedList<>(); //linkedlist: add/remove head/tail
    strings.add("Oscar"); //add Last
    strings.add("Vincent"); //add Last
    strings.add("Lucas"); //add Last
    System.out.println(strings); //[Oscar, Vincent, Lucas]

    //拉走1st
    String head = strings.poll(); //remove first only, similar to remove() 
    System.out.println(head); //Oscar
    System.out.println(strings); //[Vincent, Lucas]


    //Queue Interface hidden lots of funtions of LinkedList
    //strings.removeLast
   //strings.removeFirst = poll
    strings.remove(); //similar to poll()

    //contains()
    System.out.println(strings.contains("Lucas"));//true...base on for loop

    //lookup the head element only, not pick up
    //peek()
    System.out.println(strings.peek()); //Lucas
    System.out.println(strings.size()); //1

    //ArrayBlockingQueue
    //offer() ~ size
    strings.offer("Jenny");
    Queue<String> qq = new ArrayBlockingQueue<>(3); //控制長度係3  , fixed length's queue
    System.out.println(qq.offer("ABC")); //true
    System.out.println(qq.offer("ijk")); //true
    System.out.println(qq.offer("def")); //true
    System.out.println(qq.offer("xyz")); //false, as more than length 3
    String qqq = qq.poll();
    System.out.println(qq);

    //for-each support Queue
    //contains --> equals
    for (String s : strings){
      System.out.println(s); 
    }

    //
    List<String> newStrings = new ArrayList<>()
    newStrings.add("aaa");
    newStrings.add("bbb");
    strings.addAll(newStrings);
    System.out.println(strings); //[Lucas, Jenny, aaa, bbb]




  }

}
