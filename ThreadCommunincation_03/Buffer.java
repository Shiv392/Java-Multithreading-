package ThreadCommunincation_03;

public class Buffer {
    private int item;
    private boolean available = false;

    //producer block 
    public synchronized void produce(int value) throws InterruptedException{
        while (available) {
            System.out.println("Buffer full. Producer waiting......");
            wait();
        }

        item = value;
        available = true;
        System.out.println("Producer produced : "+item);
        notify();
    }

    public synchronized void consume() throws InterruptedException{
        while(!available){
            System.out.println("Buffer empty. Consumer Waiting.....");
            wait();
        }

        System.out.println("Consumer Consumed: "+item);
        available = false;
        notify();
    }
}
