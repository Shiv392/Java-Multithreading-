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
    }
}
