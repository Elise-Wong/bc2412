public class Aroma {
    private String plant;
    private String part;
    private int note;
    private int oh;

    public Aroma(String plant, String part, int note, int oh){
        this.plant = plant;
        this.part = part;
        this.note = note;
        this.oh = oh;
    }

    public String getPlant(){
        return this.plant;
    }

    public String getPart(){
        return this.part;
    }

    public int getNote(){
        return this.note;
    }

    public int getOh(){
        return this.oh;
    }


    public static void main(String[] args){
        Aroma a1 = new Aroma("vetiver", "root", 3, 15);
        Aroma a2 = new Aroma("frankincese", "resin", 2, 20);
        Aroma a3 = new Aroma("sweetMarjoram", "whole",2, 10);

        System.out.println(a3.getPlant() + a3.getPart() + a3.getOh() + a3.getNote());


       
    }
}
