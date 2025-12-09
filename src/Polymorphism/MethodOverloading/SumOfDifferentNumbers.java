package Polymorphism.MethodOverloading;

public class SumOfDifferentNumbers {
    int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    int sum(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    long sum(int a, long b){

        return a+b;
    }

    public static void main(String[] args) {
        SumOfDifferentNumbers obj=new SumOfDifferentNumbers();
        //int res=obj.sum(10,20);
        //int res=obj.sum(10,20,30);
        //System.out.println(res);
        long res2=obj.sum(10,30L);
        System.out.println(res2);
    }
}
