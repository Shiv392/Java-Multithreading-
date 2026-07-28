package ExecuterService_03.CallableSubmit_03;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    @Override
    public Integer call(){
        System.out.println(
            Thread.currentThread().getName()
        );

        return 10 + 20;
    }
}
