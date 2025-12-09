package TypeCAsting;

public class ByteAddition {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;

        //short c=a+b;   //Incompatible type because we are trying to store int value to short
        short c=(short) (a+b);
        System.out.println("c : "+c);

        byte d=(byte)(a+b);
        System.out.println("d : "+ d);

        float f=10;
        float f1=20;
        int sub=(int)(f-f1);

        //byte b1= 10;
        //Incompatible types. Found: 'int', required: 'byte'
        //b1 = b1 + 1;


    }

}
