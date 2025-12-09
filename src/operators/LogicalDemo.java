package operators;

public class LogicalDemo {


    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 5;

        System.out.println("x: " +(x == 1));
        System.out.println("y: " +(y == z));
        System.out.println("z > x: " +(z > x));

        if(x == 1 || x > y || x > z)
        {
            System.out.println("One");
        }
        if(x == y || y == 2 || z == 5)
        {
            System.out.println("Two");
        }
        if(x == y || y == z || z == x)
        {
            System.out.println("Three");
        }
    }
}
