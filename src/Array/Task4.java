package Array;

public class Task4 {
    boolean firstLast6(int[]num){
        if ((num[0]==6) || (num[num.length-1]==6))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        int []input={3,6,1,2};
        boolean res=obj.firstLast6(input);
        System.out.println(res);
    }

}
