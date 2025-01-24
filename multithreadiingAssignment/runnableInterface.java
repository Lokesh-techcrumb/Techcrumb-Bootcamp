package multithreadiingAssignment;

public class runnableInterface {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        
        Thread thread1 = new Thread(new MyRunnable(), "Runnable-Thread");
        Thread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
