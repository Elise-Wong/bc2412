public class DemoWrapperClass {
  public static void main(String[] args){

    int x = 3;
    Integer x2 = x;
    System.out.println(x2);
    System.out.println(x2.doubleValue());
    System.out.println("helle".length()); 

    double d = 3.3;
    Double d2 = d;
    System.out.println(d2);
    System.out.println(d2.intValue());
    float f = d2.floatValue();
    System.out.println(f);


    double d3 = d2.doubleValue();
    System.out.println(d3);


    
    char c1 = 'a';
    Character c2 = c1;
    System.out.println(c2);
    System.out.println(c2.compareTo('a'));  //0
    //0 --> equals
    Character c3 = 'c';
    System.out.println(c3.compareTo('a'));  //2, ascii of 'c' > ascii of 'a'
    Character c4 = 'A';
    System.out.println(c4.compareTo('a')); //32, ascii of 'c' > ascii of 'a'

    int asciiofA = 'A';
    int asciiofa = 'a';
    System.out.println(asciiofa - asciiofA); //32
    System.out.println('A' - 'a'); //32, char value --> chard vlaue --> int value --> int value

    char c5 = c4; //unbox
    System.out.println(c5); //A


    boolean b1 = false;
    Boolean b2 = b1;  //auto-box
    System.out.println(b2); //false

    boolean b3 = b2; //unbox
    System.out.println(b3);


  }
}
