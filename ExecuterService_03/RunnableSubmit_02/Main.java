package ExecuterService_03.RunnableSubmit_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Future returns Runnable null value 
public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //Runnable Future
        Future<?>future = executor.submit(new Counter());
        System.out.println("Task Submitted........");

        //in Thread we have to use join() so that my main thread will wait untill 
        //thread complete their task.
        //in executor service we can also do same using Future and get(); 
        //Future<?>furuter = executor.submit(task);
        //future.get(); 

        try {
            Object result = future.get(); //posible null 
            System.out.println("Future result: "+result);
        } 
        catch (InterruptedException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            // TODO: handle exception
        }

        executor.shutdown();
    }
}
