package VisibilityProblem_05;

public class Task implements Runnable {
    private volatile boolean flag = true;

    public void stop(){
        flag = false;
    }

    @Override 
    public void run(){
        while(flag){
            System.out.println("Thread is running"+ Thread.currentThread().getName());
        }
    }
}
