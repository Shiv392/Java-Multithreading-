package ExecuterService_03;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;

    ReentrantLock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try{
            count++;
        }
        finally{
            lock.unlock();
        }
    }

    public int getCount(){
        return count;
    }
}
