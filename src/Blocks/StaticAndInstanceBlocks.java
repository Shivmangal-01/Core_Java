package Blocks;

public class StaticAndInstanceBlocks {
    static {
        System.out.println("Static block-1");
    }
    {
        System.out.println("Instance block-1");
    }
    {
        System.out.println("Instance block-2");
    }
    static {
        System.out.println("Static block-2");
    }
    void meth1(){
        System.out.println("method called");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        StaticAndInstanceBlocks obj=new StaticAndInstanceBlocks();
        obj.meth1();
    }
    static {
        System.out.println("static block-3");
    }
    {
        System.out.println("instance block-3");
    }
}
