package Blocks;

public class InstanceBlock {
    {
        System.out.println("instance block");
    }
    void m1(){
        System.out.println("m1() method");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        InstanceBlock obj=new InstanceBlock();
        obj.m1();
    }
}
