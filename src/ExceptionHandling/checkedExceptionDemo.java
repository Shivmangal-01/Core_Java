package ExceptionHandling;
import java.io.PrintWriter;

public class checkedExceptionDemo {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("abc.txt");
            pw.println("hello");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
