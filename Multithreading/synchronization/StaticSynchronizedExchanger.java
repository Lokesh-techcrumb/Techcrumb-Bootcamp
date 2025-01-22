package Multithreading.synchronization;

public class StaticSynchronizedExchanger {
    
    private static Object object = null;

    public synchronized void setObject(Object o){
        object = o;
    }

    public synchronized Object getObject(){
        return object;
    }

    public void setObj(Object o){
        synchronized(StaticSynchronizedExchanger.class){
            object = o;
        }
    }

    public Object getObj(){
        synchronized(StaticSynchronizedExchanger.class){
            return object;
        }
    }
}
