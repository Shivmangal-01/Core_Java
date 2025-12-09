package ScannerExamples;
import java.util.Scanner;
public class Task1 {
    Scanner sc=new Scanner(System.in);
    void veges(){
        System.out.println("Welcome to vegetables store ");
        System.out.println("Please choose :");
        System.out.println("1) Onions");
        System.out.println("2) Chilli");
        System.out.println("3) Tomato");
        System.out.println("4) Brinjal");
        System.out.println("5) LadyFinger");
        String veges=sc.next();
        if (veges=="Onions"){
            System.out.println("1 KG of Onion Price is 30 ");
            System.out.println("How many Kgs you want?");
            int qty=sc.nextInt();
            System.out.println(qty+"kgs of Onion cost : "+(qty*30));

        } else if (veges=="Chilli") {
            System.out.println("1 KG of Chilli Price is 60 ");
            System.out.println("How many Kgs you want?");
            int qty=sc.nextInt();
            System.out.println(qty+"kgs of Chilli cost : "+(qty*60));

        }else if (veges=="Tomato") {
            System.out.println("1 KG of Tomato Price is 55 ");
            System.out.println("How many Kgs you want?");
            int qty=sc.nextInt();
            System.out.println(qty+"kgs of Tomato cost : "+(qty*55));

        }else if (veges=="Brinjal") {
            System.out.println("1 KG of Brinjal Price is 50 ");
            System.out.println("How many Kgs you want?");
            int qty=sc.nextInt();
            System.out.println(qty+"kgs of Brinjal cost : "+(qty*50));

        }else if (veges=="Lady Finger") {
            System.out.println("1 KG of Lady Finger Price is 40 ");
            System.out.println("How many Kgs you want?");
            int qty=sc.nextInt();
            System.out.println(qty+"kgs of Lady Finger cost : "+(qty*40));

        }


    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        obj.veges();
        //System.out.println("Thank you for shopping with us..... Please come back");
    }
}
