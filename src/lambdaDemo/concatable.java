package lambdaDemo;

@FunctionalInterface
public interface concatable {
    String concate(String a, String b);
}

class Concate {
    public static void main(String[] args) {
        concatable concatable = (String a, String b) -> {
            return a+" "+b;
        };
        System.out.println(concatable.concate("Nikhil","Sharma"));

    }
}
