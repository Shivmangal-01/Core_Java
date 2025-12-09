package ControlStatements;

public class SwitchDemo {
    void meth1(){
        int input=4;
        switch(input){
            default :
                System.out.print(4);
            case 1:
                System.out.print(" 1 ");
            case 2:
                System.out.print(" 2 ");
                break;
        }
    }

    public static void main(String[] args) {
        SwitchDemo sd=new SwitchDemo();
        sd.meth1();

    }
}
