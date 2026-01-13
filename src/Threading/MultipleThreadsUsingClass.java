package Threading;

public class MultipleThreadsUsingClass extends Thread{
    @Override
    public void run() {
        System.out.println("New Thread.."+Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultipleThreadsUsingClass obj=new MultipleThreadsUsingClass();
        obj.start();
        obj.setName("Thread-1");

        MultipleThreadsUsingClass obj2=new MultipleThreadsUsingClass();
        obj2.start();
        obj2.setName("Thread-2");

        MultipleThreadsUsingClass obj3=new MultipleThreadsUsingClass();
        obj3.start();
        obj3.setName("Thread-3");
    }
}
