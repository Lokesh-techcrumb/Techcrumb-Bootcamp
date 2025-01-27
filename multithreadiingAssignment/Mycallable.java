package multithreadiingAssignment;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mycallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            return Thread.currentThread().getName() + " has completed the task";
        }
        public static void main(String[] args) throws Exception {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<String> future = executorService.submit(new Mycallable());
            System.out.println(future.get());
            executorService.shutdown();
        }
}
