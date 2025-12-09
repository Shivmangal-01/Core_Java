package statickeyword;

public class StaticMethodDemo1 {
    int a=10;
    static int b=25;

    //instance method
    void meth1(){
        System.out.println("Inside Instance method");
        System.out.println("===================================");
        System.out.println("Instance variable : "+a);
        System.out.println("Static Variable : "+b);
    }

    //static method
    static void meth2(){
        System.out.println("Inside Static method");
        System.out.println("===================================");
        System.out.println("Instance variable : "+ new StaticMethodDemo1().a);
        System.out.println("Static variable : "+b);
    }

    //main method
    public static void main(String[] args) {
        StaticMethodDemo1 obj=new StaticMethodDemo1();
        obj.meth1(); //accessing instance method
        System.out.println("----------------------------------");
        obj.meth2();//accssing static method using object
        System.out.println("----------------------------------");
        meth2();//accessing static method directy
        System.out.println("----------------------------------");
        StaticMethodDemo1.meth2();//static method accessed using class name
    }
}
