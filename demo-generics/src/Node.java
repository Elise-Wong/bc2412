public class Node {
  //attributes
  private Node node; ///attribute 自己; address; the next node's address
  private int value;
  

  //constructor
  public Node(Node node, int value){
    this.node = node;
    this.value = value;
  }

  //empty constructor
  public Node(){
  }

  public Node(Node node){
    this.node = node;
  }

  public Node(int value){
    this.value = value;
  }


  //getter
  //public Node getNode(){ = next
  public Node next(){
    return this.node;
  }

  public int getValue(){
    return this.value;
  }


  //setter
  //you are setting the next node to the current node
  public void setNode(Node node){
    this.node = node;
  }


  public static void main(String[] args) {
    //3 objects
    ///Node head = new Node(new Node(new Node(null))); //if not call it (null), it would not 爆
    Node head = new Node(40);
    Node node2 = new Node(50);
    head.setNode(node2);
    Node node3 = new Node(60);
    node2.setNode(node3); //node3's next is null
    node3.setNode(new Node(70)); //lost address of "new Node(70)" 
    System.out.println(node3.getValue()); //60 , missing "new Node(70)" 
    System.out.println(node3.next().getValue()); //70

    //LinkList 通常用while loop
    //very important!!
    Node temp = head; //保存head, backup head
    while (temp != null){ //can i exit here? yes
      System.out.println(temp.getValue()); //40,50,60,70
      temp = temp.next();
    }

    //for (Node node : nodes) , cant use for-earch in Node.class

    
    

    //array vs linkedlist/looplist
    //array is fixed length
    //arraylist 係1條殺, 然後係第2條開, 殺再開, 係memeory內產生波動, 好波動
    //linkedlist 
    //language vs memory storage 方式不同, what 場境用邊個data structure (how)


  }

}
