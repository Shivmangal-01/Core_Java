package ExceptionHandling;

public class AllBlocksWithReturn {
    public static void main(String[] args) {
        System.out.println(m1());
    }
    public static int m1(){
        try{
            System.out.println("Try");
            return 777;
        } catch (Exception e) {
            System.out.println("Catch");
            return 888;
        }
        finally {
            System.out.println("Finally");
            return 999;
        }

    }
}
