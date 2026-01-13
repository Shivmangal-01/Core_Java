package Threading;

public class PriorityToMultipleThreads extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        PriorityToMultipleThreads t=new PriorityToMultipleThreads();
        PriorityToMultipleThreads t2=new PriorityToMultipleThreads();
        PriorityToMultipleThreads t3=new PriorityToMultipleThreads();

        t.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t.setPriority(7);
        t2.setPriority(3);
        t3.setPriority(9);



        t.start();
        t2.start();
        t3.start();
    }
}
