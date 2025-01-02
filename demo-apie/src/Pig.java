public class Pig extends Animal{
  //Attributes
  private char gender;
  private double weight;

  
  //construtor
  public Pig(String name, char gender){
  super(name); //if ("XYZ")....name 永遠叫XYZ
  this.gender = gender;
  }

  //empty construtor
  public Pig(){
  }

// implicityly calling super() 隱

  


  //getter


  
  //setter
  public void sleep(){
    System.out.println("Pig is sleeping...");
  }


  public static void main(String[] args) {
    Pig pig = new Pig("ppp", 'F');
    Pig pigg = new Pig();
    System.out.println(pigg.getName());
    pig.sleep();
  }

}