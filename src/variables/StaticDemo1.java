package variables;

public class StaticDemo1 {
     public static int a=10;
     static int b;
     void m1(){
         System.out.println("Accessing by identifier name");
         System.out.println(a);//Accessing by identifier name
         System.out.println(b);

     }

    public static void main(String[] args) {
        StaticDemo1 st=new StaticDemo1();
        System.out.println("accessing using object");
        System.out.println(st.a);//accessing using object
        System.out.println("-------------------------------------");
        System.out.println("accessing using class name");
        System.out.println(StaticDemo1.a);//accessing using class name
        System.out.println("-------------------------------------");
        st.m1();

    }
}
