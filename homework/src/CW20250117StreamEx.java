import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CW20250117StreamEx {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> newNumbers = numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * e)
      //.sorted((i1, i2) -> i1 > i2 ? -1 : 1)
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
    System.out.println(newNumbers);
    // Output: [100, 64, 36, 16, 4]

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    List<String> newNames = names.stream()
      .filter(e -> e.startsWith("A"))
      .collect(Collectors.toList());
    System.out.println(newNames);
    // // Output: [Alice, Annie, Alex]

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);

    //Optional box可以放null
    //method 1
    Optional<Integer> box = numbers2.stream().max((e1, e2) -> e1 < e2 ? -1 : 1);
    int maxNum = Integer.MIN_VALUE;
    if (box.isPresent()){
      maxNum = box.get();
    }
    System.out.println("*" + maxNum);

    //orElse() to open the "box"
    int minNum = numbers2.stream().min((e1, e2) -> e1 < e2 ? -1 : 1).orElse(-1);
    System.out.println("*" + minNum);

    //method 2, ref: note
    Optional<Integer> MaxNumber2 = numbers2.stream()
      .max((o1, o2) -> o1.compareTo(o2));

    Optional<Integer> MinNumber2 = numbers2.stream()
      .min((o1, o2) -> o1.compareTo(o2));
    System.out.println("Max: " + MaxNumber2 + ", Min: " + MinNumber2);
    // Output: Max: 30
    // Output: Min: 5

    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    List<Integer> wordLengths = words.stream()
      .map(e -> e.length())
      .collect(Collectors.toList());
    System.out.println(wordLengths);

    Map<String, Integer> newWords = words.stream()
      //.map(e -> e.length())
      .collect(Collectors.toMap(s -> s, String::length));
    System.out.println(newWords);
    // Output: [5, 6, 4] (List)

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words5 = Arrays.asList("hi", "hello", "world", "java", "stream");
    
    //method 1
    List<String> countWords5 = words5.stream()
      .filter(e -> e.length() > 3)
      .collect(Collectors.toList());
    System.out.println(countWords5.size());

    //method 2
    ///count() : Terminal Operation 完結的寫法
    //similar to collect(), max(), min()
    long count = words5.stream()
      .filter(e -> e.length() > 3)
      .count();
    System.out.println(count);
    // Output: 4

    // Here are more advanced exercises focused on using filter, map, and collect to transform data into
    // different data structures:
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    Set<Integer> newNumbers3 = numbers3.stream()
      .filter(e -> e > 10)
      .collect(Collectors.toSet());
    System.out.println(newNumbers3); //20,15; List<>...toList() -> 15,20
    // // Output: [15, 20]

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    //Collectors.toMap()
    // new Student("Alice", 85)
    // new Student("Bob", 75)
    List<Student> students = Arrays.asList(
      new Student("Alice", 85), 
      new Student("Bob", 75)
      );

    //Java 9: List.of()**: you can read the objects but you cant add/remove/modify
    List<Student> java9Students = List.of(
      new Student("Alice", 85), 
      new Student("Bob", 75)
      );
    //java9Students.set(0, new Student("vic", 90)); //java.lang.UnsupportedOperationException
    //java9Students.get(0).setScore(80);//ok
    System.out.println(java9Students);

    Map<String, Integer> newStudents = students.stream() //java9Students 
      .collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getScore()));
    System.out.println(newStudents);

    // Output: {Alice=85, Bob=75}

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)
    List<Employee> employees = Arrays.asList(
      new Employee("John", 65000),
      new Employee("Jane", 55000),
      new Employee("Doe", 40000)
      );
    List<Employee> newEmployees = employees.stream()
      .filter(e -> e.getSalary() > 50000)
      .collect(Collectors.toList());
    System.out.println(newEmployees);

    //Map
    Map<String, Integer> result8 = employees.stream()
      .filter(e -> e.getSalary() > 50000)
      .collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getSalary()));
    System.out.println(result8);
    // Output: [John, Jane]

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
    List<Person> persons = Arrays.asList(
      new Person("Alice", 30),
      new Person("Bob", 25),
      new Person("Charlie", 30)
      );
    //Map<Integer, List<String>> ageGroup = persons.stream()
    //  .collect(Collectors.groupingBy(Person::getAge,
    //  Collectors.summingInt(Person::getAge)));



    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    //boolean

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    List<Integer> result11 = numbers4.stream()
      .filter(e -> e < 10)
      .collect(Collectors.toList());
    System.out.println(result11);
    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    // List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    // int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    // List<String> words = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    
    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);

    //findFirst(), findAny() --> return Optional
    
    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //limit(x)

    // Output: [4, 5, 6, 7, 8]
    
    // 24. Peek =lookup
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional[null]

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");

    //Aggregate Function: max(), min(), average(), sum(), count()

    // Output: 28
  
  }
//out of main

//07 class
public static class Student{
  private String name;
  private int score;

  public Student(String name, int score){
    this.name = name;
    this.score = score;
  }

  public String getName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  public void setScore(){
    this.score = score;
  }

  @Override
  public String toString(){
    return "Student["
      + "name=" + this.name
      + ", score=" + this.score
      + "]";
  }

}

//08 class
public static class Employee{
  private String name;
  private int salary;

  public Employee(String name, int salary){
    this.name = name;
    this.salary = salary;
  }

  public String getName(){
    return this.name;
  }

  public int getSalary(){
    return this.salary;
  }

  @Override
  public String toString(){
    return this.name;
  }

}

//09 class
public static class Person{
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public String toString(){
    return "Person["
      + "name=" + this.name
      + ", age=" + this.age
      + "]";
  }

}

}
