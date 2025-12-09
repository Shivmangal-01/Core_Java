package ExceptionHandling;

public class UncheckedDemo {
    void meth1(){
        System.out.println("meth1() called");
    }
    public static void main(String[] args) {
        UncheckedDemo obj=null;
        //obj.meth1();
        int arr[]={10,20,30,40,50};
        System.out.println(arr[0]);
        //System.out.println(arr[5]);
        //System.out.println(10/0);

    }
}
