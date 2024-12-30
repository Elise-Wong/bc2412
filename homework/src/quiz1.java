public class quiz1 {
  public static void main(String[] args) {
    //01 - B
    int price = 150;
    int quantity = 10;
    double discount = 0.9;
    System.out.println(price * quantity * discount);

    //02 - B
    byte h = 24;
    byte d = 7;
    
    System.out.println(h*d);

    //03 - D
    String str = "welcome to programming";
    String nStr = str.replace("WELCOME TO", "");
    char c = nStr.trim().charAt(2);
    System.out.println(c);

    //04 - A
    String s = "hello";
    String nS = "";

    if (s.length() > 5 || s.indexOf("he") == 1) {
      nS = s;
      } else{
        nS += "str";
      }
      System.out.println(nS);


    //05 - B
    String str5 = "";

    for (byte i = 127; i < 128; i++){
    str5 += i;
    if (i < 0){
      break;
    }
  }
    System.out.println(str5);


    //06 - E
    String str6 = "";

    for (byte i = 127; i < 128; i++){
    
    if (i < 0){
      continue;
    }
    str6 += i;
    break;
  }
    System.out.println(str6);

    

    //07 - D
    int[] integers = {20, 10, 40};
    byte[] bytes = new byte[] {2, 4, 1};
    int score = 0;

    for (int i = 0; i < 3; i++){
      if (i % 2 == 1){
        score += integers[i];
             } else{
              score += bytes[i];
                        }
    }
    System.out.println(score);


    //08 - B


    //09 - B
    int a = 0;
    while (a < 3){
      switch (a){
        case 0:
        System.out.println("0");
        case 2:
        System.out.println("2");
      }
      a++;
    }

    //10 - A
    int g = 3;
    System.out.print(++g * 8);



  }
}
