package AtomicOperation_06;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[]args){
        AtomicInteger atomicInteger = new AtomicInteger();

        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                atomicInteger.incrementAndGet();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                atomicInteger.incrementAndGet();
            }
        });

        try{
            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Final value: "+ atomicInteger.get());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
