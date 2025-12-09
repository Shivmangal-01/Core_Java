package variables;

public class InstanceVariable {
    int a;   //instance variable declared and not initialized
    int b=10; //initialized instance variable

    void m1(){
        System.out.println("Accessing inside method using identifier");
        System.out.println("A="+a);
    }

    public static void main(String[] args) {
        InstanceVariable obj=new InstanceVariable(); //object creation
        //System.out.println("A="+a);   //non-static variable a cannot be referenced from a static context
        System.out.println("A="+obj.a); //accessing using instance referance //A=0 (because compiler assign default value)
        System.out.println("B="+obj.b);//B=10

        obj.m1();//method called

    }

}
