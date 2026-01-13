package Threading;

public class ThreadUsingRunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("New Thread Running");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread running");
        System.out.println(Thread.currentThread());
        ThreadUsingRunnableDemo r=new ThreadUsingRunnableDemo();
        Thread t=new Thread(r);
        t.start();
    }
}
