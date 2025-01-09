public class Dog extends Animal implements KeepAlive{
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



  @Override
  public void drink(){
    System.out.println("Dog is drinking...");
  }

  @Override
  public void sleep(){
    System.out.println("Dog is sleeping...");
  }




  public static void main(String[] args) {
    Dog dog = new Dog("www");
    System.out.println(dog.getName());
    dog.walk();
    
    dog.drink(); //Dog is drinking...
    dog.sleep(); //Dog is sleeping...



  }

}