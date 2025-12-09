package statickeyword;

public class StaticDemo {
    int a=10;
    public static int b=25;
    public void meth1(){
        //static int c=11;
    }

    public static void main(String[] args) {
        //int b=a;  //non-static variable cannot be referenced from a static context

        System.out.println("Value of b:"+b);
    }
}
