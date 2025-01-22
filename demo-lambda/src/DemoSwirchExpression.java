public class DemoSwirchExpression {
    public static void main(String[] args) {
        //switch + lambda
        System.out.println(Color.RED.getColorValue());
        System.out.println(BLUE.getColorValue2());
    }
//out of main

//enum
public static enum Color{
    RED, YELLOW, BLUE,;
}

//switch
//adv: 幫你睇住有冇少/多左
public static char getColorValue(Color color){
    return switch (color){
        case RED -> 'R'; //no : anymore
        case YELLOW -> 'Y';
        case BLUE -> 'B';
    };
}

public static String getColorValue2(Color color){
    return switch (color){
        case RED -> {
            yield "Red."; //yield = return
        } 
        case YELLOW-> {
            yield "Yellow."; 
        } 
        case BLUE-> {
            yield "Blue."; 
        } 
    };
}

}
