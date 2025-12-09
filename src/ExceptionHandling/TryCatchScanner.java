package ExceptionHandling;

import java.util.Scanner;

public class TryCatchScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter value of num2 :");
        int num2=sc.nextInt();
        try{
            int res=num1/num2;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Num2 should be non-Zero");
        }



    }
}
