package Patterns;
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many stars rectangle rows you want to print : ");
        int n=sc.nextInt();

        System.out.println("Enter how many stars rectangle columns you want to print : ");
        int m= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
