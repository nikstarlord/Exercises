package lambdaDemo;

@FunctionalInterface
public interface upperable {
    String upper(String a);
}

class Upper{
    public static void main(String[] args) {
        upperable upper= a -> {
          return a.toUpperCase();
        };
        System.out.println(upper.upper("Nikhil"));
    }
}
