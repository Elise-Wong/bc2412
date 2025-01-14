import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {



//sample 1
  public static String concat(String x, String y){
    return x.concat(y);
  }

  //overflow:  int * int -> int
  //not overflow: long * long -> long -> Long
  public static Long multiply(int x, int y){
    return (long) x * (long) y; // uncorrect: (long) (x * y)
  }

  //sample 2
  public static void changeBookName(Book book){
    book.setName("hello");
  }

    //immidiable
    public static Book changeBookNameN(Book book){
      return new Book("hello"); //similar to BigDecimal
    }

  //sample 3
  public static void allZero(int[] arr){ //pass by object reference (preimilutor
    for (int i = 0; i < arr.length; i++){
      arr[i] = 0;
    }
   }

   //sample 4
  //BigDecimal? pass by value or by reference? pass by reference
  //Similar to String
  public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta){ //cannot correct original
    //can you revise the value inside a BigDecimal Object? cant
      //originalsetValue(10); //xx
      return original.add(delta); //always return a new BigDecimal Object
  }

    //sample 5
    public static int sum(int x, int y){
      x = 100;
      y = 200;
      return x + y;
    }


  public static void main(String[] args) {
    //bubble sort (Nested Loop)

    
    List<Integer> integers = Arrays.asList(1,3,10,-4,2);
    
    // integers = Collections.sort(integers);
    Collections.sort(integers); //自動排序
    //Collections is class name for statice method, and setted up by Java
    System.out.println(integers); //[-4, 1, 2, 3, 10]


    int[] arr = new int[]{10,2,9};
    allZero(arr);
    System.out.println(Arrays.toString(arr)); //[0, 0, 0]

   //sample 4
    //BigDecimal? pass by value or by reference
   BigDecimal bd1 = BigDecimal.valueOf(10);
   BigDecimal bd2 = BigDecimal.valueOf(3);
   System.out.println(addBigDecimal(bd1, bd2).doubleValue()); //13.0
   System.out.println(bd1.doubleValue()); //10.0
   System.out.println(bd2.doubleValue()); //3.0

    //Sort String by Collections.sort()






  //sample 5
    //Primitives or Wrapper Class
    int a = 3;
    int b = 4;
    System.out.println(sum(a, b)); //300, passing a copy of value to the method
    System.out.println(a); //3, but not 100, because we pass by value for primitives
    System.out.println(b); //4, but not 200, because we pass by value for primitives
  


  //sample 2
 //Custom Type ~ Book
 Book book = new Book("sun");
  changeBookName(book); //pass by Book reference
  System.out.println(book); //Book[name=hello]




}

}
