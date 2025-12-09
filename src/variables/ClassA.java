package variables;

public class ClassA {

    public static void main(String[] args) {

        B obj = new B();

    }


}

class B{
    private int a = 10;

    B(){
        System.out.println(a);
    }

}