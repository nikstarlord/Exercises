public class Multithreading extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Iter:"+i);
        }
    }

    public static void main(String[] args) {
        Multithreading multithreading=new Multithreading();
        Multithreading multithreading1=new Multithreading();
        multithreading.start();
        multithreading1.start();
    }
}
