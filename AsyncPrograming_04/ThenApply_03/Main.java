package AsyncPrograming_04.ThenApply_03;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer>num = CompletableFuture.supplyAsync(new Sum(), executorService);

        CompletableFuture<Integer>ans = num.thenApply(n-> {
            return n*10;
        });
        System.out.println(ans.join());

        executorService.shutdown();
    }
}
