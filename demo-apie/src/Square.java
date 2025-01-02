public class Square extends Shape {
  //Attributes
  private double weight;
  private double height;
  
    
  //construtor
  public Square(String color, double weight, double height){
  super(color);
  this.weight = weight;
  this.height = height;
    
  }
  
  
  //getter
  
  
    
  //setter
  public void come(){
    System.out.println("Square is coming...");
  }
  
  
  public static void main(String[] args) {
    Square s1 = new Square("yellow", 5.0, 5.0);
    System.out.println(s1.getColor());
    
  }
  
  }


