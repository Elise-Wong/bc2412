public class SuperHeroGame <T extends Hero, U extends Weapon>{
  //Attributes
  private T hero;
  private U weapon;
  
  
  //Constructor

  
  //Getter
  public double totalAttack(){
    return this.hero.attack() + this.weapon.OnTopPhyAttack() *2.0 + this.weapon.OnTopMagAttack() * 1.5;
  }



  //Setter
  public void setHero(T hero){
    this.hero = hero;
  }

  public void setWeapon(U weapon){
    this.weapon = weapon;
  }
  
  public static void main(String[] args) {
    SuperHeroGame<Hero, Weapon> s1 = new SuperHeroGame<>();
    s1.setHero(new Warrior(11));
    s1.setWeapon(new Bow());
    System.out.println(s1.totalAttack());



  }
}
