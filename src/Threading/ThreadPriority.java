package Threading;

public class ThreadPriority implements Runnable {
    @Override
    public void run() {
        System.out.println("New Thread..");
    }

    public static void main(String[] args) {
        ThreadPriority obj=new ThreadPriority();
        Thread t=new Thread(obj);
        t.setPriority(2);
        t.start();
        System.out.println(t.getPriority());
    }
}
