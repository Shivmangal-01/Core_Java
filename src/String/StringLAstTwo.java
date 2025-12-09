package String;

public class StringLAstTwo {
    public  String firstTwo(String str){
        if(str.length()>=2)
            return str.substring(0,2);
        return str;
    }
    public static void main(String[] args) {
        StringLAstTwo obj=new StringLAstTwo();
        String res=obj.firstTwo("abc");
        System.out.println(res);
    }
}
