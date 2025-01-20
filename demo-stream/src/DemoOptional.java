import java.util.Optional;

public class DemoOptional {
  //attribues for get setter
  //firstName still can be null, but what is this meaning?
  private Optional<String> firstName;

  public static void main(String[] args) {

    //caller
    //adv: able to avoid null pointer exception
    //can use else, throw\
    //1.
    Optional<String> result = concat("abc", "def");
    //isPresent ...correctly to 處理 null
    if (result.isPresent()){ //can (!result.isPresent())
      System.out.println(result.get()); //abcdef
    } else {
      System.out.println("the String is null.");
    }

    //2. not safe!!
    String result2 = concat(Optional.of("abc"), Optional.of("def"));
    System.out.println(result2);

    
  }
//out of main

  //1. Optional can only be used as a return type of method
  //if you decided to have a return type of Optional,
  //it implies the result may be null

  //e.g. 
  //if a or b is null, the result is null
  public static Optional<String> concat(String a, String b){
    if (a == null || b == null){
      return Optional.empty(); //return null 是死的, 因為冇對齊
    }
    return Optional.of(a.concat(b));
  }


  //2. never use Optional as input parameter
  // x & y still can be null , not safe
  public static String concat(Optional<String> x, Optional<String> y){
    if (x == null || y == null)
      return null;
    if (!x.isPresent() || !y.isPresent())
      return null;
    return x.get().concat(y.get());
  }




}
