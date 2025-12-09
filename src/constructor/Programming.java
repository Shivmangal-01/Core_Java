package constructor;

public class Programming {
    Programming(){
        System.out.println("I love Programming Language");
    }
    Programming(String s){
        System.out.println("I love "+s);
    }

    public static void main(String[] args) {
        //Programming p=new Programming();

        Programming p1=new Programming("java");
    }
}
