package AsyncPrograming_04.SupplyAsync_02;

import java.util.function.Supplier;

//to use inside supplyAsync we have to implemnt Supplier
public class Sum implements Supplier<Integer>{
    @Override
    public Integer get(){
        System.out.println("Thread : "+Thread.currentThread().getName());
        return 10+20;
    }
}
