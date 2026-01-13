package Threading;

public class SettingNameToThread {
    public static void main(String[] args) {
        Thread t= new Thread();
        t.setName("Thread-1");
        System.out.println("Name of thread : "+ t.getName());
        System.out.println("Name of current thread : "+ t.currentThread().getName());
    }
}
