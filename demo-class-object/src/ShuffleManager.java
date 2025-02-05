import java.util.List;

public class ShuffleManager {
  private List<Poker> pokers;


  // Dependency Injection (DI)
  public ShuffleManager(List<Poker> pokers){
    this.pokers = pokers;
  }
  
  public void shuffle(){

  }

}
