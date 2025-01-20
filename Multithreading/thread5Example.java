package Multithreading;

public class thread5Example {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("Lambda Runnable Interface Running");
            System.out.println("Lambda Runnable Interface Finished");
        };

        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
