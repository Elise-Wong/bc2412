public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";

    //count time 
    //1970UTC
    //電腦的性能有關
    //因為內部用char array

    //no StringBuilder
    s = "";
    long before = System.currentTimeMillis();
    for (int i = 0; i <100_000; i++){
      s = s + "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); //285ms...non-linear; me 1055


    //hv StringBuilder
    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i <100_000; i++){
      sb.append("!"); //similar to setter; void ; person = person.setName(); 
      //sb = sb.append("!") 畫蛇添足, 但可以
    }
    System.out.println(sb.length()); //100000
    after = System.currentTimeMillis();
    System.out.println(after - before); //3ms...non-linear; me 7


    //reverse(), replace(), deleteCharAt(), setCharAt(), insert()
    sb = new StringBuilder("abcd");
    sb.reverse(); //String doesnt hv.
    System.out.println(sb); //dcba

    System.out.println(sb.charAt(2)); //b
    sb.replace(0,2,"yy"); //replace 幾多個charator
    System.out.println(sb); //yyba

    sb.deleteCharAt(2); //delete b //for loop for doing 1 thing
    System.out.println(sb); //yya

    sb.setCharAt(2, 'o'); // a -> o
    System.out.println(sb); //yyo

    sb.insert(1, "!!!");
    System.out.println(sb); y!!!yo


  }

}
