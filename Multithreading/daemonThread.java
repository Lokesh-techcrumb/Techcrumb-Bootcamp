package Multithreading;

public class daemonThread extends Thread{
    
    @Override
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName() +" Hello World");
        }
    }

    public static void main(String[] args) {
        daemonThread myThread = new daemonThread();
        myThread.setDaemon(true);
        // daemonThread t1 = new daemonThread();
        // t1.start();
        myThread.start();   
        System.out.println("Main Thread Done");
    }
}
