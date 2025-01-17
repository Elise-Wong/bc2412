import DemoLambda.Book;

public class ArrayList1<T> {
  private T[] values;


  public ArrayList1(){
    this.values = (T[]) new Object[0];
  }
  
  public void clear(){
    this.values = (T[]) new Object[0];
    // this.values = null; //not good
  }

  public boolean add(T value){ //public void add(T value){
    //如果不能加重覆; 
    //何謂重覆, 要自己定義...equals
    for (int i = 0; i < this.values.length; i++){
      if (this.values.equals(value))
        return false;
    }

    //以下是正常add
    T[] newValues = (T[]) new Object[values.length + 1];

    for (int i = 0; i < this.values.length; i++){ // for (T t : this.values)  is a bit difficult
      newValues[i] = this.values[i];
    }
    newValues[newValues.length - 1] = value;
    this.values = newValues;
    return true;
  }

  public int size(){
    return this.values.length;
  }

  public static void main(String[] args) {
    ArrayList1<Book> books = new ArrayList1<>();
    books.add(new Book("ABC"));
    books.add(new Book("IJK"));
    System.out.println(books.size()); //2
  }
}
