package Multithreading;

public class thread3example {
    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("MyRunnable running");
            System.out.println("MyRunnable Finishing");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
