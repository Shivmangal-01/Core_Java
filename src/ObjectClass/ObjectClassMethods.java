package ObjectClass;

public class ObjectClassMethods {
    int x=10;

    @Override
    public String toString() {
        return "Value of x: "+x;
    }

    public static void main(String[] args) {
        ObjectClassMethods obj=new ObjectClassMethods();
        System.out.println(obj);

        ObjectClassMethods obj2=new ObjectClassMethods();
        ObjectClassMethods obj3=obj2;
        System.out.println(obj.equals(obj2));
        System.out.println(obj2.equals(obj3));
        System.out.println("Hashcode of obj : "+obj.hashCode());
        System.out.println("Hashcode of obj2 : "+obj2.hashCode());
        System.out.println("Hashcode of obj3 : "+obj3.hashCode());

        //getClass()
        System.out.println(obj.getClass());
    }
}
