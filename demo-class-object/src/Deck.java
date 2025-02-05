import java.util.Arrays;
import java.util.List;

public class Deck {
  //52 cards of poker
  
  //Attributes
  private Poker[] pokers;
  

  //Constructor
  //for, while, if/else
  public Deck(){
    this.pokers = new Poker[Poker.RANKS.length * Poker.SUITES.length]; //13*4=52
    //less loop
    int idx = 0;
    for (Rank rank : Poker.RANKS){
      for (char suite : Poker.SUITES){
        this.pokers[idx++] = new Poker(rank, suite);
        }
      }

  }



  //Getter
  public int rankRage(){
    return this.pokers.length;
  }

  public List<Poker> getPokers(){
    return Arrays.asList(this.pokers);
  }



  //Setter

  public static void main(String[] args) {
    Deck deck = new Deck();  //52 cards
    System.out.println(deck);

    System.out.println(Math.PI); //public & static final


    Poker card = new Poker(Rank.ACE, 'S');
    Poker c2 = new Poker(Rank.ACE, 'S');
    

  }

}
