package Multithreading;

public class yieldThread extends Thread{
    
    public yieldThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        yieldThread t1 = new yieldThread("t1");
        yieldThread t2 = new yieldThread("t2");
        t1.start();
        t2.start();

    }
}
