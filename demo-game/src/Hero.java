public abstract class Hero {
  //Attributes
  private Role role;
  private long id;
  private int level;
  
  //static final
  private int maxHp;
  private int maxMp;
  private int hp;
  private int mp;
  //private int attackPower;

  
  //construtor
  public Hero(long id){
    this.id = id;
    this.level = 1;
    this.maxHp = maxHp;
    this.maxMp = maxMp;
    this.hp = 100;
    this.mp = 100;
    //this.attackPower = attackPower;
  }


  //getter
  public long getId(){
    return this.id;
  }

  public int getLevel(){
    return this.level;
  }

  public int getHp(){
    return this.hp;
  }

  public int getMp(){
    return this.mp;
  }

  public int getMaxHp(){
    return this.maxHp;
  }

  public int getMaxMp(){
    return this.maxMp;
  }

  public int attack(){
    return 10;
  }

  
  //setter
  public void defeatMonster(){
    hp += 1000;
    mp += 100;
    
    System.out.println("yeah");
  }

  public void levelUp(){
    if (level < (hp / 100)){
      level++;
      System.out.println("level up up" + level);
    }
  }





  public static void main(String[] args) {
    Hero[] hero = new Hero[3];


    

    for (int i = 0; i < 10; i++){
      //hero.defeatMonster();
    }


    ///isAlive
    int hp = 0;
    int mp = 0;
    
    if (hp <= 0 && mp <= 0){
      System.out.println("KO");
    } else{
      System.out.println("Fighting!");
    }
  
    //Polymorphism
    //Hero hero = new Archer();
    //hero.attack();
    //hero = new Warrior();
    //hero.attack();

    //Hero[] heros = new Hero[3];



  }
}
