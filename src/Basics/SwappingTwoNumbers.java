package Basics;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        System.out.println("Before Swapping");
        System.out.println("========================");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        System.out.println("========================");
        System.out.println();
        int temp=a;//100
        a=b;//200
        b=temp;//100
        System.out.println("After Swapping");
        System.out.println("========================");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        System.out.println("========================");

    }
}
