package Polymorphism.MethodOverloading;

public class Demo {
    void test(String name){
        System.out.println(name);

    }

    void test(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.test("Shiv");
        //obj.test("Shiv",24);
    }
}
