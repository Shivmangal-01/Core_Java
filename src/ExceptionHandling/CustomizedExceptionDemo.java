package ExceptionHandling;
import java.util.Scanner;
 class TooYoungException extends RuntimeException{
     TooYoungException(String msg){
         super(msg);
     }
 }

 class TooOldException extends RuntimeException{
     TooOldException(String msg){
         super(msg);
     }
 }
public class CustomizedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        if(age >60){
            throw  new TooOldException("Your age is already crossed marriage age so no chance of getting married.");
        } else if (age<18) {
            throw new TooYoungException("You are to young to get married please wait for some time...");

        }
        else {
            System.out.println("Thanks for registration...");
        }
    }
}
