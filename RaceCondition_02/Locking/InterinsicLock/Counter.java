package RaceCondition_02.Locking.InterinsicLock;

public class Counter {
    private int count = 0;

    //Block synchronized
    public void increment(){
        synchronized(this){
            count++;
        }
    }
    
    //method synchronized : Lock the entire method
    // public synchronized void increment(){
    //     count++;
    // }

    public int getCount(){
        return count;
    }
}
