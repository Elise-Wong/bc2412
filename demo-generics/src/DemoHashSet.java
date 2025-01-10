import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size()); //2

    //Difference betwween HashSet and ArrayList
    System.out.println(strings.add("ABC"));// false ..add is 1 for loop
    System.out.println(strings.size()); //2, HashSet avoid duplicate item

    System.out.println(strings.add("XYZ")); //true ...之前冇存在
    System.out.println(strings.size()); //3

    strings.remove("XYZ");
    System.out.println(strings.size()); //2

    //no remove by index method  ...xxx
    //HashSet 底層 is not array
    //知道正確位置要幹掉它, 用arraylist
    //HashSet cannot be ordering natually, because its underlying data structure is not an array




  }
}
