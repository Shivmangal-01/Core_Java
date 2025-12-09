package variables;

public class InstanceDemo {
    int a;
    int b=25;
    void m1(){ //user defined method
        //instance block
        System.out.println(a); //direct access
        System.out.println(b);
        a=a+100;//increasing value of a
        System.out.println("value of a:"+ a);

    }

    public static void main(String[] args) {
        InstanceVariable obj1=new InstanceVariable();
        InstanceVariable obj2=new InstanceVariable();
        obj1.m1();
        obj2.m1();
        System.out.println("--------------------------------------");
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }

}
