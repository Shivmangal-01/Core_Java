package statickeyword;

public class Test {
    void addition(){
        int x=StaticAccessInAnotherClass.a;
        int y=StaticAccessInAnotherClass.b;
        int z=x+y;
        System.out.println("Value of x:"+x);
        System.out.println("Value of y:"+y);
        System.out.println("Addition : "+z);
    }

    public static void main(String[] args) {
        Test obj= new Test();
        obj.addition();
    }
}
