package AsyncPrograming_04.ThenAccept_04;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName());
            return 10+20;
        }).thenApplyAsync(n->{
            return n*10;
        }).thenAcceptAsync(n->{
            System.out.println("Accept: "+n+" "+Thread.currentThread().getName());
        }).join();
    }
}
