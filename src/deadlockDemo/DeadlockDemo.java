class Shared
{
    // first synchronized method 
    synchronized void test1(Shared s2) throws InterruptedException {
        System.out.println("test1-begin");
        Thread.sleep(1000);

        // taking object lock of s2 enters 
        // into test2 method 
        s2.test2(this);
        System.out.println("test1-end");
    }

    // second synchronized method 
    synchronized void test2(Shared s1) throws InterruptedException {
        System.out.println("test2-begin");
        Thread.sleep(1000);

        // taking object lock of s1 enters 
        // into test1 method 
        s1.test1(this);
        System.out.println("test2-end");
    }
}


class Thread1 extends Thread
{
    private Shared s1;
    private Shared s2;

    // constructor to initialize fields 
    public Thread1(Shared s1, Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    // run method to start a thread 
    @Override
    public void run()
    {
        // taking object lock of s1 enters 
        // into test1 method 
        try {
            s1.test1(s2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Thread2 extends Thread
{
    private Shared s1;
    private Shared s2;

    // constructor to initialize fields 
    public Thread2(Shared s1, Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    // run method to start a thread 
    @Override
    public void run()
    {
        // taking object lock of s2 
        // enters into test2 method 
        try {
            s2.test2(s1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class DeadlockDemo
{
    public static void main(String[] args) throws InterruptedException {
        // creating one object 
        Shared s1 = new Shared();

        // creating second object 
        Shared s2 = new Shared();

        // creating first thread and starting it 
        Thread1 t1 = new Thread1(s1, s2);
        t1.start();

        // creating second thread and starting it 
        Thread2 t2 = new Thread2(s1, s2);
        t2.start();

        // sleeping main thread 
        Thread.sleep(2000);
    }
} 