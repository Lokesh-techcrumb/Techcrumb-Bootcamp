package Multithreading.synchronization;

public class StaticSynchronizedExchangerMain {
    public static void main(String[] args) {
        StaticSynchronizedExchanger exchanger = new StaticSynchronizedExchanger();

        Thread thread1 = new Thread(
            new Runnable(){
                @Override
                public void run(){
                    for(int i = 0; i < 1000; i++){
                        exchanger.setObject(""+i);
                    }
                }
            }
        );

        Thread thread2  = new Thread(
            new Runnable(){
                @Override
                public void run(){
                    for(int i = 0; i < 1000; i++){
                        System.out.println(
                            exchanger.getObject()
                        );
                    }
                }
            }
        );

        thread1.start();
        thread2.start();
    }
}
