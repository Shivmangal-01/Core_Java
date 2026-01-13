package Threading;

public class MultipleThreadsUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("New thread");
    }

    public static void main(String[] args) {
        MultipleThreadsUsingRunnable thread=new MultipleThreadsUsingRunnable();
        Thread t=new Thread(thread);
        t.start();
        t.setName("Thread-1");
        Thread t1=new Thread(thread);
        t1.start();
        t1.setName("Thread-2");
    }
}
