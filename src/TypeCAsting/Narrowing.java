package TypeCAsting;

public class Narrowing {
    public static void main(String[] args) {
        //byte to char
        byte b=90;
        char c=(char)b;
        System.out.println("Value of c: "+c);

        //short  to byte and char
        short s=129;

        byte b1=(byte)s;
        System.out.println(b1);

        char c1=(char)s;
        System.out.println(c1);
    }
}
