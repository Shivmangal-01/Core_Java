package Patterns;

public class NumberPyramidReverse {
    void m1(int n){
        for(int i=0;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<(n-i);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPyramidReverse obj=new NumberPyramidReverse();
        obj.m1(5);
    }
}
