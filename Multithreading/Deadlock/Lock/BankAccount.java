package Multithreading.Deadlock.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(amount <= balance){
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " complete withdrawl. Remaining Balance is " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                    finally{
                        lock.unlock();
                    }
                }
                else{
                    System.err.println(Thread.currentThread().getName() + " insufficient balance");
                }

            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        BankAccount SBI = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run(){
                SBI.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
