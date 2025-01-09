public class Heros {

  //max hp

  //1d array
  //private static final int[] ARC_MAX_HP_TAB;  //final可全大階
  //private static final int[] WAR_MAX_HP_TAB;
  //private static final int[] MAG_MAX_HP_TAB;

  //2d array
  private static final int[][] ARC_TAB = new int[8][10];
  private static final int[][] MAG_TAB = new int[8][10];
  private static final int[][] WAR_TAB = new int[8][10];

  private static final int ROW_MAX_HP = 0;
  private static final int ROW_MAX_MP = 1;
  private static final int ROW_PA = 2;
  private static final int ROW_PD = 3;
  private static final int ROW_MA = 4;
  private static final int ROW_MD = 5;
  private static final int ROW_CC = 6;
  private static final int ROW_CD = 7;

  
  static{
    //1d array
    //ARC_MAX_HP_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
    //WAR_MAX_HP_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
    //MAG_MAX_HP_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};

    //2d array
    ARC_TAB[ROW_MAX_HP] = new int [] {10,20,40,80,160,480,1440,4320,12960,38880};
    ARC_TAB[ROW_MAX_MP] = new int [] {500,1000,2000,4000,8000,24000,72000,216000,648000,1944000};
    ARC_TAB[ROW_PA] = new int [] {30,60,120,240,480,960,1920,3840,7680,15360};
    ARC_TAB[ROW_PD] = new int [] {30,60,120,240,480,960,1920,3840,7680,15360};
    ARC_TAB[ROW_MA] = new int [] {30,60,120,240,480,1440,4320,12960,38880,116640};
    ARC_TAB[ROW_MD] = new int [] {30,60,120,240,480,1440,4320,12960,38880,116640};
    ARC_TAB[ROW_CC] = new int [] {50,50,50,50,50,100,200,400,800,1600};
    ARC_TAB[ROW_CD] = new int [] {5,5,5,5,5,10,20,40,80,160};

    MAG_TAB[ROW_MAX_HP] = new int [] {100,200,400,800,1600,4800,14400,43200,129600,388800};
    MAG_TAB[ROW_MAX_MP] = new int [] {1000,2000,4000,8000,16000,48000,144000,432000,1296000,3888000};
    MAG_TAB[ROW_PA] = new int [] {5,10,20,40,80,160,320,640,1280,2560};
    MAG_TAB[ROW_PD] = new int [] {5,10,20,40,80,160,320,640,1280,2560};
    MAG_TAB[ROW_MA] = new int [] {50,100,200,400,800,2400,7200,21600,64800,194400};
    MAG_TAB[ROW_MD] = new int [] {50,100,200,400,800,2400,7200,21600,64800,194400};
    MAG_TAB[ROW_CC] = new int [] {30,30,30,30,30,60,120,240,480,960};
    MAG_TAB[ROW_CD] = new int [] {30,30,30,30,30,60,120,240,480,960};

    WAR_TAB[ROW_MAX_HP] = new int [] {1000,2000,4000,8000,16000,48000,144000,432000,1296000,3888000};
    WAR_TAB[ROW_MAX_MP] = new int [] {100,200,400,800,1600,4800,14400,43200,129600,388800};
    WAR_TAB[ROW_PA] = new int [] {50,100,200,400,800,1600,3200,6400,12800,25600};
    WAR_TAB[ROW_PD] = new int [] {50,100,200,400,800,1600,3200,6400,12800,25600};
    WAR_TAB[ROW_MA] = new int [] {5,10,20,40,80,240,720,2160,6480,19440};
    WAR_TAB[ROW_MD] = new int [] {5,10,20,40,80,240,720,2160,6480,19440};
    WAR_TAB[ROW_CC] = new int [] {5,5,5,5,5,10,20,40,80,160};
    WAR_TAB[ROW_CD] = new int [] {50,50,50,50,50,100,200,400,800,1600};
  }
  

  public static int getMaxHp(Role role, int level){
    switch (role){
      case ARCHER:
        //return ARC_MAX_HP_TAB[level - 1]; //9th
        return ARC_TAB[ROW_MAX_HP][level - 1];
      case MAGE:
        //return MAG_MAX_HP_TAB[level - 1];
        return MAG_TAB[ROW_MAX_HP][level - 1];
      case WARRIOR:
        //return WAR_MAX_HP_TAB[level - 1];
        return WAR_TAB[ROW_MAX_HP][level - 1];
      default:
        break;
      }
      return -1;
    }

    public static int getMaxMp(Role role, int level){
      switch (role){
        case ARCHER:
          return ARC_TAB[ROW_MAX_MP][level - 1];
        case MAGE:
          return MAG_TAB[ROW_MAX_MP][level - 1];
        case WARRIOR:
          return WAR_TAB[ROW_MAX_MP][level - 1];
        default:
          break;
        }
        return -1;
      }

  public static void main(String[] args){
    //System.out.println(ARC_MAX_HP_TAB.getLevel());
    System.out.println(ARC_TAB.getLevel());


  }
}
