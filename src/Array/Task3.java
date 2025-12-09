package Array;

public class Task3 {
    int meth1(int []arr)
    {
        if(arr.length==0)
            return 0;
        else if (arr.length==1)
            return arr[0];
        else
            return arr[0]+arr[1];
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        int []res={10,20,30};
        int output=obj.meth1(res);
        System.out.println(output);

    }
}
