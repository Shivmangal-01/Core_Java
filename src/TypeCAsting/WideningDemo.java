package TypeCAsting;

public class WideningDemo {
    public static void main(String[] args) {
        int a=10;
        //int to double
        double b=a;
        System.out.println("Value of b : "+b);

        //byte to short
        byte b1=18;
        short s=b1;
        System.out.println("Value of s : "+s);

        //short to int
        short st=32;
        int st1=st;
        System.out.println(st1);

        long l=10000L;
        float f=l;
        System.out.println("Value of f : "+f);

        double d=f;
        System.out.println("Value of d:"+d);
    }
}
