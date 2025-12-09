package ExceptionPrograms;

import java.util.Scanner;

public class IllegalStateException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        sc.nextInt();
    }
}
