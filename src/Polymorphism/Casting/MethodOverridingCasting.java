package Polymorphism.Casting;
class Casting{
    void test(){
        System.out.println("Parent method");
    }
}
public class MethodOverridingCasting  extends Casting{
//    @Override
//    void test() {
//        System.out.println("Child method");
//    }

    public static void main(String[] args) {
        //upcasting
        Casting obj=new MethodOverridingCasting();
        obj.test();
    }
}




