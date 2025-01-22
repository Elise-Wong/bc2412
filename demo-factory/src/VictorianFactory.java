package factory;
import Chair;
import Sofa;
import VictorianChair;
import VictorianSofa;

public class VictorianFactory implements FurnitureFactory{

    @Override
    public Chair createChair(){
        System.out.println("I have my own way to create Victorian Chair.");
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa(){
        System.out.println("I have my own way to create Victorian Sofa.");
        return new VictorianSofa();
    }


}
