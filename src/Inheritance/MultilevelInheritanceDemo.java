package Inheritance;
class SuperParent{
    int sum(int a,int b){
        return a+b;
    }
}
class Parent1 extends SuperParent{
    int subtraction(int a,int b){
        return a-b;
    }
}
public class MultilevelInheritanceDemo extends Parent1 {
    public static void main(String[] args) {
        MultilevelInheritanceDemo obj=new MultilevelInheritanceDemo();
        System.out.println("From GrandParent");
        System.out.println("================================");
        int res=obj.sum(10,20);
        System.out.println("Sum is : "+res);
        System.out.println();
        System.out.println("From Parent");
        System.out.println("================================");

        int res2=obj.subtraction(10,50);
        System.out.println("Subtraction is : "+res2);
    }
}
