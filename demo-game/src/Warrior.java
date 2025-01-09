public class Warrior extends Hero{
  //Attributes
  private int maxHp;
  private int maxMp;
  private char gender;

  //construtor
  public Warrior(long id){
    super(id);
    this.maxHp = 1000;
    this.maxMp = 100;
    this.gender = 'M';
  }

  
  //getter
  public int getMaxHp(){
    return this.maxHp;
  }

  public int getMaxMp(){
    return this.maxMp;
  }
  
  public int getGender(){
    return this.gender;
  }

  
  //setter


  public static void main(String[] args) {
    Warrior w1 = new Warrior(13L);
    System.out.println(w1.getLevel() + ", " + w1.getMaxHp() + ", " + w1.getMaxMp() + ", " + w1.getGender());

 
  }
    
}
