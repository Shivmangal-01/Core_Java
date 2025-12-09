package ExceptionHandling;
import  java.util.Scanner;
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer values :");
        System.out.println("Enter First Value : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Value : ");
        int num2=sc.nextInt();
        System.out.println("Division : "+num1/num2);
    }

}
