package Java8.Lambda;

public class ImplementingRunnable {
    public static void main(String[] args) {
//        Runnable r=()->{
//            for(int i=0;i<=5;i++){
//                System.out.println("Child thread...");
//            }
//        };
//        r.run();

        Thread t=new Thread(()->{
            System.out.println("Child Thread.....");
        });
        t.start();
    }
}
