import java.util.LinkedList;

  //last in first out
  //in: push
  //out: pop
public class MyStack<T> {
  private LinkedList<T> linkedList;


  public MyStack(){
    linkedList = new LinkedList<>();
  }

  public T pop(){
    return this.linkedList.pollLast();
  }

  public void push(T data){
    this.linkedList.addLast(data);
  }

  public static void main(String[] args) {
    MyStack<String> strings = new MyStack<>();
    strings.push("Abc");
    strings.push("def");
    System.out.println(strings.pop()); //def

    
  }

}
