import java.util.Scanner;

public class TestFurniture {
    public static void main(String[] args) {
        Chair chair=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Chair type:");
        String str=sc.next();
        if(str.equals("Wooden")){
            chair=new WoodenChair();
        }
        else {
            chair = new MetalChair();
        }
        System.out.println(chair.chairtype());
        chair.fireTest();
        chair.stressTest();
    }
}
