package AsyncPrograming_04.RunAsync_01;

public class Logger implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread: "+Thread.currentThread().getName());
        System.out.println("Logger logging........");
    }
}
