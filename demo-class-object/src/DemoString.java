public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";
    String s3 = s; //s3 and s pointing same object
    String s4 = "hello!";
    String s5 = new String("hello");  //new is real new object
    String s6 = String.valueOf("hello");
    String s7 = new String("hello");
    //char[] arr = new char[]{'h','e','l','l','o'};

    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
    System.out.println(System.identityHashCode(s5));
    System.out.println(System.identityHashCode(s6));
    System.out.println(System.identityHashCode(s7));


    System.out.println(s == s2);
    System.out.println(s.equals(s2));
    System.out.println(s == s5);
    System.out.println(s.equals(s5));
    System.out.println(s5 == s7);


    //Question: after appending "?", is "s" still the same object? NO
    s = s + "?";
    System.out.println(System.identityHashCode(s));





  }

}
