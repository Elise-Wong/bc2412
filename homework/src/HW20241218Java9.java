public class HW20241218Java9 {
  public static void main(String[] args){
    String str = "VenturenixLAB, Java";
    System.out.println(str.charAt(15));
    System.out.println(str.charAt(1));

    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));

    String abc = "    ab c    ";
    System.out.println(abc.trim());

    System.out.println(str.replace("Java","Coding"));

    System.out.println(str.length());

    System.out.println(str.substring(5,8));

    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    System.out.println(str.replace("e","*").concat("!!!").toUpperCase());







  }
}
