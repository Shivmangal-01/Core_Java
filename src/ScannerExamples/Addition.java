package ScannerExamples;
import java.util.Scanner;
public class Addition {
    Scanner sc=new Scanner(System.in);
    void add(){

        System.out.println("Please Enter 1st number :");
        int a= sc.nextInt();
        System.out.println("Please Enter 2nd number :");
        int b=sc.nextInt();

        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("Addition : "+ (a+b));
    }
    int meth2(){
        System.out.println("Please Enter a number to return from the method : ");

        int res=sc.nextInt();
        return res;
    }

    void multiplication(int a,int b){
        System.out.println("Multiplication : "+(a*b));
    }

    public static void main(String[] args) {
        Addition obj=new Addition();
//        obj.add();
//        int output=obj.meth2();
//        System.out.println("Meth2() returned :"+output);
        System.out.println("Enter parameters for meth3()");
        obj.multiplication(obj.sc.nextInt(),obj.sc.nextInt());
    }
}
