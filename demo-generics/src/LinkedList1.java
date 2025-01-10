public class LinkedList1 { //a list of integers, 做一個類似LinkedList既class
  //attributes
  private Node head; //first node, 因為value係Node內, 不用private int value


  //construtor
  public LinkedList1(){
  }


  //getter


  //setter
  //only have head and break it down
  public void add(int value){ //add to tail (must)
    //when head = null
    if (this.head == null){  //if constructor have "this.head" , 可以不加
      this.head = new Node(value);
      return;
    }

    Node first = head;
    while (first.next() != null) { // 第1粒既第2粒唔係null 就
      first = first.next();
    }
    first.setNode(new Node(value)); //the first one becomes last one
  }

  //Linkedlist 獨有的remove;
  public void remove(){ //remove the head node
    if (this.head == null){ //不一定要加
      return;               //不一定要加
    }                       //不一定要加
    this.head = this.head.next(); //冇左第1個, 既第2個即刻變第1個 //null pointer exception
  }

  //size
  public int size(){
    int count = 0;
    Node first = this.head;
    while (first != null){
      first = first.next();
      count++;
    }
    return count;
  }

  //toString
  @Override
  public String toString(){
    String str = "LinkedList1[";
    Node first = this.head;
    while (first != null){
      str += first.getValue() + ",";
      first = first.next();
    }
    return str.substring(0, str.length() - 1) + "]";  //for remove "," when the last one
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    System.out.println(ll.size());  //0
    ll.add(10);
    ll.add(20);
    System.out.println(ll.size());  //2

    ll.remove();
    System.out.println(ll.size());  //1
    ll.add(100);
    System.out.println(ll);  //LinkedList1[20,100]



  }

}
