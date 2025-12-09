package Basics;

public class Anonymousobject {
    int addition(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new Anonymousobject();   //Anonymous object
        //new Anonymousobject();.addition(10,20);//if wrote like this it will return but not store or print
        int result=new Anonymousobject().addition(10,20);
        System.out.println(result);
        System.out.println("End");
    }
}
