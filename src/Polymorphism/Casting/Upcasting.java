package Polymorphism.Casting;
class UpcastingParent{
    int sum(int a,int b){
        return a+b;
    }
    int multiply(int c,int d){
        return c*d;
    }
}
public class Upcasting extends UpcastingParent {

    //   @Override
//    int sum(int a, int b) {
//        return a-b;
//    }
    int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        //Upcasting-Parent class reference and child class object
        UpcastingParent obj=new Upcasting();
        int res=obj.sum(10,20);
        System.out.println("Sum : "+res);
        //int res2=obj.sub(10,5); i cannot access sub() of child using upcasting

        //parent class method
        int mul=obj.multiply(5,2);
        System.out.println("Multiplication : "+mul);
    }
}
