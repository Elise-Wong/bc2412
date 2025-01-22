public class ModernFactory implements FurnitureFactory{

    @Override
    public Chair createChair(){
        System.out.println("I have my own way to create Modern Chair.");
        return new ModernChair();
    }

    @Override
    public Sofa createSofa(){
        System.out.println("I have my own way to create Modern Sofa.");
        return new ModernSofa();
    }

}
