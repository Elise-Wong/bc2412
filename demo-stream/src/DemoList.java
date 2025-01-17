import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {

  public static void main(String[] args) {
    //new ArrayList<>()
    //List.of()
    //Arrays.asList()


    //1. new ArrayList<>()
    //able to read/add/remove/modify
    List<String> strings1 = new ArrayList<>();
    strings1.add("ABC");
    strings1.add("DEF");

    List<String> strings2 = new ArrayList<>(Arrays.asList("ABC", "DEF"));
    strings2.add("IJK");
    strings2.remove("DEF");
    strings2.set(0, "XYZ");


    //2. Arrays.asList()
    //able to read/modify only ...封了長度, 但可替換
    //cant add/remove
    List<String> strings3 = Arrays.asList("ABC", "DEF", "IJK");
    //strings3.add("IJK");  //x, java.lang.UnsupportedOperationException
    //strings3.remove("DEF");  //x, java.lang.UnsupportedOperationException
    strings3.set(0, "XYZ");


    //3.List.of()
    //able to read only
    //after java 9
    List<String> strings4 = List.of("ABC", "DEF", "IJK");
    //strings4.add("IJK");  //x
    //strings4.remove("DEF");  //x
    //strings4.set(0, "XYZ");  //x
    System.out.println(strings4.get(2)); //IJK



    
  }
}
