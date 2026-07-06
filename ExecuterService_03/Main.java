package ExecuterService_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[]args){
        Counter counter = new Counter();

        //Creat a thrad pool of size 2
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //submit task1
        executor.execute(()->{
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
            System.out.println("Task 1 Completed");
        });

        //submit task2 
        executor.execute(()->{
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
            System.out.println("Task 2 Completed");
        });

        //stop acceptin new task
        executor.shutdown();

         // Wait until all submitted tasks finish
        while (!executor.isTerminated()) {
            // Busy waiting
        }

        // Print final result
        System.out.println("Final Count : " + counter.getCount());
    }
}
