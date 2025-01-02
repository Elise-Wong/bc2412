public class DemoInteger {
  public static void main(String[] args){
    Integer x = 3;
    Integer x2 = 3;
    System.out.println(System.identityHashCode(x));
    System.out.println(System.identityHashCode(x2));

    Integer x3 = new Integer(3);
    System.out.println(System.identityHashCode(x3));

    Integer x5 = 128;
    Integer x6 = 128;
    System.out.println(System.identityHashCode(x5));
    System.out.println(System.identityHashCode(x6));
    Integer x7 = new Integer(128);
    Integer x8 = Integer.valueOf(128);
    System.out.println(System.identityHashCode(x7));
    System.out.println(System.identityHashCode(x8));


    //Same situations for Byte Short Long, Character, Boolean
    Character c1 = 'a';
    Character c2 = 'a';
    System.out.println(System.identityHashCode(c1));
    System.out.println(System.identityHashCode(c2));

    Character c3 = '你';
    Character c4 = '你';
    System.out.println(System.identityHashCode(c3));
    System.out.println(System.identityHashCode(c4));

    Boolean b1 = true;
    Boolean b2 = true;
    System.out.println(System.identityHashCode(b1));
    System.out.println(System.identityHashCode(b2));

    // Not support Internal Cache: Float, Double
    Double d1 = 10.3;
    Double d2 = 10.3;
    System.out.println(System.identityHashCode(d1));
    System.out.println(System.identityHashCode(d2));

    Float f1 = 10.3f;
    Float f2 = 10.3f;
    System.out.println(System.identityHashCode(f1));
    System.out.println(System.identityHashCode(f2));


    Double d3 = 10.3;
    Double d4 = 10.1;

    if (d1 > 10.3){ //NOT OK!

    }
    if (d3.compareTo(d4) > 0){
      System.out.println("d3 > d4");
    }

    Double d5 = 10.1;
    Double d6 = 10.6;
    if (d5.compareTo(d6) < 0){
      System.out.println("d5 < d6");
    }

    Double d7 = 10.1;
    Double d8 = 10.1;
    if (d7.equals(d8)){ //d7.compareTo(d8) == 0
      System.out.println("d7 = d8");
    }

    





    }
  }
