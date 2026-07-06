package Threads_01.ThreadMethods;

public class Main {
    public static void main(String[]args){
        Thread t = new Thread(()-> System.out.println("Thread is running...."+ Thread.currentThread().getName()));
        t.start();

        try{
            t.join();
            t.sleep(4000);
        }
        catch(Exception e){

        }

        System.out.println("Main Thread is running...."+ Thread.currentThread().getName());
        // t.start(); //IllegalThreadStateException Run time Error.
    }
}


//here each thread has a lifecycle like new -> runnable -> running -> waiting -> dead.
//after their execution is completed they are dead and cannnot be restarted again.
//if we try to restart a dead thread it will throw and IllegalThreadStateException Run time Error.