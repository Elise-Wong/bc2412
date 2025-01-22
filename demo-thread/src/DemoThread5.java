import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoThread5 {
    private Map<Integer, String> map; //HashMap is not thread-safe

    public DemoThread5(){
        this.map = new Hashtable<>(); //HashMap-->Hashtable    
        //this.map = Collections.synchronizedMap(new HashMap<>()); //also ok
        //ConcurrentHashMap etc.
    }

    public String put(Integer key, String value){
        return this.map.put(key, value);
    }

    public int size(){
        return this.map.size();
    }

    public static void main(String[] args) {
        //put (i, )

        DemoThread5 central = new DemoThread5();
        //100_000
        Runnable putEntryTask1 = () -> {
            for (int i = 0; i < 1_000_000; i++){
                central.put(i, "abc");
        
            }
        };

        Runnable putEntryTask2 = () -> {
            for (int i = 1_000_000; i < 2_000_000; i++){ //key is difference
                central.put(i, "abc");
            }
        };

        Thread workerB = new Thread(putEntryTask1);
        workerB.start();

        Thread workerC = new Thread(putEntryTask2);
        workerC.start();

        try{
            workerB.join();
            workerC.join();
        }  catch (InterruptedException e){

        }
        System.out.println(central.size());



    }

}
