package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        // && - Logical And -returns true when both conditions are true
        boolean logicalAnd=(a<b) && (b<c);//true
        System.out.println(logicalAnd);

        //|| - Logical OR -return true if at least one condition is true
        boolean logicalOr = (a<b) || (a>c); //true
        System.out.println(logicalOr);

        // ! - Logical Not - returns true when condition is false and vice versa
        boolean logicalNot = ! ((a<b) || (a<c));
        System.out.println(logicalNot); //false

        boolean logicalNot1 = ! ((a>b) || (a>c));
        System.out.println(logicalNot1); //true
         }
}
