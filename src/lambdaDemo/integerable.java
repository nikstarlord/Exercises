package lambdaDemo;

@FunctionalInterface
public interface integerable {

    int integer(int a, int b);
}

class Inter{
    public static void main(String[] args) {
        integerable inte = (int a, int b) ->{
            return a;
        };
        System.out.println(inte.integer(34,56));
    }
}
