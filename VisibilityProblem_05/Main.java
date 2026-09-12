package VisibilityProblem_05;

public class Main{
    public static void main(String[]args){
        //1. With visibility Problem
        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        try{
            t1.start();
            t2.start();

            Thread.sleep(2000);

            task.stop();

            t1.join();
            t2.join();

            System.out.println("Thread 1 completed");
            System.out.println("Thread 2 completed");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}