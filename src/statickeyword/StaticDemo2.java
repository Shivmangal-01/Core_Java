package statickeyword;

public class StaticDemo2 {
    static int count; //0

    StaticDemo2(){
        count++;
        System.out.println(count);
    }


    public static void main(String[] args) {
        new StaticDemo2();//1
        new StaticDemo2();//2
        new StaticDemo2();//3

    }
}
