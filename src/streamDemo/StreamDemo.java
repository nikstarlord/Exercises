package streamDemo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(24,34,56,76,89)
                .stream()
                .filter(e-> e>3 && e%2==0)
                .findFirst());
    }
}
