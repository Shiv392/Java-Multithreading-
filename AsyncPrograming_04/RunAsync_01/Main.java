package AsyncPrograming_04.RunAsync_01;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//runAsync() only run the task and dont return any value for the completebleFuture response 
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        CompletableFuture<Void>future =CompletableFuture.runAsync(
            new Logger(), 
            executorService
        );

        future.join(); //wait till logger finishes

        executorService.shutdown();
    }
}
