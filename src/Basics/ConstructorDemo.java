package Basics;

public class ConstructorDemo {
    // non- parameterized or default constructor provided by programmer
    ConstructorDemo(){
        System.out.println("I love programming languages");
    }

    //parameterized constructor
    ConstructorDemo(String s){
        System.out.println("I love "+s);
    }

    public static void main(String[] args) {
        //ConstructorDemo obj=new ConstructorDemo(); //"I love programming languages"
        ConstructorDemo obj= new ConstructorDemo("Java"); //"I love programming languages"+s
    }
}
