package ExceptionPrograms;

public class Demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                int a = 10;
                int b = 0;
                int c = a/b;
                /*
                * Dividing by zero is not allowed in Java → causes ArithmeticException
                * When exception occurs, control goes to this catch block.
                * The catch block is empty, so it does nothing.
                * The exception is simply ignored, and the loop continues.*/
                System.out.println(c);
            }
            catch (ArithmeticException ae) { }
        }
    }
}
