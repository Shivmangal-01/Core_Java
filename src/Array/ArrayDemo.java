package Array;

public class ArrayDemo {
    int []meth1(int arr[]){
        System.out.println("meth1() called");
        return arr;
    }

    public static void main(String[] args) {
        ArrayDemo obj=new ArrayDemo();
        int input[]={10,20,30};
        int [] res=obj.meth1(input);
        for(int i:res){
            System.out.println(i);
        }
    }
}
