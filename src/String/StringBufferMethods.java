package String;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");

        //append()
        sb.append(" Programs");
        System.out.println(sb);

        //insert()
        sb.insert(5,"Strings ");
        System.out.println(sb);

        //replace()
        sb.replace(5,12,"Buffer");
        System.out.println(sb);

        //delete()
        sb.delete(5,11);
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

        //capacity

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
