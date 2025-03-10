import java.math.BigDecimal;

//the T in "Class, instance variable, instance method" are with same definition
//but the T in static method is completely different thing
public class Box <T extends Shape>{ //要鎖住shape, 才可以用shape內的東西
  //Attributes
  private T[] shapes;


  //constructor
  public Box(){
    this.shapes = (T[]) new Shape[2];  //list
    //T係寫唔到array, cannot new T[2]
  }

  //instance method
  //the T in instance method refers to the definition T of Class
  public void addShape(int index, T shape){
    this.shapes[index] = shape;
  }

  //getter
  public double totalArea(){  //shapes[0].area()
    //this.shapes[0].areaa();

    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape shape : this.shapes){
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }


  //the T in static method is not referring the T in Class
  public static <T extends Shape> double totalArea2(T[] shapes){
    return 0.1;
  }

  //setter
  

  public static void main(String[] args) {
    Box<Circle1> box1 = new Box<>();
    box1.addShape(0, new Circle1(3.0));
    box1.addShape(1, new Circle1(4.0));
    System.out.println(box1.totalArea()); //abtraction //78.53981633974483

    // add Circle to shape[0]
    // add Square to shape[1]
    Box<Square> b2 = new Box<>();
    b2.addShape(3, new Circle1(3.0));
    b2.addShape(1, new Square(3.0));
    System.out.println(b2.totalArea());




  }

}
