import java.util.Scanner;

class Pro extends Thread{
    private volatile boolean running=true;

    @Override
    public void run() {
        while (running){
            System.out.println("Running...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutDown(){
        running=false;
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        Pro pro=new Pro();
        pro.start();
        new Scanner(System.in).nextLine();


        pro.shutDown();

    }
}
