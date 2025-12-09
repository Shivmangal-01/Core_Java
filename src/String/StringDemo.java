package String;

public class StringDemo {
    public static void main(String[] args) {
        //String literal
        String s1="java";

        //string class
        String s2=new String("java");

        //character array
        char []arr={'J','A','V','A'};
        String s3=new String(arr);

        //another way
        String s4=new String(arr,1,2);//start from 1st index position and take 2 characters

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        //Immutability
        String s="Java";
        System.out.println("s : "+s);
        //System.out.println(s.concat(" is awesome"));
        s=s.concat(" is awesome");
        System.out.println("s value after concatenation : "+s);
    }
}
