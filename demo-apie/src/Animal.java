public class Animal implements Eatable{
  //Common attribute of Cat and Dog
  private String name;

  //construtor
  public Animal(String name){
    this.name = name;
  }

  //empty constructor
  public Animal(){  
  }
  
  
   //getter
   public String getName(){
   return this.name;
   }
  
  
    //setter
    //Contract Content
    @Override
    public void eat(){
      System.out.println("Animal is walking...");
    }
  
  
  public static void main(String[] args) {

    new Animal(); //OK, becos it is normal class

    Cat cat = new Cat("Jimmy", 3);
    System.out.println(cat.getName()); //Jimmy

     
    Animal cat2 = new Cat("Mary", 2);
    cat2.eat(); //Cat is eating...

    //Rule 1. During the compile time, "Animal cat2" imply the object can be accessed in "Animal Scope"
    //not in run time
    //hide the object instance method, i.e. walk(), sleep()
    ///cat2.sleep(); //violatee Rule 1
    ///cat2.walk();
    
    //Rule 2. Runtime
    cat2.eat(); //find the object during runtime.
    //found that the object actually is a cat object
    //so cat2.eat() --> Cat.class's eat()

    Animal cat3 = new Animal("Vincent");
    cat3.eat(); //Animal is eating...
    
    //cannot place a parent object to a child reference
    ///Cat cat4 = new Animal("Lucas");

    ///Exampl 1:
    /// no need further add Cat[], Dog[], Pig[] (array)
    /// abstract cant add object, but can add object array
    Animal[] animals = new Animal[4]; //Cat, Dog, Pig
    animals[0] = new Cat("KK", 2);
    animals[1] = new Dog("BB");
    animals[2] = new Pig("PP", 2);
    animals[3] = new Animal("XX"); //if u dont want new Animal, put abstract in Animal.class

    Cat[] cats = new Cat[3];
    cats[0] = new Cat("123", 4);
    Dog[] dogs = new Dog[2];
    Pig[] pigs = new Pig[3];


    ///Example 2:
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle1("white", 3.0);
    shapes[1] = new Square(Color.YELLOW, 9.0, 9.0);
    shapes[2] = new Triangle("red", 4.0, 5.0);

    ///for loop 可以loop 住array
    /// for loop loop 住shape array
    for (Shape shape : shapes){
      System.out.println(shape.areaa());
      //System.out.println(shape.getRadius());//cant, as not common factor
    }

    //for (int i = 0; i < shapes.length; i++){
   //   System.out.println(shapes.areaa());
   // }


    ///Example 3: Downcast
    for (Shape shape : shapes){
      if (shape instanceof Circle1){ //check if shape is instance of Circle?
        Circle1 circle1 = (Circle1) shape; // similar to "double y = 2.0; int x = int y;"
        System.out.println(circle1.getRadius()); //comply with Rule 1: type
      } else if (shape instanceof Square){
        Square square = (Square) shape;
        System.out.println(square.getWeight()); //comply with Rule 1: type
      }
    }


    //Example 4: for Interface
    Eatable cat4 = new Cat("Tammy", 6);
    cat4.eat(); //Cat is eating...
    //cat4.walk();...cant

    Sleepable[] animals2 = new Sleepable[2];
    animals2[0] = new Cat("Steve", 2);
    animals2[1] = new Dog("Owen");
    // animals2[1] = new Animal(); ...Animal didnt implement Eatable
    animals2[1].sleep(); //Dog is sleeping...
    animals2[0].sleep(); //Cat is sleeping...
    //animals2[0].eat();....cat


  }

}
