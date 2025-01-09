public interface Walkable {
  
  int x = 3; //implicitly static final
  void walk();

  //After Java 8, we can use default instance method.
  //similar to Parent class
  default void walkFaster(){ // default only can be written in interface , and present in implement (child class)
    System.out.println("A way to walk faster...");
  }

  //After Java 8, we can use static method in Interface.
  static int calculateDistance(){
    return -1;
  }
  
public static void main(String[] args) {
  System.out.println(Walkable.x);//3
  //Walkable.x = 4;//becos of static final, cant change any terms/figure
  
  
  System.out.println(Walkable.calculateDistance());//-1

}

}
