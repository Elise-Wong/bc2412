public class Mage extends Hero{
  //Attributes
  private int maxHp;
  private int maxMp;
  private char gender;


  //construtor
  public Mage(long id){
    super(id);
    this.maxHp = 100;
    this.maxMp = 1000;
    this.gender = 'F';
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
    Mage m1 = new Mage(12L);
    System.out.println(m1.getLevel() + ", " + m1.getMaxHp() + ", " + m1.getMaxMp() + ", " + m1.getGender());



  }
    
}
