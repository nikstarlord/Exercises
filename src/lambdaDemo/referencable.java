package lambdaDemo;

@FunctionalInterface
public interface referencable {
    void hello();
}

class Reference {

    void hellois(){
        System.out.println("Hello instance method");
    }

    static void hey(){
        System.out.println("Inside static method");
    }

    public static void main(String[] args) {
        referencable ref = Reference  :: hey;
        referencable ref1 = new Reference()  :: hellois;
        ref.hello();
        ref1.hello();
    }
}
