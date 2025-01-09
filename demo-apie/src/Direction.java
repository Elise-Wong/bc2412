public enum Direction {
  EAST(90, 1),
  SOUTH(180, -2),
  WEST(270, -1),
  NORTH(360, 2),
  ;

  //attribute 
  private final int angle;
  private final int value;


  //construtor
  private Direction(int angle, int value){
    this.angle = angle;
    this.value = value;
  }


  //getter
  public int getAngle(){
    return this.angle;
  }


  //Direction.NORTH.oppsite() --> Direction SOUTH
  public Direction oppsite(){
    for (Direction d : values()){ //values()...Direction array
      if (d.value == this.value * -1){
        return d;
      }
    }
    return null; //throw exception
  }


  public static void main(String[] args) {
    Direction e = Direction.EAST;
    System.out.println(e.getAngle());

    System.out.println(e.oppsite());


  }

}
