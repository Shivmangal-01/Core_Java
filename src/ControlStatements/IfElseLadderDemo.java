package ControlStatements;

public class IfElseLadderDemo {
    public static void main(String[] args) {
        //marks  90>=  ==> Passed in merit
        // marks 75> and 90<  ==> passed in distinction
        // marks 60> and <75  ==> First class
        // marks 35> and <60 ==>Second class
        //marks <35 ==>Fail

        int marks=125;
        if (marks >=90 && marks <=100){
            System.out.println("Passed in merit");

        } else if (marks >=75 && marks <90) {
            System.out.println("Passed in distinction");
        } else if (marks >=60 && marks <75) {
            System.out.println("First Class");
        } else if (marks >=35 && marks <60) {
            System.out.println("Second Class");
        } else if (marks <35) {
            System.out.println("FAIL");
        }else {
            System.out.println("Not valid");
        }

    }
}
