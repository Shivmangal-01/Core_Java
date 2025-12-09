package statickeyword;

public class StaticBlockDemo {
    static String name;
    //static block
    static{
        name="shiv";
        System.out.println("name :"+name);
        System.out.println("Static block executed");
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
        System.out.println("name :"+name);
    }
}
