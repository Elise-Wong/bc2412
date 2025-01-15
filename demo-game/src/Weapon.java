public enum Weapon {
  BOW("Bow"),
  STA("Stave"),
  SWO("Sword"),
  ;
  //Attributes
  private final String desc;
  private static final int[][] BOW_TAB = new int[3][3];
  private static final int[][] STA_TAB = new int[3][3];
  private static final int[][] SWO_TAB = new int[3][3];

  private static final int ROW_PA = 0;
  private static final int ROW_MA = 1;
  private static final int ROW_CC = 2;

  BOW_TAB[ROW_PA] = new int [] {400,600,900};
  BOW_TAB[ROW_MA] = new int [] {400,600,900};
  BOW_TAB[ROW_CC] = new int [] {1000,1500,2250};




  //Constructor
  private Weapon(String desc){
    this.desc = desc;
  }


  //Getter
  public String getDesc(){
    return this.desc;
  }

  public static String getDescription(Weapon weapon){
    if (weapon == Weapon.BOW){
      return "Get Bow!";
    } else if (weapon == Weapon.STA){
      return "Get Stave!";
    } else if (weapon == Weapon.SWO){
      return "Get Sword!";
    } return "";
  }

  public int OnTopPhyAttack(){
    return 100;
  }

  public int OnTopMagAttack(){
    return 100;
  }

  //Setter
  

  public static void main(String[] args) {
    System.out.println(Weapon.getDescription(Weapon.STA));




  }

}
