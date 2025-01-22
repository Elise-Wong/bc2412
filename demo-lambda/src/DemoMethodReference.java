import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        numbers.forEach(e -> {
            System.out.println(e); //vs (e + 10)
        });

        //print e only:
        //it implies you wont change the values passing to method
        numbers.forEach(System.out::println);  //forgive to change
        //that mean e change, here wont change!

        //cant
        //Function<String, Integer> StringLength = s -> s.length();
        //Function<String, Integer> StringLength2

        //Instance method
        //only no any 參數
        //冇可能性 才可sypify
        String s = "hello";
        Supplier<Integer> stringLength = () -> s.length();
        Supplier<Integer> stringLength2 = s::length;

        //static method
        Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
        Function<String, Integer> stringToInteger2 = Integer::valueOf;

       




    }
}
