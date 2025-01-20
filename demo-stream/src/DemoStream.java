import java.lang.StackWalker.Option;
import java.nio.file.OpenOption;
import java.text.Collator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.RuntimeErrorException;
import javax.print.DocFlavor.STRING;

public class DemoStream {
  public static void main(String[] args) {

    //traditional
    int[] arr = new int[]{1,2,3,4};
    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
    for (int integer : arr){
        System.out.println(integer);
    }

    //int[] Integer[], ArrayList<Integer> ...for save 整數
    //before java 8: for loop (list)
    //after java 8 (2014): Stream style: List --> Stream --> List
    //for loop + if
    List<Integer> integers = Arrays.asList(1,2,3,4);  //new ArrayList<>();
    List<Integer> newIntegers = integers.stream()//stream() = return Stream<Integer>
        .filter(e -> e % 2 == 0) //e: element; "e -> e % 2 == 0" is Predicate, setup formula
        //filter 保留
        .collect(Collectors.toList()); //always return new ArrayList

    System.out.println(integers); //[1, 2, 3, 4]
    System.out.println(newIntegers); //[2, 4]

    //Declare String array with some elements
    //filter string lenght > 5 & contain "a"
    List<String> strings = Arrays.asList("abcdef", "xyz");
    List<String> newStrings = strings.stream()
        .filter(e -> e.length() > 5 && e.indexOf('a') != -1) //e.contains("a") ; can be contains or indexOf
        .collect(Collectors.toList());
    System.out.println(strings); //[abcdef, xyz]
    System.out.println(newStrings); //[abcdef]

    //define a book list
    //filter book name contain "Herry" case incensitive
    List<Book> books = Arrays.asList(new Book("Harry Potter"), new Book("Welcome, Herry!"), new Book("HERRY"));
    //books.add(new Book("1984"));
    List<Book> newBooks = books.stream()
        //.filter(e -> "Herry".equalsIgnoreCase(e.getName())) //[Book[name=HERRY]] why?
        .filter(e -> e.getName().toUpperCase().contains("HERRY")) //出哂所有大小階的
        .collect(Collectors.toList()); //return new ArrayList<>()
    System.out.println(books); //[Book[name=Harry Potter], Book[name=Welcome, Herry!], Book[name=HERRY]]
    System.out.println(newBooks); //[Book[name=Welcome, Herry!], Book[name=HERRY]]

    //map()
    //change object type形態, but the quantity of element wont change
    //無敵狀態
    List<String> bookNames = books.stream().map(e -> e.getName()).collect(Collectors.toList());
    System.out.println(bookNames); //[Harry Potter, Welcome, Herry!, HERRY]

    //filter + map
    //for loop + if + re-structure
    List<String> newBookNames = books.stream()
        .filter(e -> e.getName().toUpperCase().contains("HERRY"))
        .map(e -> e.getName())
        .collect(Collectors.toList());
    System.out.println(newBookNames); //[Welcome, Herry!, HERRY]

    
    //for loop + if + procedures

    //filter + forEach
    books.stream()
        .filter(e -> e.getName().startsWith("W"))
        .forEach(e -> {
            System.out.println(e.getName()); //Welcome, Herry!
        });

   //convert 3 book names to 3 books
   List<String> bookNames2 = List.of("abc", "herry", "def");
   List<Book> newList = bookNames2.stream()
        .map(e -> new Book(e))
        .collect(Collectors.toList());
    System.out.println(newList); //


    //Stream sorted()
    //Collections.sort() + Comparator
    //Arrays.sort()
    int[] arr2 = new int[] {2,4,-1,1,-3}; 
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2)); //[-3, -1, 1, 2, 4]

    //Integer[] vs int[]; Integer vs int
    //not parent & child relationship
    //comparator with lambda
    Integer[] arr3 = new Integer[] {2,4,-1,1,-3}; 
    Arrays.sort(arr3, (i1, i2) -> i1 > i2 ? -1 : 1); //Lambda expression of Comparator
    System.out.println(Arrays.toString(arr3)); //[4, 2, 1, -1, -3]

    //Integer[] -> Stream<Integer>
    List<Integer> sortedInteger = Arrays.stream(arr3)
        .sorted((i1, i2) -> i1 > i2 ? -1 : 1)
        //.sorted() --> 由小至大
        .collect(Collectors.toList());
    System.out.println(sortedInteger); //[4, 2, 1, -1, -3]
        //忽略linear, this is nlogn

    List<Integer> sortedInteger2 = Arrays.stream(arr3)
        .filter(e -> e > 0)
        .sorted((i1, i2) -> i1 > i2 ? -1 : 1)
        //.sorted(Comparator.reverseOrder())...same
        .filter(e -> e < 4)
        //.map
        .collect(Collectors.toList());
    System.out.println(sortedInteger2); //[2, 1]


    
    //distinct(): remove duplicates ; --hashset
    //Fruit
    List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
    Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
    System.out.println(newFruits); //[orange, apple, lemon]

    List<String> newFruits2 = fruits.stream().distinct().collect(Collectors.toList());
    System.out.println(newFruits2); //[orange, apple, lemon]

    //what if List<Book> by distrinct()

    //.of()
    Stream.of("abc", "def");
    Stream<Book> books2 = Stream.of(new Book("abc"), new Book("def"));
    List<Book> books3 = books2.filter(e -> e.getName().contains("a"))
    .collect(Collectors.toList());
    System.out.println(books3);


    LocalDate d1 = LocalDate.of(2014, 10, 31); //本身隱藏了new
    String s = String.valueOf(123); //背後有new

    //empty
    Stream<String> ss = Stream.empty();
    System.out.println(ss);//0

    //Java 8: Optional is class 
    //1. targetBook never be null
    //2. targetBook is an Optional Object, so it can Optional method only
    //3. you have to check the content/body of Optional Object before using it.
    //4. isPresent() & ifPresent() are the ways to resolve Optional in safe mode.
    //5. never to resolve the Optional object by get() only, is unsafe

    Optional<Book> targetBook = Stream.of(new Book("abc"), new Book("def"))
        .filter(e -> "abc".equals(e.getName())).findFirst(); //find the 1st one
    System.out.println(targetBook);

    int x = 10;
