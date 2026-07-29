package AsyncPrograming_04.ThenAccept_04;

import java.util.function.Supplier;

public class Sum implements Supplier<Integer> {
    @Override
    public Integer get(){
        return 10+10;
    }
}
