//Generics Design (after java 5, reduce number of class)
public class GeneralPrinter<T> {  //<T>: present the scope of "T" inside the class
  private T value;


  public GeneralPrinter(T value){
    this.value = value;
  }


  public T getValue(){
    return this.value;
  }


  public String print(){
    return "this is " + this.value.toString();  //becos of strong-type  
    //return (String) this.value;  //can complie but die very urgy
  }

  public static void main(String[] args){
    GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));

    //integer object...ultimate parent
    //below is the uncorrect example:
    GeneralPrinter<Object> printer2 = new GeneralPrinter<>(Integer.valueOf(3));
    GeneralPrinter<Object> printer3 = new GeneralPrinter<>(new Book("ABB"));
    Object obj = 3;
    if (obj instanceof Integer){ //safety concern
      Integer integer = (Integer) obj;
      System.out.println(integer.compareTo(3));//true
    }


    
  }
}
