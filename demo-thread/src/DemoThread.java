public class DemoThread {

    //main thread (worker A)
    //another thread (worker B)

    public static void main(String[] args) throws Exception {
        int x = 3;
        x++;
        System.out.println(x); //4
        ++x;
        System.out.println(x); //5
        x += 1;
        System.out.println(x); //6

        //create another thread
        //1. Task
        //2. Thread
        Runnable sayHelloTask = () -> System.out.println("Hello~~");
        StringBuilder sb = new StringBuilder("");
        Runnable concatStringMillionTimes = () -> {
            for (int i = 0; i < 1; i++){
                sb.append("!");
            }
            //System.out.println(sb.length()); //1, executed by workerB
        };
        //funtioninterface ; 
        sayHelloTask.run(); //Hello~~"

        Thread workerB = new Thread(concatStringMillionTimes);
        workerB.start(); //to start a thread //main thread (worker A) executes a new Thread (worker B)
        //main thread proceed its own task

        System.out.println(sb.length()); //0(likely), becos main thread running, not workerB, 因為主線行快過副線, but a must; likely to be
            //executed by workerA (main thread)
        System.out.println("Program end");






    }
}
