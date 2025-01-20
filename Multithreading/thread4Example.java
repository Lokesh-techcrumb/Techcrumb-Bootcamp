package Multithreading;

public class thread4Example {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                System.out.println("Runnable Running");
                System.out.println("Runnable Finishing");
            } 
        };

        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
