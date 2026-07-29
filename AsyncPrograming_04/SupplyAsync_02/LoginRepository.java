package AsyncPrograming_04.SupplyAsync_02;

import java.util.function.Supplier;

public class LoginRepository implements Supplier<String> {
    @Override
    public String get(){
        return "Shiv Soni";
    }
}
