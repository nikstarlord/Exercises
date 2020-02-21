package callableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random=new Random();
                int duration = random.nextInt(4000);
                System.out.println("Starting...");

                Thread.sleep(duration);

                System.out.println("Finished...");
                return duration;
            }
        });

        executor.shutdown();

        try {
            System.out.println("result is:"+ future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
