public abstract class Shape {
  //Attributes
  private Color color;
  private double areaa;

  //construtor
  public Shape(Color color){
    this.color = color;
    this.areaa = areaa;
  }

  //empty constructor
  public Shape(){  
  }
  
  
  //getter
  public Color getColor(){
    return this.color;
  }
  
  
  //setter
  public void come(){
    System.out.println("xx is coming...");
  }

  public double areaa(){
    return 12;
  }

  public static Shape create(char ref, Color color){ // S--> Square, C--> Circle
    switch (ref){
      case 'S':
        return new Square(color, 3, 3);
      case 'C':
        return new Circle1(color, 1);
      case 'T':
        return new Triangle(color, ref, ref);
      default:
        return null;
    }
  }

  public static Shape createCircle(Color color, double radius){
    return new Circle1(color, radius);
  }
  
  public static void main(String[] args) {
    // new Shape ('R'); //Comile error, abstract class
    Shape.create('C', Color.RED);
    Circle1 c2 = (Circle1)Shape.createCircle(Color.RED, 3.0); // 因為parent 放左入child, downclass 



  }

}
