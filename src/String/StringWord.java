package String;

public class StringWord {

    public String makeOutWord(String out,String word){
        return out.substring(0,2)+word+out.substring(2);
    }

    public static void main(String[] args) {
        StringWord obj=new StringWord();
        String res=obj.makeOutWord("<<>>","Hello");
        System.out.println(res);
    }
}
