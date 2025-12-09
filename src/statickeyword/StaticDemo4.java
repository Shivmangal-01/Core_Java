package statickeyword;

public class StaticDemo4 {
    static int count=10;

    void meth(){
        System.out.println("Inside instance method");
        System.out.println("count (access directly):"+count);
        System.out.println("count (access using classname):"+StaticDemo4.count);
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        StaticDemo4 obj=new StaticDemo4();
        obj.meth();
        System.out.println();
        System.out.println("Inside static area");
        System.out.println("count (access directly):"+count);
        System.out.println("count (access using classname):"+StaticDemo4.count);
    }
}
