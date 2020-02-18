public class ClassDef {
    public void fun(){
        System.out.println("Inside ClassDef");
    }
}
class TestClassDef{
    public static void main(String args[]){
        ClassDef classDef =new ClassDef();
        classDef.fun();
    }
}
