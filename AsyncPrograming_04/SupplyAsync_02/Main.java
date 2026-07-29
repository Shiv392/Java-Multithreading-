package AsyncPrograming_04.SupplyAsync_02;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    //here it will use by default forkJoinPool.commonPool 
    //by default pool of JVM.
    //supplyAsync will create an thread pool 
    //    CompletableFuture<Integer>future = CompletableFuture.supplyAsync(()->{
    //     System.out.println("Thread: "+Thread.currentThread().getName());
    //     return 10+20;
    //    });
    //    System.out.println(future.join());

    //2. getting response from Sum Task
    //here it will use thread pool of executor service
    CompletableFuture<Integer>sum = CompletableFuture.supplyAsync(new Sum(), executorService);
    System.out.println("Sum value: "+sum.join());

    CompletableFuture<String>loginRepo = CompletableFuture.supplyAsync(new LoginRepository(), executorService);
    System.out.println(loginRepo.join());

    executorService.shutdown();
    }
}
