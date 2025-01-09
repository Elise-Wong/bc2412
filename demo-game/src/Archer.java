import java.math.BigDecimal;

public class Archer extends Hero{
  //Attributes
  private int maxHp;
  private int maxMp;


  //construtor
  public Archer(long id){
    super(id);
    this.maxHp = 10;
    this.maxMp = 500;
  }

  
  //getter
  public int getMaxHp(){
    return Heros.getMaxHp(Role.ARCHER, super.getLevel());
  }

  public int getMaxMp(){
    return this.maxMp;
  }
  
  
  //setter
  public void increaseStats(){
    int hp = Math.min(hp + 1, maxHp); 
    int mp = Math.min(mp + 50, maxMp);
  }


  public static void main(String[] args) {
    Archer a1 = new Archer(11L);
    System.out.println(a1.getLevel() + ", " + a1.getMaxHp() + ", " + a1.getMaxMp());

    


    
  }
}
