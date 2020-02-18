public class Singleton {
    private static Singleton instance=null;
    public String str;
    private  Singleton(){
        str="Hey inside Singleton Class";
    }
    public static Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}
class TestSingleton{
    public static void main(String args[]){
        Singleton a=Singleton.getInstance();
        Singleton b=Singleton.getInstance();
        Singleton c=Singleton.getInstance();
        a.str=(a.str).toLowerCase();
        System.out.println("Instance of A:"+a.str);
        System.out.println("Instance of B:"+b.str);
        System.out.println("Instance of C:"+c.str);
    }
}
