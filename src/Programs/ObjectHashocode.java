package Programs;

public class ObjectHashocode {
    public static void main(String[] args) {
        ObjectHashocode obj=new ObjectHashocode();
        ObjectHashocode obj2=obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
}
