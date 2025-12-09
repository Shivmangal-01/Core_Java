package ExceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Stmt-1");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(10/2);
        }
        System.out.println("stmt-3");
    }
}
