public class Quiz2 {
  private String pw;
  public static int counter = 2;

  public Quiz2(String pw){
    this.pw = pw;
    counter++;
  }

  public String getPw(){
    return this.pw;
  }

  public void setPw(String pw){
    this.pw = pw;
    counter--;
  }

  public void append(Quiz2 pw){
    pw.setPw(("XYZ"));
    this.pw = "BCD";
  }

  public static void main(String[] args) {
    //01 C
    Quiz2 p1 = new Quiz2("abc");
    Quiz2 p2 = new Quiz2("abc");
    Quiz2 p3 = new Quiz2("bcd");
    String s1 = new String("ABC");
    System.out.println(p1 == p2);
    System.out.println(p2 == p3);
    System.out.println(p1.getPw().equals(p2.getPw()));
    System.out.println("ABC".equals(s1));

    //02 D
    p2.setPw("password");
    Quiz2.counter *= Quiz2.counter;
    System.out.println(Quiz2.counter);

    //03 D
    int counter3 = 10;
    for (byte i = 0; i < 128; i--){
      counter3++;
      break;
    }
    System.out.println(counter3);

    //04 A->B
    p1.append(p2);
    System.out.println(p1.getPw() + p2.getPw());
    




  }
  


}
