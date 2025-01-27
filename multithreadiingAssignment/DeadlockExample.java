package multithreadiingAssignment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
        private final Lock lock1 = new ReentrantLock();
        private final Lock lock2 = new ReentrantLock();

        void task1() {
            lock1.lock();
            try {
                Thread.sleep(100);
                lock2.lock();
                try {
                    System.out.println(Thread.currentThread().getName() +" is executing");
                } finally {
                    lock2.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
            }
        }

        public static void main(String[] args) throws Exception {
            DeadlockExample deadlockExample = new DeadlockExample();

            Runnable task = new Runnable(){
                @Override
                public void run(){
                    deadlockExample.task1();
                }
            };

            Thread t1 = new Thread(task, "Thread1");
            Thread t2 = new Thread(task, "Thread2");
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
}
