package multithreadiingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executorService {
    static void executorServiceExamples() throws InterruptedException {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is executing a task");
        };

        for (int i = 0; i < 5; i++) {
            singleThreadExecutor.submit(task);
            cachedThreadPool.submit(task);
            fixedThreadPool.submit(task);
        }

        singleThreadExecutor.shutdown();
        cachedThreadPool.shutdown();
        fixedThreadPool.shutdown();

        singleThreadExecutor.awaitTermination(5, TimeUnit.SECONDS);
        cachedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
        fixedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
    }
    
    public static void main(String[] args) throws Exception {
        executorServiceExamples();
    }
}
