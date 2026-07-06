package RaceCondition_02.Locking.ReentrantLock;

public class Main {
    public static void main(String[]args){
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0;i<1000000;i++){
                counter.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000000;i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Count: "+counter.getCount());
        //here the final count will be 2000000 because of locking using ReentrantLock.
    }
}
