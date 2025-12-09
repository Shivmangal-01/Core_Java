package Polymorphism.MethodOverloading;

import ScannerExamples.Addition;

public class AdditionOfDifferentNumbers {
    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return  a+b;
    }

    int add(int a,int b,int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        AdditionOfDifferentNumbers obj=new AdditionOfDifferentNumbers();
        int sum=obj.add(10,20);
        double sum1=obj.add(1.2,5.3);
        int sum2=obj.add(1,2,3);
        System.out.println("Addition of Two integers : "+sum);
        System.out.println("Addition of Two Doubles : "+sum1);
        System.out.println("Addition of Three integers : "+sum2);
    }
}
