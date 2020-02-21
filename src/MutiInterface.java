public class MutiInterface implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Iter:"+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new MutiInterface());
        Thread t2=new Thread(new MutiInterface());
        t1.start();
        t2.start();
    }
}
