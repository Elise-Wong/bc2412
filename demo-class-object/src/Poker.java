public class Poker {
  //Attrubites
  //String(more than 1 char) vs char (Single character)
  //"k" vs "K" are difference
  private char rank; //A,2,...9,T,J,Q,K
  private char suite; //花色 D,C,H,S

  //static final 大階
  public static final char[] RANKS = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
  public static final char[] SUITES = new char[]{'D','C','H','S'};



  //Contrucbitor
  public Poker(char rank, char suite){
    this.rank = rank;
    this.suite = suite;
  }


  //Getter
  public char getRank(){
    return this.rank;
  }

  public char getSuite(){
    return this.suite;
  }
  

  //Setter
  

}
