import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoTypeInference {
    //attribute
    //3. var cant be define as attribute type.
    //private var x; //cant
    //private T x; 

    
    public static void main(String[] args) {
        
        //Java 10
        //once you assign the value to var variable, the variable type will be defined as usual.
        //var can be defined as local variable.
        var x = 3; //this is strong type, x is an int varialbe
        //x = 3.3;

        var y = 3.3; //y is a double type.
        y = 3; //upcast
        System.out.println(y); //3.0...strong type, not good

        List<List<String>> stringLists = new ArrayList<>();
        stringLists.add(Arrays.asList("ABC", "DEF"));
        stringLists.add(Arrays.asList("vic", "Lucas"));

        //List<List<String>
        //[[ABC, DEF], [vic, Lucas]]
        for (List<String> list :stringLists){
            for (var str : list){
                System.out.println(str);
            }
        }

        //same as above
        //var can be defined as reference type for a certain DS
        for (var list : stringLists){ //for (List<String> list :stringLists){
            for (var str : list){
                System.out.println(str);
            }
        }

        //Stream flatmap...signle list
        //List<List<String>> -> List<String>
        //list of list string isnt same as list of string
        List<String> result = stringLists.stream()
            .flatMap(e -> e.stream())
            .collect(Collectors.toList());
        System.out.println(result); //[ABC, DEF, vic, Lucas]


        //u has to be initialized at declaration.
        //var u = null;
        //u = 3;

        //array initializer
        var arr = new int[]{3,2,1}; //normally, var supports array
        //var arr2 = {3,2,1}; //not ok, {3,2,1} can be a double array
        int[] arr10 = {3,2,1}; //both are int




        //Customer
        //from constructor1
        List<Customer> customers = Arrays.asList(
                new Customer("vic", "vlau"),
                new Customer("lucas", "lll"));
        //map()
        List<String> usernames = customers.stream().map(e -> e.getUserName())
            .collect(Collectors.toList());
        System.out.println(usernames); //[vlau, lll]

        //from constructor2
        //find all nicknames of my customers
        List<Customer> customers2 = Arrays.asList(
            new Customer("vincent", "vlau", Arrays.asList("abcd", "def")),
            new Customer("Steven", "swong", Arrays.asList("ab", "ijkm")),
            new Customer("lucas", "lll", Arrays.asList("ijk", "xyz")));
        List<String> nicknames = customers2.stream()
            .filter(e -> e.getName().length() > 5) //e is Customer
            .flatMap(e -> e.getNickNames().stream()) //.stream() is for 之前係List<>
            .filter(e -> e.length() > 3) //e is string, not Customer, only can use length(), charAt //e.charAt(0) == 'a'
            .collect(Collectors.toList());
        System.out.println(nicknames); //[abcd, ijkm]
        //map is for substring

        






    }
//out of main

//another class
public static class Customer{
    private String name;
    private String username;
    private List<String> nicknames;

    //constructor1
    public Customer(String name, String username){
        this.name = name;
        this.username = username;
    }

    //constructor2
    public Customer(String name, String username, List<String> nicknames){
        this.name = name;
        this.username = username;
        this.nicknames = nicknames;
    }

    public String getUserName(){
        return this.username;
    }

    public List<String> getNickNames(){
        return this.nicknames;
    }

    public String getName(){
        return this.name;
    }
}

//1. Java doesnt allow defining var as variable type.
//because Java is Strong type (type has to be determined during compile time)
//i.e. cant use var in compile time, but can use runtime

//public static int sum(var x, var y){
//    return x + y;
//}


//2. return type cant be defined as var type
//because caller doesnt know the return of sum2() method during compile time.

//public static var sum2(int x, int y){
//    String a = "a";
//    if (a.equals("a"))
//        return (long)x + (long)y; //only runtime know it is long
//    else
//        return x + y;
//}

}
