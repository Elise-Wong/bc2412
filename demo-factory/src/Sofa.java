public interface Sofa {

    boolean isSingleSeat();

    public static Sofa create(FurnitureFactory factory){
        return factory.createSofa();
    }

}
