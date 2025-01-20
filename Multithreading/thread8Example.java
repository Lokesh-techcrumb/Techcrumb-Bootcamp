package Multithreading;

public class thread8Example {
    public static class StoppableRunable implements Runnable {
        private boolean stopRequested = false;  
        
        public synchronized void requestStop(){
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }

        private void sleep(long millis){
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            System.out.println("StoppableRunnable Running");

            while(!isStopRequested()){
                sleep(1000);
                System.out.println("....");
            }
            System.out.println("StoppableRunnable Stopped");
        }
    }
    public static void main(String[] args) {
        StoppableRunable stoppableRunable = new StoppableRunable();
        Thread thread = new Thread(stoppableRunable, "The Thread");

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Requesting Stop");
        stoppableRunable.requestStop();
        System.out.println("Stop requested");
    }
}
