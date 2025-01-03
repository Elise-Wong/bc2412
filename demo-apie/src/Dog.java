public class Dog extends Animal{
  //Attributes

  
  //construtor
  public Dog(String name){
    super(name);
  
  }


  //getter


  
  //setter
  public void walk(){
    System.out.println("Dog is walking...");
  }


  public static void main(String[] args) {
    Dog dog = new Dog("www");
    System.out.println(dog.getName());
    dog.walk();
  }

}