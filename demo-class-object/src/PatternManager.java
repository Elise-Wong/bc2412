public class PatternManager {
  private Poker[] pokers = new Poker[5]; //hold 5 decks only

  public PatternManager(Poker[] pokers){ //(Poker poker1...poker5)
    if (pokers == null || pokers.length != 5)
      throw new IllegalArgumentException();
    if (pokers[0] == null || 
        pokers[1] == null ||
        pokers[2] == null ||
        pokers[3] == null ||
        pokers[4] == null)
      throw new IllegalArgumentException();
    this.pokers = pokers;
  }

  public boolean hasPair(){
    int[] counts = new int[13];
    for (int i = 0; i < this.pokers.length; i++){
      if (++counts[this.pokers[i].getRank().getValue() - 1] >= 2){
        return true;
      }
    }
    return false;
  }

  public boolean hasThreeKind(){ //just check if holding 3 pokers
    int[] counts = new int[13]; // 0 - 12
    for (int i = 0; i < this.pokers.length; i++){
      if (++counts[this.pokers[i].getRank().getValue() - 1] >= 3){ // -1 becos not start at 0
        return true;
      }
    }
    return false;
  }

  //蛇
  //6+7+8+9+10
  //(min + max) * 5 / 2
  //(6+10)*5/2 
  public boolean isStraight(){
    //for (int i = 0; i < this.pokers; i++){

    //}

    //using統計, 2 for loop
    int[] counts = new int[13];
    for (int i = 0; i < this.pokers.length; i++){
      counts[this.pokers[i].getRank().getValue() - 1] ++;
    }

    for (int i = 0; i < counts.length - 5; i++){ //8,9,10,11,12
      //if (counts[i] > 0 && // counts[i + 1] <= 0 --> false
      if (counts[i] == 1 &&
          counts[i + 1] == 1 &&
          counts[i + 2] == 1 &&
          counts[i + 3] == 1 &&
          counts[i + 4] == 1)
        return true;
    } 
        return false;
  }
  

  public boolean isFullHouse(){ //統計 3,2 是 full佬
    int[] counts = new int[13];
    for (int i = 0; i < this.pokers.length; i++){
      counts[this.pokers[i].getRank().getValue() - 1] ++;
    }
    boolean hasThreeKind = false;
    boolean hasPair = false;
    for (int i = 0; i < counts.length; i++){
      if (counts[i] == 3){
        hasThreeKind = true;
      }
      if (counts[i] == 2){
        hasPair = true;
      }
    }
       return hasPair && hasThreeKind;

  }

}
