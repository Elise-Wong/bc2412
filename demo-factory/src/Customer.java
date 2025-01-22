public class Customer {
    public static void main(String[] args) throws Exception{
        
        FurnitureFactory factory = FurnitureFactory.create(Style.MODREN);

        Chair chair = factory.createChair(); //I have my own way to create Modern Chair.
        System.out.println(chair.hasLeg()); //true

        Sofa sofa = factory.createSofa(); //I have my own way to create Modern Sofa.
        System.out.println(sofa.isSingleSeat()); //false
    }

}
