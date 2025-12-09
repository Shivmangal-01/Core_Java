package constructor;

public class demo1 {
    int a;
    int b=25;
    public  demo1(){
        System.out.println("a= "+a); //default value initialized
        System.out.println("b= "+b);
    }
    int display(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        demo1 d= new demo1(); //constructor called
        int result=d.display(10,20);
        System.out.println("Result : "+result);
    }
}
