import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
