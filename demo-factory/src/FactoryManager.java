import factory.VictorianFactory;

public class FactoryManager {
  public static FurnitureFactory createFactory(Furniture.Style style){
    return switch (style){
      case MODREN -> {
        yield new ModernFactory();
      }
      case VICTORIAN -> {
        yield new VictorianFactory();
      }
    }
  }

}
