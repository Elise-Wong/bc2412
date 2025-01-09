public class Game {

  public static void main(Sting[] args){
    Hero[] heroes = { new Archer(), new Mage(), new Warrior() };
    for (Hero hero : heroes) {
      System.out.println("\n角色: " + hero.getClass().getSimpleName());
      for (int i = 0; i < 10; i++) {
          hero.defeatMonster();
      }
  }

  }
}
