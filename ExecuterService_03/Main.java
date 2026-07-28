package ExecuterService_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[]args){
        Counter counter = new Counter();

        //1. create executor service 
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //execute to work the thread 
        executor.execute(counter);
        executor.execute(counter);
        executor.execute(counter);

        //Output :
       // pool-1-thread-1 is executing task...
       // pool-1-thread-2 is executing task...
       // pool-1-thread-1 is executing task...

       executor.shutdown();
    }
}
