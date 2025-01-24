package Multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(newRunnable("Task 1"));
        executorService.execute(newRunnable("Task 2"));
        executorService.execute(newRunnable("Task 3"));
        executorService.execute(newRunnable("Task 4"));
        executorService.execute(newRunnable("Task 5"));
        executorService.execute(newRunnable("Task 6"));
        executorService.execute(newRunnable("Task 7"));
        executorService.execute(newRunnable("Task 8"));
        executorService.execute(newRunnable("Task 9"));
        executorService.execute(newRunnable("Task 10"));
        executorService.execute(newRunnable("Task 11"));
        executorService.execute(newRunnable("Task 12"));

        executorService.shutdown();
    }

    private static Runnable newRunnable(String msg){
        return new  Runnable(){
            public void run(){
                String completeMsg = Thread.currentThread().getName() + ": " + msg;

                System.out.println(completeMsg);
            }
;        };
    }
}
