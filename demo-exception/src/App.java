public class App {

    //2. Nullpointer Exception (NPE)
    public static String concat(String x, String y){ //x can be null
        if (x == null){
            throw new IllegalArgumentException();//throw object under exception, Argument=parameters
            //complain method input parameters
            //throw is similar to return; not in main
        }
        return x.concat(y);
    }

    public static void main(String[] args){
        //when develpor forsee, then Avoid
        //1. ArithmeticException: /by zero
        int q = 0;
        if (q != 0){
            int x = 10 / q; //ArithmeticException: /by zero
        } else{
            System.out.println("Q is zero.");
        }

        //Hidden exception
        try{
            int a = 10 / q; //Java by default throw exception for some scenario (i.e. 0)
        } catch (IllegalArgumentException e){
            System.out.println("Cannot divided by zero.");
        }

        
        //2. Nullpointer Exception (NPE)
        String s = null;
        //System.out.println(s.charAt(0)); ...死左error, should be avoid
        String result = null; //for checking at last, like Scanner

        try{
        concat(null, "abc"); //method caller: call method...since concat is using 人地的
        } catch (IllegalArgumentException e){
            //1. catch class
            //2. when sth wrong happen within the try block
            System.out.println("Ignore the bomb.");
        }
        System.out.println("hello");


        //3. Integer.parseInt
        String input2 = "-3";
        int x2 = 0;
        try{
            x2 = Integer.parseInt(input2);
         } catch (NumberFormatException e){
            x2 = -1;
         }
         System.out.println(x2); //-1

        int x3 = Integer.parseInt("-3"); //from String to int
        System.out.println(x3); //-3


        //4. java.lang.ArrayIndexOutOfBoundsException
        //Avoid
        String[] arr = new String[] {"abc", "def", "ijk"};
        //System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++){ //for avoid
            System.out.println(arr[i]);
        }


        //5. java.lang.StringIndexOutOfBoundsException
        String s3 = "hello";
        //System.out.println(s3.charAt(s3.length())); //死左
        //System.out.println(s3.charAt(s3.length() - 1)); //u want the last word




        

    }
}
