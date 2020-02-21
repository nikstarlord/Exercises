import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Proce implements Runnable{

    @Override
    public void run() {
            System.out.println("Odd numbers....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=1;i<20;i+=2){
                System.out.println(Thread.currentThread().getName()+" Value:"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}

class Proc implements Runnable{

    @Override
    public void run() {
            System.out.println("Even numbers....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<20;i+=2){
                System.out.println(Thread.currentThread().getName()+" Value:"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}


public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new Proc());
        executor.submit(new Proce());
        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
