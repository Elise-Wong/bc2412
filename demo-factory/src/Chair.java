public abstract class Chair { // interface

    abstract boolean hasLeg();
    abstract boolean sitOn();

    public static Chair create(FurnitureFactory factory){
        return factory.createChair();
    }


}
