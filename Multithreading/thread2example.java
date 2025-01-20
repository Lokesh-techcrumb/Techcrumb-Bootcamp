package Multithreading;

public class thread2example {
    public static class MyThread extends Thread {
        public void run(){
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
