public class Static {
    static String var="Nikhil Sharma";
    static  int age=20;
    static {
        System.out.println("Inside Static block:"+" Name is :"+var+" age is :"+age);
    }
    public static void main(String args[]){
        System.out.println("Inside  Main :"+" Name is:"+var+" Age is:"+age);
    }
}
