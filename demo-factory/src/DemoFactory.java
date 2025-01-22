//import java.lang.invoke.ClassSpecializer.Factory;

public class DemoFactory {
  public static void main(String[] args) {


    //ModernChair modernChair = new ModernChair();
    VictorianChair victorianChair = new VictorianChair();

    //Runtime Polymorphism
    //Chair mc = new ModernChair();
    Chair vc = new VictorianChair();
    //System.out.println(mc.sitOn());
    //System.out.println(mc.hasLeg());
    System.out.println(vc.sitOn());
    System.out.println(vc.hasLeg());

    FurnitureFactory factory = new ModernFactory();
    //FurnitureFactory f1 = FactoryManager.createFactory(Furniture.Style.VICTORIAN);
    
    //decouple分離,解偶
    //no need change again 
    Chair chair = factory.createChair(); 
    System.out.println(chair.sitOn());
    System.out.println(chair.hasLeg());
    



  }

}
