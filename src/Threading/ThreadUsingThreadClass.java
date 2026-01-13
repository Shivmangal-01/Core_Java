package Threading;
class MyThread extends Thread{
    @Override
    public void run() {
       for (int i=1;i<=10;i++){
           System.out.println("Child Thread");
       }
    }
}
public class ThreadUsingThreadClass {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        for (int i=1;i<=10;i++){
            System.out.println("Main thread");
        }
    }
}
