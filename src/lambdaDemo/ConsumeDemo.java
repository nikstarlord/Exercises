package lambdaDemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumeDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> function = ( a) -> {
            return a+=2;
        };
        System.out.println("result of Function:"+ function.apply(45));
    }
}
