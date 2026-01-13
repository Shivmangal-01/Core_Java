package Threading;

public class SleepMethod implements Runnable {
    public void run(){
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("java");
        System.out.println(Thread.currentThread());
    }
    void m1(){
        System.out.println("m1() called");
    }

    public static void main(String[] args) {
        SleepMethod obj= new SleepMethod();
        Thread t=new Thread(obj,"Child Thread");
        t.start();
        System.out.println("Number of Active Threads :"+Thread.activeCount());
        obj.m1();


    }
}
