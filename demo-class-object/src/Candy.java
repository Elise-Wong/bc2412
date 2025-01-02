public class Candy {
  //Attributes
  private char color;
  private int noOfCandy;

  public static final char[] COLORS = new char[]{'R','B','Y'};
  public static int[] NOOFCANDYS = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


  //Constructor
  public Candy(char color, int noOfCandy){
    this.color = color;
    this.noOfCandy = noOfCandy;
  }


  //Getter
  public char getColor(){
    return this.color;
  }

  public int getNoOfCandy(){
    return this.noOfCandy;
  }


  //Setter
  

  public static void main(String[] args) {
    Candy c1 = new Candy('R', 1);
    Candy c2 = new Candy('Y', 2);
    Candy c3 = new Candy('Y', 3);
    Candy c4 = new Candy('Y', 4);
    Candy c5 = new Candy('B', 5);
    Candy c6 = new Candy('B', 6);
    Candy c7 = new Candy('B', 7);
    Candy c8 = new Candy('Y', 8);
    Candy c9 = new Candy('R', 9);
    Candy c10 = new Candy('B', 10);
    Candy c11 = new Candy('R', 11);
    Candy c12 = new Candy('R', 12);
    Candy c13 = new Candy('B', 13);
    Candy c14 = new Candy('B', 14);
    Candy c15 = new Candy('B', 15);
    Candy c16 = new Candy('B', 16);
    Candy c17 = new Candy('B', 17);
    Candy c18 = new Candy('B', 18);
    Candy c19 = new Candy('B', 19);
    Candy c20 = new Candy('R', 20);



    
  }

}
