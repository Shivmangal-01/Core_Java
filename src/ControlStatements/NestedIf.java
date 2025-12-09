package ControlStatements;

public class NestedIf {
    public static void main(String[] args) {
        int age=210;
        if (age>=18){
            if (age<=100){
                System.out.println("You are able to vote");
            }
            else {
                System.out.println("You are not able to vote");
            }
        }

    }
}
