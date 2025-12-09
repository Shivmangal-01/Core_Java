package constructor;
class Hello{
    Hello(){
        System.out.println("Parent --no-argument constructor");
    }
}
public class BothParentAndChildConstructor extends Hello {
    BothParentAndChildConstructor(){
        super();
        System.out.println("child--- no-argument constructor...");
    }
    BothParentAndChildConstructor(int x){
        this();
        System.out.println("child ---- parameterized construcotr.......");
    }

    public static void main(String[] args) {

        new BothParentAndChildConstructor(10);
    }
}
