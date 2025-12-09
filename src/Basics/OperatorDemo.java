package Basics;

public class OperatorDemo {
    int a=20;
    int b=10;
    int meth1(){
//        int a=10;
//        int b=20;
      return  a+b;
    }

    int meth2(int a, int b){
        return (a-b);

    }
    OperatorDemo(){
        OperatorDemo aobj=new OperatorDemo(a,b);
        int result =aobj.meth2(a,b);
        System.out.println("Substration"+result);
        System.out.println("Multiplication:"+ a*b);
        int result2=aobj.meth1();
        System.out.println("Addition :"+result2);
    }
    OperatorDemo(int a, int b){
        System.out.println("Division : "+(a/b));
    }
    public static void main(String[] args) {
        OperatorDemo obj=new OperatorDemo();
    }
}
