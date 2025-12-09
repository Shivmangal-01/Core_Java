package ExceptionHandling;

public class StringOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        String s="Hello Java Learners";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(100));
    }
}
