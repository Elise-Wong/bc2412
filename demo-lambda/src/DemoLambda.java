import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {

  public static void main(String[] args){

    //Function Interface
    //define function***, similiar to method
    //s = input
    //s.length() = output
    //runtime run once only
    Function<String, Integer> stringLength = s -> s.length();// stringLength = functionanme; skip "return" keyword
    System.out.println(stringLength.apply("hello"));//5; becose Function included apply

    stringLength = s -> s.length() + 10;

    //2 input, 1 output
    //input: (String, String) s1 & s2
    //output: Integer
    BiFunction<String, String, Integer> totalLength = (s1, s2) -> s1.length() + s2.length();
    System.out.println(totalLength.apply("oscar", "lucas"));//10

    //SuperFunction (Interface): 3 input, 1 output
    //ref: BiFunction
    SuperFunction<Integer, Integer, Integer, Integer> ans = (a1, a2, a3) -> a1 * a2 * a3;
    System.out.println(ans.apply(3,6,9)); //162

    SuperFunction<String, String, String, Integer> formula = (s1, s2, s3) -> {
      int result = s1.length() + s2.length() + s3.length();
      return result;
      };
    System.out.println("*" + formula.apply("abc", "", "ppp")); //*6

    //Consumer*** / 0 input , given by Java
    Consumer<String> printString = s -> System.out.println("The String is " + s);
    printString.accept("hello"); // The String is hello
    printString.accept("goodbye"); // The String is goodbye

    //Supplier, given by Java
    Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1; // ():冇參數
    System.out.println(randomMarkSixNumber.get());

    //Custom FunctionInterface, e.g. Swimable
    //Java before 8: Interface -> Class -> Object
    //Java after 8: Interface -> object (no more constructor)
    Swimable lucas = () -> System.out.println("Lucas is swimming");
    lucas.swim(); //Lucas is swimming

    //Lambda Limitation
    //FunctionalInterface --> one method only --> lambda expression

    //MathOperation: method breation //開少D class
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtract = (x, y) -> x - y;
    MathOperation product = (x, y) -> x * y;
    MathOperation div = (x, y) -> x / y;
    System.out.println(addition.operate(1,2)); //3
    System.out.println(subtract.operate(1,2)); //-1
    System.out.println(product.operate(1,2)); //2
    System.out.println(div.operate(2,2)); //1

    //Book
    List<Book> books = new ArrayList<>();
    books.add(new Book(1));
    books.add(new Book(1));
    books.add(new Book(10));
    books.add(new Book(12));
    for (Book book : books){
      System.out.println(book.getId());
    }
    books.forEach(b -> System.out.println(b.getId())); 
    //for loop is Consumer, so forEach is Consumer

    //one than 1 line, more modern to present
    books.forEach(b ->{  //{}內的 function, method
      String message = "hello";
      System.out.println(b.getId() + " " + message);
    });

    Map<String, String> fruitMap = new HashMap<>();
    fruitMap.put("orange", "abc");
    fruitMap.put("apple", "abc");
    //(key, value) -> {}
    fruitMap.forEach((key, value) -> {
      System.out.println("Key=" + key + ", value=" + value);
      }); // Key=orange, value=abc, Key=apple, value=abc


    //Predicate***
    //x>8 -> boolean (is ans)
    //x -> x > 8 -> Predicate(formula only, no ans)
    //support and, or
    int x1 = -1;
    boolean isLargeThanEight = x1 > 8;
    System.out.println(isLargeThanEight); //false

    Predicate<Integer> isLargeThan8 = x -> x > 8;
    System.out.println(isLargeThan8.test(9)); //true
    System.out.println(isLargeThan8.test(8)); //false


    //check if the integer is even number
    Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
    System.out.println(isLargeThan8.and(isEvenNumber).test(10));//true
    System.out.println(isLargeThan8.or(isEvenNumber).test(9));//true
    System.out.println(isEvenNumber.test(9)); //false

    //remove book when sth ok
    System.out.println(books.size()); //4
    books.removeIf(book -> book.getId() % 2 == 1);
    System.out.println(books.size()); //2

    //merge....better use for default value
    BiFunction<String, String, String> appendHello = (s1, s2) -> s1 + s2; //(oldValue, NewValue)
    fruitMap.merge("lemon", "xyz", appendHello);
    fruitMap.merge("apple", "mmo", appendHello);
    fruitMap.merge("orange", "yyy", appendHello);
    System.out.println(fruitMap); //{orange=abcyyy, apple=abcmmo, lemon=xyz}


    //
    //HashSet<String> 
    //set function as biFunction primitor

    //UnaryOperator<String> -> Function<String, String>
    //收窄
    UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
    System.out.println(toUpperCase.apply("Hello!")); //HELLO!

    UnaryOperator<String> transform = s -> {
      if (s.length() > 5){
        return s.substring(0, 5); //體驗了runtime 都可以寫既code
      } else{
        if (s.startsWith("a")){
          return "wrong string.";
        }
        return s;
      }
    };
    System.out.println(transform.apply("abcdef"));//abcde
    System.out.println(transform.apply("abcde"));//wrong string.
    System.out.println(transform.apply("edcba"));//edcba



  }
//out ot main

  //function or method, similar to Function.class
  //compile time run many time
  public static Integer stringLength(String s){
    return s.length();
  }

  //similar to Consumer.class (only eat/input); so use void
  public static void printString(String s){
    System.out.println("The String is " + s);
  }

  //similar to Supplier.class (only output)
  public static int randomMarkSixNumber(){
    return new Random().nextInt(49) + 1; //1 to 49
  }

  //another class
  public static class Book{
    private int id;

    public Book(int id){
      this.id = id;
    }

    public int getId(){
      return this.id;
    }
  }



}
