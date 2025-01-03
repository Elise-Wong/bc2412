public class Animal {
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
    public void eat(){
      System.out.println("Animal is walking...");
    }
  
  
    public static void main(String[] args) {

    }

}
