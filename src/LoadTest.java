public class LoadTest {
    public static void main(String[] args) {
        System.out.println("START");
        new C();
        System.out.println("END");
    }
}

class P extends Gparent {
    // Instance init block
    {
        System.out.println("instance - parent");
    }

    // Constructor
    public P() {
        System.out.println("constructor - parent");
    }

    // Static init block
    static {
        System.out.println("static - parent");
    }
}

class Gparent {
    // Static init block
    static {
        System.out.println("static - grandparent");
    }

    // Instance init block
    {
        System.out.println("instance - grandparent");
    }

    // Constructor
    public Gparent() {
        System.out.println("constructor - grandparent");
    }
}

class C extends P {
    // Constructor
    public C() {
        System.out.println("constructor - child");
    }

    // Static init block
    static {
        System.out.println("static - child");
    }

    // Instance init block
    {
        System.out.println("instance - child");
    }
}