import javax.xml.crypto.Data;

public class Quiz3 {

  public static void main(String[] args){
    //01 D

    //02 xB, A
    int[] arr =new int[]{1,3,5,7,9,11,13};
    int total = 0;
    for (int i = 0; i < 4; i++){
      total += arr[i];
      System.out.println(total);
    }

    //03 D
    Database p1 = new Database(new String[] {"a","b","x"});
    Database p2 = p1;
    Database p3 = new Database(new String[] {"a","b","x"});
    String s1 = "a";
    String s2 = "a";

    System.out.println(p1 == p2);
    System.out.println(p2 == p3);
    System.out.println(s1 == s2);
    System.out.println(s1.equals((p1.getStrings()[1])));
    System.out.println(s2.equals(s1));


    //04

    //09
    Database d1 = new Database("start");
   
    System.out.println(d1.show());





  }
  //out of main

  //03 class
  public static class Database{
    private String[] strings;
    private String pw;

    //Database(String[] strings){
    Database(String x){
      this.strings = strings;
      this.pw = x;
    }
    public String[] getStrings(){
      return this.strings;
    }
  }

  @Override
  public String show(){
    System.out.println("123");
    System.out.println("***");
    return this.pw;
  }

}
