package Patterns;

public class SquareStarPattern {
    void meth(int star){
        for(int i=0;i<star;i++){
            for (int j=0;j<star;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStarPattern obj=new SquareStarPattern();
        obj.meth(5);
    }
}
