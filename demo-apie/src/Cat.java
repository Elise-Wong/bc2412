public class Cat extends Animal implements Walkable, Sleepable{ //extends: 子繼承了母
  //Animal.class is a Parent Class
  //Cat.class is a Child Class
  //Inherit all attribute from Parent Class
  
  //Attributes
  private int age;

  
  //construtor
  public Cat(String name, int age){
  /// must be the 1st line to call super()
    super(name); // Calling Parent Contructor
    this.age = age;
  }


  //getter
  //Inherit Parent all instance methods
  


  //setter
  @Override
  public void walk(){
    System.out.println("Cat is walking...");
  }

  @Override
  public void eat(){
    System.out.println("Cat is eating...");
  }

  @Override
  public void sleep(){
    System.out.println("Cat is sleeping...");
  }


  public static void main(String[] args) {
    Cat cat = new Cat("mmm", 18);
    System.out.println(cat.getName());
    cat.walk(); //Cat itself method
    cat.eat();  //override Parent method implementation.
    //"Animal is walking..." --> "Cat is eating..."
    //因為係Parent寫左System.out.println, 係child class 引用相關技能, 所以係child class 唔洗再打System.out.println都print到

    cat.walkFaster();

  }

}
