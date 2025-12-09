package Patterns;

public class PatternPyramid {
    void m1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        PatternPyramid obj=new PatternPyramid();
        obj.m1(5);
    }
}
