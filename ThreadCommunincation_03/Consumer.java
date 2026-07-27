package ThreadCommunincation_03;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer _buffer){
        buffer = _buffer;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                buffer.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
