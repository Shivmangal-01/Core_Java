package Basics;

public class ParameterizedMethod {
    void meth1(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        ParameterizedMethod obj=new ParameterizedMethod();//object
        obj.meth1("Java is awesome");//method calling using parameter
        System.out.println("Method call done.....");
    }
}
