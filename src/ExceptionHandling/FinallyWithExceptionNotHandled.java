package ExceptionHandling;

public class FinallyWithExceptionNotHandled {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(NullPointerException e)
        {
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
        }
    }
}
