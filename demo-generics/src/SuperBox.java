import javax.sql.rowset.WebRowSet;

public class SuperBox<T extends Animal, U extends Hero, V extends Weapon> {
  //Attributes
  private T animal;
  private U hero;
  private V weapon;


  //constructor
  public SuperBox(){
  }


  //getter
  public T getAnimal(){
    return this.animal;
  }

  public U getHero(){
    return this.hero;
  }

  public V getWeapon(){
    return this.weapon;
  }


  //setter
  public void setAnimal(T animal){
    this.animal = animal;
  }

  public void setHero(U hero){
    this.hero = hero;
  }

  public void setWeapon(V weapon){
    this.weapon = weapon;
  }
  
  public double totalAttack(){
    return this.animal.run() + this.hero.attack() + this.weapon.onTopAttack() * 1.5; //run-time 時才知道最終用緊邊隻野, e.g. tiger, mage, bow
  }



  public static void main(String[] args) {
    SuperBox<Animal, Hero, Weapon> s1 = new SuperBox<>();
    s1.setAnimal(new Tiger());
    s1.setHero(new Mage());
    s1.setWeapon(new Bow());
    System.out.println(s1.totalAttack()); //1+2+3*1.5=6->7.5

    s1.setAnimal(new Panda());
    System.out.println(s1.totalAttack()); //100+2+3*1.5=105->106.5

    s1.setWeapon(new Sword());
    System.out.println(s1.totalAttack()); //100+2+1000*1.5=1102->1602.0



  }

}
