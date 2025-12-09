package statickeyword;

public class StaticDemo3 {
    static int count=10;

    public static void main(String[] args) {
        System.out.println("Static variable using direct name");
        System.out.println("count :"+count);
        System.out.println("============================");
        StaticDemo3 obj=new StaticDemo3();
        System.out.println("static variable using reference");
        System.out.println("Count value :"+obj.count);
        System.out.println("============================");
        System.out.println("Static variable using class name");
        System.out.println("count :"+StaticDemo3.count);

    }
}
