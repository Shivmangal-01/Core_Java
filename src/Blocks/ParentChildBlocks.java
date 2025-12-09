package Blocks;
class Parent{
    static {
        System.out.println("Parent static block...");
    }
    {
        System.out.println("parent instance block...");
    }
    Parent(){
        System.out.println("Parent constructor...");
    }

//    public static void main(String[] args) {
//        //System.out.println("Parent main method");
//    }
}
public class ParentChildBlocks extends Parent {
    static {
        System.out.println("Child static block...");
    }
    {
        System.out.println("Child instance block...");
    }
    ParentChildBlocks(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        //System.out.println("Child main method");
        ParentChildBlocks obj= new ParentChildBlocks();

    }
}
