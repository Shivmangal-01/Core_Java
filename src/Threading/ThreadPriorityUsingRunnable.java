package Threading;

public class ThreadPriorityUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadPriorityUsingRunnable r=new ThreadPriorityUsingRunnable();
        Thread t1=new Thread(r,"Thread-1");
        Thread t2=new Thread(r,"Thread-2");
        Thread t3=new Thread(r,"Thread-3");
        t1.setPriority(6);
        t2.setPriority(9);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
