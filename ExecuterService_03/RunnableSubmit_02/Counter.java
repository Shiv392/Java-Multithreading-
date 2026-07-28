package ExecuterService_03.RunnableSubmit_02;

public class Counter implements Runnable {
    @Override
    public void run(){
        System.out.println(
            Thread.currentThread().getName() +
            " is executing task..."
        );
    }
}
