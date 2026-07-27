package ThreadCommunincation_03;

public class Producer  implements Runnable{

    private Buffer buffer;

    public Producer(Buffer _buffer){
        buffer = _buffer;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                buffer.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
