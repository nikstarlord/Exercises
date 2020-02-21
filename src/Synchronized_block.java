
public class Synchronized_block {
    private Object obj=new Object();
    private int count =0;
    public  void increment(){
        synchronized (obj){
            count++;
        }
    }
    public static void main(String[] args)  {
        Synchronized_block synchronized_block=new Synchronized_block();
        synchronized_block.run();
    }
    public void run(){
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
        });
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
        });
        th.start();
        th1.start();
        try {
            th.join();
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
