package Multithreading.Deadlock.Lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class FairnessLockExample {
    
    private final Lock unfairLock = new ReentrantLock();

    public void accessResource(){
        unfairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally{
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName() + " released the lock");
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run(){
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        try {
            t1.start();
            Thread.sleep(2000);
            t2.start();
            Thread.sleep(2000);
            t3.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
