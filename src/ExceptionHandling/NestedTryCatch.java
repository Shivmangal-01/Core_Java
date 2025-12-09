package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Outer try");
            try{
                System.out.println("inner try");
                System.out.println(10/0);
            }catch (ArithmeticException e)
            {
                System.out.println("Inner Catch Block");
            }
            System.out.println("After Inner try-Catch");
        } catch (Exception e) {
            System.out.println("Outer Catch Block");
        }
        finally {
            System.out.println("Outer finally");
        }
    }
}
