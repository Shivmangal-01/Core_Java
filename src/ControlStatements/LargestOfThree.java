package ControlStatements;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=23;
        int b=160;
        int c=10;
        if (a>b && a>c){
            System.out.println("a value is largest : "+a);
        } else if (b>c && b>a) {
            System.out.println("b value is largest : "+b);
        }else {
            System.out.println("C value is largest");
        }
    }
}
