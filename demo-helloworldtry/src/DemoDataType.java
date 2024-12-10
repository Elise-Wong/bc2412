public class DemoDataType {
    public static void main(String[] args) {
        int x = 3;
        int day0fWeek = 7;
        double y2 = 3.2;
        x = 101;
        x = x + 10;
        x = x - 40;
        x = x * 3;
        x = x / 213;

        x = x + 8 * 2 / 4 + 1;
        x = (x + 2) * 2 / (3 + 1);
        x = ((x + 3) / (6 + 1)) * (x + 1);
        
        System.out.println(x);

        int x2 = 3 /2;
        System.out.println(x2);

        double x3 = 3 / 2;
        System.out.println(x3);

        double x4= 3.0 / 2;
        System.out.println(x4);

        System.out.println(0 / 10);

        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        byte maxByte = 127;
        byte minByte = -128;

        maxByte = maxByte + 8; //not safe

        short maxSshort = 32_767;
        short minShort = -32_768;

        minShort = minShort - 8; //not safe

        long l1 = 2_147_483_647;
        long l2 = -2_147_483_648;

        l1 = l1 * 2;

        System.out.println(maxByte);
        System.out.println(minShort);
        System.out.println(l1);

        double d1 = 10.2;
        double d2 = 10.2d;
        float f1 = 10.2f;
        float f2 = 11.2222222; //not safe

        float f4 = 10.2f;
        double d3 = f4;
        float f5 = d3; //not safe

        double d4 = 10.2f; 

        double d5 = f4 +10.2d; //not safe
        System.out.println(d5); //not safe


        char c = ‘x’;
        char c2 = ‘1’;
        char c3 = ‘!’;
        char c4 = ‘ ’;

        boolean b = true;
        boolean b8 = false;

        boolean isSlmoker = false;
        int age = 66;
        boolean isEderly = age > 65;
        System.out.println(isElderly);

        int age2 = 18;
        boolean isAdult = age2 >= 18;
        System.out.println(isAdult);

    }
}
