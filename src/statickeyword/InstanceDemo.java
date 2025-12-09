package statickeyword;

public class InstanceDemo {
    int count; //0 instance variable has separate copy
    InstanceDemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        new InstanceDemo();
        new InstanceDemo();
        new InstanceDemo();
    }
}
