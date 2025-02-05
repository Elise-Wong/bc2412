import java.util.List;

public class BigTwoGame {
  private Deck deck;
  private ShuffleManager shuffleManager;
  private final Player[] players = new Player[4]; //final 緊arrays, 永遠只有4個players

  // new BigTwoGame
  {
    this.players[0] = new Player(1);
    this.players[1] = new Player(2);
    this.players[2] = new Player(3);
    this.players[3] = new Player(4);
  }


  public BigTwoGame(){
    this.deck = new Deck();
    this.shuffleManager = new ShuffleManager(this.deck.getPokers()); //address only
  }

  public void start(){
    this.shuffleManager.shuffle();
  }



}
