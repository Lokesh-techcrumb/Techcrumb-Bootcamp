package Multithreading;

public class MyThread extends Thread {
        @Override
        public void run(){
            for(int i = 1; i <= 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(i + Thread.currentThread().getName());
            }
        }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();

        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t2.start();
        t2.join();
        t3.start();
    }
}
