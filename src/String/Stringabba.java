package String;

public class Stringabba {
    public String makeAbba(String a,String b){

        //return a+b+b+a ;
        return a.concat(b)+b.concat(a);
    }

    public static void main(String[] args) {
        Stringabba obj=new Stringabba();
        String result=obj.makeAbba("Hi","Bye");
        System.out.println(result);
    }
}