//    if (targetBookBox.isPresent()){ //something like peek
//        Book targetBook = targetBookBox.get();
//        System.out.println(targetBookBox.getName()); //abc
//        System.out.println(x); //10
//        x = 100; //不能修改
//    }

    //similar to for-earch
//    targetBookBox.ifPresent(e -> {
//        System.out.println(e.getName()); //abc
//        System.out.println(x); //10
//    });

    //stream for-each
    //Stream 是封閉空間
    String name = "oscar";
    Stream.of(100, 120, 300).forEach(e ->{
        System.out.println(e); //300
        System.out.println(name); //oscar; //can read the name
        //but cannot write the name variable....limitation
        // x name = "abc"; //cant share variable
    });

    String name2 = "ok";
    for (Integer integer : Stream.of(100,120,300).collect(Collectors.toList())){
        System.out.println(integer);
        name2 = "ijk";
    }

    //Some other ways to resolve the Optional, and safe
//    Book targetBook2 = targetBookBox.orElse(new Book("DEFIJK"));

//    Book targetBook3 = targetBookBox.orElseThrow(() -> new RuntimeException("Book is not found"));

//    Book targetBook4 = targetBookBox.orElseGet(() -> new Book("DEFAULT")); //similar to orElse

    //of(), ofNullabl()
    String name3 = "ABC";
    Optional<String> os1 = Optional.of(name3); //of() 是有野, 一定不可以null //java.lang.NullPointerException
    String name4 = null;
    Optional<String> os2 = Optional.ofNullable(name4);//ofNullabl() 可冇可有野

    Optional<String> os3 = Optional.empty();
    if (os3.isPresent()){
        System.out.println(os3.get());
    } else {
        System.out.println("The String is Null.");
    }

    //Stream().order.sort()


   //1. Stream intermediate operation wont execute intself, until terminal operation.
   //2. Once the termianl operation executed, the stream object can no longer be used aga 
    Stream<Integer> integersLargerThanTen = 
        Stream.of(10, 100 -1).filter(e -> e > 10);
    System.out.println(integersLargerThanTen.count()); //1

    //integersLargerThanTen.collect(Collectors.toList());
    //runtime exception: stream has already been operated upon or closed

    //Intermediate operations: filter, map, distinct, count
    //Terminal Operations: collect(), count(), max(), min()

    Stream<Integer> plusOne = Stream.of(1,2,3)
        .map(i ->{  //map , so collect
            System.out.println("*" + i); //123
            return i +1;
    }); 
    List<Integer> plusOneList = plusOne.collect(Collectors.toList()); //234

    long count = plusOne.count();
    //because Java thinks map() doesnt change the result of count() 
    //soi it wont execute map(), when the terminal operation is count()
    System.out.println(count); //3
    





    


  }

  //out of main

  //another class - less fields
  public static class Book{
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "Book["
         + "name=" + this.name
         + "]";
    }
  }

  //another class - more fields
  public static class Book2{
    private String name;
    private double price;
    public Book2(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return "Book["
         + "name=" + this.name
         + ", price=$" + this.price
         + "]";
    }
  }

  //實際沒有static
  //Convert from List of Object A(more fields) to List of Object B(less fields)
  public static List<Book> getBookListForSearch(List<Book2> books){
    return books.stream()
        .map(e -> new Book(e.getName()))
        .collect(Collectors.toList());
  }

}
