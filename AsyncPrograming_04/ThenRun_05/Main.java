package AsyncPrograming_04.ThenRun_05;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            return 10+20;
        })
        .thenApplyAsync(n->{
            return n*10;
        })
        .thenAcceptAsync(n->{
            System.out.println("num: "+n);
        })
        .thenRunAsync(()->{
            System.out.println("Logger done......");
        }).join();

        System.out.println("ShivSoni");
    }
}
