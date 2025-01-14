import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    //contains(), add(), remove(Object obj), etc. are common method for ArrayList and LinkedList
    LinkedList<String> strings = new LinkedList<>(); //linkedlist + enter
    strings.add("ABC"); //add() belongs to Collection Family
    strings.add("DEF");
    strings.add("ABC");
    System.out.println(strings.size());
    strings.remove(0);
    System.out.println(strings);//[DEF, ABC]
    strings.remove("ABC");
    System.out.println(strings); //[DEF]
    strings.add("Oscar");
    strings.add("Jenny");
    strings.remove(); //remove the head
    System.out.println(strings);// [Oscar, Jenny]
    System.out.println(strings.contains("Jenny")); //true
    System.out.println(strings.contains("Vincent")); //false

    System.out.println(strings.isEmpty());//false

    for (String s : strings){
      System.out.println(s);
    }

    strings.clear();
    System.out.println(strings.size());//0


   //Because of Interface List, ss object can invoke/call add() at compile time.
   //During runtime, we fouind the object is LinkedList, so the add() will be LinkList one.

   //Polymorphism
   //List<Integer> ss = new ArrayList<>();
   List<Integer> ss = new LinkedList<>(); //唔打算remove, 才寫List
   ss.add(100);
   ss.add(1000);

    //ss.remove(); //Not OK for remove head
    //becos List Interface doesnt contain remove()
  
    ss.remove(1);
    System.out.println(ss); //[100]

    LinkedList<Integer> ss2 = (LinkedList<Integer>) ss; //強行做 ...not common to write like this
    //ss has risk as ss may be arraylist
    ss2.remove();

    //use another Parent class
    List<Animal> animals = new ArrayList<>();
    animals.add(new Tiger());
    animals.add(new Panda());
    for (Animal animal : animals) {
      System.out.println(animal.run());
    }
    
    




  }

}
