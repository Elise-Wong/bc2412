public class DemoStringg {
  public static void main(String[] args){
    String s1 = "hello";
    System.out.println(s1.length());
    System.out.println(s1.charAt(1));
    System.out.println("hello".equals(s1));
    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("ll"));
    System.out.println(s1.substring(0,2));
    System.out.println(s1.startsWith("h"));
    System.out.println(s1.endsWith("oo"));
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s1.replace("ll","xxx"));
    System.out.println(s1.equalsIgnoreCase("HEllO"));
    System.out.println(s1.indexOf('e'));
    System.out.println(s1.indexOf('x'));
    System.out.println(s1.indexOf("ll"));

    System.out.println(s1.lastIndexOf('l'));
    System.out.println("hellollo".lastIndexOf("ll"));
    System.out.println(s1.isEmpty());
    System.out.println("".isEmpty());
    System.out.println(" ".isEmpty());

    System.out.println(s1.isBlank());
    System.out.println("".isBlank());
    System.out.println(" ".isBlank());

    System.out.println(" hel lo ".trim());

    System.out.println("abc".compareTo("bbb"));
    System.out.println("abc".compareTo("dbb"));
    System.out.println("aac".compareTo("azb"));


    System.out.println("hello".concat("ijk").concat("def").toUpperCase());


  }
}
