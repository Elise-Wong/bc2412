import java.util.Comparator;
import java.util.PriorityQueue;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class DemoPQ{

  //another class
  public static class Person{
    //attributes
    private int age;

    //constructor
    public Person(int age){
    this.age = age;
    }

    //getter
    public int getAge(){
      return this.age;
    }

    public boolean isElderly(){
      return this.age > 65;
    }

    //setter
    public void setAge(){
      this.age = age;
    }

      //another class
      public static class SortByAge implements Comparator<DemoPQ.Person>{ //static!!!!
        @Override
        public int compare(Person p1, Person p2){
        return p1.getAge() > p2.getAge() ? -1 : 1;
        }
      }

      //another class
      public static class SortByElderly implements Comparator<DemoPQ.Person>{ //static!!!!
        @Override
        public int compare(Person p1, Person p2){
        //Early Return
        if (p1.isElderly())
          return  -1;
        if (p2.isElderly())
          return 1;
        return -1; //base return
        }
      }

  //back class
  @Override
   public String toString(){
      return "Person["
            + "age=" + this.age
            + "]";
  }


  public static void main(String[] args){
    //Queue
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq);//[Vincent]
    pq.add("Oscar");
    System.out.println(pq);//[Oscar, Vincent]
    pq.add("Lucas");
    pq.add("efg");
    System.out.println(pq);//[Lucas, Vincent, Oscar]...no ordering
    System.out.println(pq.size());//3

    //add & print 是無序; poll是順序

    //For poll(), ordering becomes String nature order...L, O, V
    System.out.println(pq.poll());//Lucas
    System.out.println(pq.poll());//Oscar
    System.out.println(pq.poll());//Vincent
    System.out.println(pq.poll());//efg

    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    pq2.add(new Person(12));
    pq2.add(new Person(21));
    pq2.add(new Person(68));
    System.out.println(pq2);
    //may overuse for PQ in poll...is so painful
    System.out.println(pq2.poll());
    





  }

}
}