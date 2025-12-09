package Basics;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        a=a+b;//300
        b=a-b; //300-200=100
        a=a-b ; //300-100=200
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
