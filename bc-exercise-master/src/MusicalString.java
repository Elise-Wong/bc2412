public class MusicalString {
  private String instrument;
  private int noOfString;
  private String country;

  public MusicalString(String instrument, int noOfString, String country){
    this.instrument = instrument;
    this.noOfString = noOfString;
    this.country = country;
  }

  public String getInstrument(){
    return this.instrument;
  }

  public int getNoOfString(){
    return this.noOfString;
  }

  public String getCountry(){
    return this.country;
  }

  public static void main(String[] args){
    MusicalString m1 = new MusicalString("violin", 4, "Italy");
    MusicalString m2 = new MusicalString("guqin", 7, "China");
    MusicalString m3 = new MusicalString("yangin", 144, "China");

    System.out.println(m3.getNoOfString() + ", " + m3.getCountry());




  }
}
