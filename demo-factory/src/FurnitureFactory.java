
public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    public static FurnitureFactory create(Style style) throws Exception{
        switch (style) {
            case MODREN:
                return new ModernFactory();
            case VICTORIAN:
                return new VictorianFactory();
        }
        throw new Exception("Unknown Style of Furniture");
    }
    


}
