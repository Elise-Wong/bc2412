public class Hero {
  //Attributes
  private Role role;
  private int level;
  
  //static final
  //private int maxHp;
  //private int maxMp;
  private int hp;
  private int mp;
  private int attackPower;

  
  //construtor
  public Hero(){
    this.level = 1;
    //this.maxHp = maxHp;
    //this.maxMp = maxMp;
    this.hp = hp;
    this.mp = mp;
    this.attackPower = attackPower;
  }


  //getter
  public int getLevel(){
    return this.level;
  }

  public int getHp(){
    return this.hp;
  }

  public int getMp(){
    return this.mp;
  }


  
  //setter
  public void defeatMonster(){
    hp += 10;
    mp += 100;
    
    System.out.println("yeah");
  }
  public void levelUp(){
    if (level < (hp / 100)){
      level++;
      System.out.println("leve up up");
    }
  }

    
  


  public static void main(String[] args) {
    Hero hero = new Hero(10);

    for (int i = 0; i < 10; i++){
      hero.defeatMonster();
    }


    ///isAlive
    int hp = 0;
    int mp = 0;
    
    if (hp <= 0 && mp <= 0){
      System.out.println("KO");
    } else{
      System.out.println("Fighting!");
    }
  
  



  }
}
