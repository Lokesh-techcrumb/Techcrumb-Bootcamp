package multithreadiingAssignment;

public class synchronization {

    static class SharedResource {
        synchronized void synchronizedMethod() {
            System.out.println(Thread.currentThread().getName() + " entered synchronized method");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " leaving synchronized method");
        }

        void synchronizedBlock() {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " entered synchronized block");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " leaving synchronized block");
            }
        }
    }


    public static void main(String[] args) throws Exception {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(resource::synchronizedMethod, "Thread-1");
        Thread t2 = new Thread(resource::synchronizedBlock, "Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
