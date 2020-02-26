package lambdaDemo;

@FunctionalInterface
public interface incrementable {
    int increment(int a);
}

class Increment{
    public static void main(String[] args) {
        incrementable incrementable = a -> {
          return a+=1;
        };
        System.out.println(incrementable.increment(6));
    }
}
