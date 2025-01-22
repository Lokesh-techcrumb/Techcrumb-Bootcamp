package Multithreading.threadPriority;

public class threadPriority extends Thread {

    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                           + " is running with priority " 
                           + Thread.currentThread().getPriority());
    }

    public static void main(String[] args)
    {

        threadPriority t1 = new threadPriority();
        threadPriority t2 = new threadPriority();
        threadPriority t3 = new threadPriority();

        System.out.println("t1 thread priority: " + t1.getPriority());
        System.out.println("t2 thread priority: " + t2.getPriority());
        System.out.println("t3 thread priority: " + t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority: " + t1.getPriority());

        System.out.println("t2 thread priority: " + t2.getPriority());

        System.out.println("t3 thread priority: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

    }
}
