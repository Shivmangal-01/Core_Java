package statickeyword;

public class StaticMethodDemo {
    static int num = 100;
    static String str = "ABC";

    // This is Static method
    static void display()
    {
        System.out.println("Static number is: " + num);
        System.out.println("Static string is: " + str);
    }

    // non-static method
    void nonstatic()
    {
        // our static method can accessed
        // in non static method
        display();
    }

    // main method
    public static void main(String args[])
    {
        StaticMethodDemo obj = new StaticMethodDemo();

        // This is object to call non static method
        obj.nonstatic();

        // static method can called
        // directly without an object
        display();
    }
}
