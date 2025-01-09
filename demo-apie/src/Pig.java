import java.util.Objects;

public class Pig extends Animal{
  //Attributes
  private char gender;
  private double weight;
  private int age;

  
  //construtor
  public Pig(String name, char gender){
  super(name); //if ("XYZ")....name 永遠叫XYZ
  this.gender = gender;
  }

  public Pig(String name, int age){
    super(name);
    this.age = age;
  }

  //empty construtor
  public Pig(){
  }

  // implicityly calling super() 隱含call緊 Parent

  //implicitly extend Object.class (Object.equals() is for checking if they are same memory object)
  @Override
  public boolean equals(Object obj){
  //same object --> they must be same
    if (this == obj)
      return true;
    if (!(obj instanceof Pig)) //instanceof = object of; no risk
      return false;
    Pig pig = (Pig) obj; //Polymorphism; from Parent class to Child class (int x = (int) 10L)
      return Objects.equals(pig.getAge(), this.age)
          && Objects.equals(pig.getName(), super.getName()); //落這句是做checking
      //= return pig.getAge() == this.age && pig.getName().equals(super.getName());
    }

  //implicitly extend Object.class (Object.hashCode() is for checking if they are same memory object, check object's)
  @Override
  public int hashCode(){
    return Objects.hash(this.age, super.getName()); //only has this
    //hash --> generate a new int number representing the object
  }

  @Override
  public String toString(){
    return "Pig["
          + "age=" + this.age
          + ", name=" + super.getName()
          + "]";
  }


  //getter
  public int getAge(){
    return this.age;
  }


 
  //setter
  public void sleep(){
    System.out.println("Pig is sleeping...");
  }


  public static void main(String[] args) {
    Pig pig = new Pig("ppp", 'F');
    Pig pigg = new Pig();
    System.out.println(pigg.getName());
    pig.sleep();

    Object object = new Object();

    Pig myPig = new Pig("ABC", 3);
    Pig checkPig = new Pig("ABC", 3);

    //equals()
    if(myPig.getAge() == checkPig.getAge() && myPig.getName() == checkPig.getName()){

    }

    if (myPig.equals(checkPig)){
      System.out.println("same"); //after override, if they are having same value of attributes, they should be same in class.
    } else{
      System.out.println("Not same!"); //before override, because equal() implemnetation from Object.class
    }

    System.out.println(myPig.hashCode());


    String s = new String("hello");
    String s2 = new String("hello");
    System.out.println(s.equals(s2)); //true, equals = override by 作者
    System.out.println(s.equals("hello")); //true

    //String.class override toString() Mehod
    System.out.println("hello".toString());
    System.out.println(myPig); //Pig[age=3, name=ABC]



    }
  }
