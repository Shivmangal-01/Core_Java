package Patterns;

public class LeftAngleReverse {
    void display(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (int k=0;k<(n-i);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LeftAngleReverse obj=new LeftAngleReverse();
        obj.display(5);
    }
}
