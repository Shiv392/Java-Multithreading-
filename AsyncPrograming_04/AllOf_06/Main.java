package AsyncPrograming_04.AllOf_06;

import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        try {
            System.out.println("API Started.....");
            CompletableFuture<String>user = CompletableFuture.supplyAsync(()->{
                sleep(1000);
                return "This is User";
            }, service);

            CompletableFuture<String>products = CompletableFuture.supplyAsync(()->{
                sleep(1000);
                return "This is product";
            }, service);

            CompletableFuture<String>payments = CompletableFuture.supplyAsync(()->{
                sleep(1000);
                return "This is payment";
            }, service);

            CompletableFuture<Void>all = CompletableFuture.allOf(user, products, payments);
            all.thenRun(()->{
                System.out.println("All API Done............");
                System.out.println(user.join());
                System.out.println(products.join());
                System.out.println(payments.join());
            });

            all.join();

        }       
        finally{
            service.shutdown();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
