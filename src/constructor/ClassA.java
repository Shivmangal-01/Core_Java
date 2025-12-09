package constructor;

public class ClassA {
    void meth1(){
        System.out.println("meth1() called........");
    }
    //private constructor
    private ClassA(String s){
        System.out.println(s);
    }
    public ClassA(){
        System.out.println("default constructor....");
    }

}
