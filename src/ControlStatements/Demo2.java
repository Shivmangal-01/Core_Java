package ControlStatements;

public class Demo2 {
    void meth1(int a, int b,char c){
        switch (c)
        {
            case '+' :
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("dont enter operator other than + ,- ,* ,/ ");
        }
    }

    public static void main(String[] args) {
        new Demo2().meth1(20,10,'#');
    }
}
