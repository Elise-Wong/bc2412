import java.util.function.Function;

//Function (Java Built-in interfance)
public class StringLengthFunction implements Function<String, Integer> {
  @Override
  public Integer apply(String s){
    return s.length();
  }

  public static void main(String[] args){

    //Traditional Class & Interface
    StringLengthFunction slf = new StringLengthFunction();
    System.out.println(slf.apply("hello"));//5

    //Lambda Expression (runtime define formula)
    Function<String, Integer> stringLength = s -> s.length();// sringLength = functionanme
    System.out.println(stringLength.apply("hello"));//5

  }

}
