package ExceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println("try");
        }
        catch (Exception e)
        {
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally.");
        }
    }
}
