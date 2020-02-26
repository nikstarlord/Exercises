package lambdaDemo;

@FunctionalInterface
public interface constReferencable {
    void dis();
}

class Referencing{
    private String name;
    private int age;
    private String city;

    private  Referencing(){
        System.out.println("hello inside constructor referencing....");
    }

    public static void main(String[] args) {
        constReferencable cons = Referencing ::new ;
        cons.dis();

    }
}
