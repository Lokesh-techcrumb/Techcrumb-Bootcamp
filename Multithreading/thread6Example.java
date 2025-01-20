package Multithreading;

public class thread6Example {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Running");
        };

        Thread thread  = new Thread(runnable, "The Thread1");
        thread.start();
        Thread thread2  = new Thread(runnable, "The Thread2");
        thread2.start();
        Thread thread3  = new Thread(runnable, "The Thread3");
        thread3.start();
    }
}
