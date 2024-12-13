public class DemoString {
  public static void main(String[] args) {
    char x = 'a';
    x = 1;
    x = 'x';

    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";

    password = password + "!";
    System.out.println("helloworld");
    System.out.println(password); 

    char result = password.charAt(0);
    System.out.println(result);

    System.out.println(password.charAt(8));
    
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1.equals(s2);
    System.out.println(result2);

    String s3 = "abc";
    String s4 = "ccc";
    boolean result3 = s3.equals(s4);
    System.out.println(result3);

    
  
    int ii = password.length();
    System.out.println(ii);

    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length() - 1);
    System.out.println(lastChar);


    String emptyString = "";
    System.out.println(emptyString.length());
    boolean isStringEmpty = "".equals(emptyString);
    System.out.println(isStringEmpty);

    String s = "hello";
    System.out.println("hello".equals(s));
    System.out.println("hello".charAt(2));
    System.out.println("hello".length());

    String s5 = "abc";
    boolean isEmpty = s5.length() == 0;
    System.out.println(isEmpty);
    System.out.println(s5.isEmpty());

    String substr = s5.substring(0, 2);
    System.out.println(substr);
    System.out.println(s5.substring(0, 3));
    System.out.println(s5.substring(0, s5.length()));
    System.out.println(s5.substring(1, s5.length()));
    System.out.println(s5.substring (1));


  }
}
