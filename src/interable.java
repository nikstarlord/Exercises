public interface interable {
    public default void show(){
        System.out.println("Default method....");
    }
    public static void display(){
        System.out.println("inside static interface..");
    }
}
 interface iterable{
    void sum();
    public default void show(){
        System.out.println("Inside iterable interface....");
    }
}

class Inter implements interable , iterable{
     public void show(){
         System.out.println("Overridden Method show...");
    }
    public void sum(){
        System.out.println("inside sum");
    }
    public static void main(String[] args) {
        Inter inter = new Inter();
        inter.show();
        inter.sum();
        interable.display();
    }
}
