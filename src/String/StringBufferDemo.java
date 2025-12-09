package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        //Initial Capacity
        System.out.println("Initial Capacity : "+sb.capacity());

        sb.append("abcdefghijklmnop");
        System.out.println("Capacity after adding 16 characters : "+sb.capacity());

        sb.append("q");
        System.out.println("Capacity after appending q : "+sb.capacity());
    }
}
