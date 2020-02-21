package semaphoreDemo;


import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connections{
    private static Connections instance = new Connections();
    private Semaphore semaphore = new Semaphore(10);
    private int connection=0;

    private Connections(){

    }

    public static Connections getInstance(){
        return instance;
    }
    public void connect(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            doconnect();
        }
        finally {
            semaphore.release();
        }
    }

    public void doconnect(){

        synchronized (this){
            connection++;
            System.out.println("Current Connection:"+connection);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this){
            connection--;
        }
    }
}

public class SemaphoreDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0;i<200;i++){
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    Connections.getInstance().connect();
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
