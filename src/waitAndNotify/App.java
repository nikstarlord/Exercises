package waitAndNotify;

import java.util.Scanner;

class Processor {
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer.....");
            wait();
            System.out.println("Producer is Back.....");
        }

    }

    public void consumer() throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this){
            System.out.println("Waiting for Return key....");
            sc.nextLine();
            System.out.println("Key pressed");
            notify();
            Thread.sleep(5000);
        }



    }

}

public class App {

    public static void main(String[] args) {
        final Processor processor=new Processor();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
