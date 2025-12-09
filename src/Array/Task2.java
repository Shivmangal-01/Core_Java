package Array;

public class Task2 {
    boolean meth1(int []arr){
        boolean b;

        if (arr[0]!=2 &&  arr[0]!=3 && arr[1]!=2 && arr[1]!=3)
            return true;
            return  false;

    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        int input[]={3,1};
        System.out.println(obj.meth1(input));
    }
}
