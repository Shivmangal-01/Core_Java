package String;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
//        sb.append(" Programs ");
//        sb.append(12345);
//        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
        sb.setLength(15);
        System.out.println(sb.length());
    }
}
