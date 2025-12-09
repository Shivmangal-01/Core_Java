package Methods;

public class MethodDemo {
    //non-parameterized method and it returns nothing
    void  m1(){
        System.out.println("Hii......");
        return ; //i can write return inside void method but we cant return any value
        //return 10;
        // if i try i will get C.E. cannot return value from the method with void result type

    }

    int m2(){
        return 100;
        //System.out.println("hello"); //if we write any statement after return then we'll get C.E. unreachable statement
    }

    public static void main(String[] args) {
        MethodDemo obj=new MethodDemo();
        obj.m1();
    }
}
