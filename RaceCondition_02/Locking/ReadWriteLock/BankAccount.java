package RaceCondition_02.Locking.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccount {
    private int balance = 100;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    //if we pass true in the ReentrantReadWriteLock(true) : then it works as 
    //phle existing readers finish krenge then write execute krega then uske bad new reader
    //ko change milea 
    //read1 | read2 | read3 | write | read4

    //lock.readLock.lock() for read locking 
    public int getBalance(){
        lock.readLock().lock();
        try{
            return balance;
        }
        finally{
            lock.readLock().unlock();
        }
    }

    //lock.writeLock.lock() for write locking 
    public void deposit(int amount){
        lock.writeLock().lock();
        try{
            balance+=amount;
        }
        finally{
            lock.writeLock().unlock();
        }
    }
}
