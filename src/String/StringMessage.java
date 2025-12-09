package String;
import java.util.Scanner;
public class StringMessage {
    public String helloMessage(String name){

        //return "Hello "+name+" !";
       return "Hello".concat(name).concat(" !");
    }
    public void  display(){
        //taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" !");
    }

    public static void main(String[] args) {
//        StringMessage obj=new StringMessage();
//        String a=obj.helloMessage("Bob");
//        String b=obj.helloMessage("Alice");
//        String c=obj.helloMessage("X");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        StringMessage obj=new StringMessage();
        obj.display();
    }
}
