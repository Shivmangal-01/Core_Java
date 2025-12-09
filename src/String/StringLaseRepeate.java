package String;

public class StringLaseRepeate {
    public String repeateLAst(String s){
        String s1=s.substring(s.length()-2);
        return s1+s1+s1;
    }
    public static void main(String[] args) {
        StringLaseRepeate obj= new StringLaseRepeate();
        String res=obj.repeateLAst("shiv");
        System.out.println(res);
    }
}
