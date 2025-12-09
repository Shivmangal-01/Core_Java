package constructor;

public class Demo2 {
    Demo2(){
        System.out.println("----------------------------------------");
        System.out.println("Non-parameterized constructor");
        System.out.println("----------------------------------------");
    }
    Demo2(int a){
        System.out.println("One parameter constructor");
        System.out.println("value of a : "+a);
        System.out.println("----------------------------------------");

    }
    Demo2(int a, String s){
        System.out.println("two parameter constructor");
        System.out.println("Value of a: "+a);
        System.out.println("Value of s : "+s);
    }

    public static void main(String[] args) {
        Demo2 d2=new Demo2(); //non parametterried constructor called
        Demo2 d3=new Demo2(10); //one parameter constructor called
        Demo2 d4=new Demo2(10,"Hello");//two parameter constructor called
    }
}
