package operators;

public class AssignmentDemo {
    public static void main(String[] args) {
        int f =7;
        System.out.println("f=f+3 : "+(f+=3));//10
        System.out.println("f=f-2 : "+ (f-=2));//8
        System.out.println("f *= 4 : "+ (f*=4));//32
        System.out.println("f/=3 : "+ (f/=3));//10
        System.out.println(" f%=2 : "+ (f%=2));//0

        System.out.println("==================================");
        double t =7;
        System.out.println("t=t+3 : "+(t+=3));//10.0
        System.out.println("t=t-2 : "+ (t-=2));//8.0
        System.out.println("t=t* 4 : "+ (t*=4));//32.0
        System.out.println("t=t/3 : "+ (t/=3));//10.66
        System.out.println(" t=t%2 : "+ (t%=2));//0.66

    }

}
