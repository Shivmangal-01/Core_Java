package ScannerExamples;
import java.util.Scanner;
public class AcceptingString {
    Scanner sc=new Scanner(System.in);
    void namePrinting(){
        System.out.println("Please enter your name :");
        String name=sc.next();
        System.out.println("Name : "+name);
    }
    void strPrint(){

        System.out.println("Enter String : ");
        String str=sc.nextLine();
        System.out.println(str);
    }

    public static void main(String[] args) {
        AcceptingString obj=new AcceptingString();
        //obj.namePrinting();
        obj.strPrint();
    }
}
