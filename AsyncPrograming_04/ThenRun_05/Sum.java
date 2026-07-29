package AsyncPrograming_04.ThenRun_05;

import java.util.function.Supplier;

public class Sum implements Supplier<Integer>{
    @Override
    public Integer get(){
        return 10+20;
    }
}
