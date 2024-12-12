public class DemoOperator {
  public static void main(String[] args){
    int x = 3;
    x = x + 1;
    x++;
    x--;
    x += 1;
    System.out.println(x);

    int b = 20;
    b = b + 2;
    b += 2;
    System.out.println(b);

    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y); 

    int c = 100;
    c = c -2;
    c -= 2;
    System.out.println(c); 

    int m = 5;
    m = m * 2;
    m *= 2;
    System.out.println(m);

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u);

    int remainder = 10 % 3;
    System.out.println(remainder);


    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1);
    System.out.println(a); 


    int q = 8;
    int result2 = q++ + 3;
    System.out.println(result2);
    System.out.println(q);

    int h = 8;
    int result3 = h + 3;
    h = h + 1;
    System.out.println(result3);
    System.out.println(h);

    String s = "hello";
    s += "!";
    System.out.println(s); 



    int x10 = 5;
    int y10 = 10;
    int z10 = x10 +=3 * y10;
    System.out.println(z10); //35; cant!!!!

    int x11 = 3;
    int y11 = (x11++ + 3) * x11++;
    System.out.println(y11); //24
    System.out.println(x11); //5





  }
}
