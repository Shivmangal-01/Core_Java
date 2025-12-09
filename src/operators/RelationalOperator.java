package operators;

public class RelationalOperator {
    public static void main(String[] args) {
        // == Equal to
        int a=100;
        int b=100;
        boolean checkEquality=(a==b);
        System.out.println("Check equality :" +checkEquality);//true

        //!= Not Equal
        boolean checkNotEquality=(a!=b);
        System.out.println("Check not Equality :"+checkNotEquality);//false


        //< less than
        int c=100;
        int d=200;
        System.out.println(" (c < d) : "+(c<d));//true
        System.out.println("(c > d) : "+ (c>d));//false

        //<= less than equal to
        int e=100;
        int f=1000;
        System.out.println(" (e <= f) : "+(e<=f));//true
        System.out.println("(e >= f) : "+ (e>=f));//false

       }
}
