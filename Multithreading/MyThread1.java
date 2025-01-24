package Multithreading;

public class MyThread1 extends Thread {

    public MyThread1(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            String a = "";
            for(int j = 0; j < 1000; j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + "- priority: " + Thread.currentThread().getPriority() + "- count: " + i);
        }
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MyThread1 l = new MyThread1("Low Priority Thread");
        MyThread1 m = new MyThread1("Medium Priority Thread");
        MyThread1 h = new MyThread1("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
