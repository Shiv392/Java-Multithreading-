package ExecuterService_03.CallableSubmit_03;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //Getting callable task result value
        Future<Integer>future = executor.submit(new Sum());
        System.out.println("Task submitted");

        try{
            Object result = future.get();
            System.out.println("sum class result -------->" + result);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        catch(ExecutionException e){
            e.printStackTrace();
        }
        
        executor.shutdown();
    }
}
