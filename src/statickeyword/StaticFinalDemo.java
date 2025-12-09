package statickeyword;

public class StaticFinalDemo {
    //final static int count;
    String name;//instance variable
    int id;//instance variable
    final static String companyName="XYZ"; //static final variable

    //constructor
    StaticFinalDemo(String n,int i){
        name=n;
        id=i;
    }

    //instance method
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Id : "+id);
        System.out.println("Company Name : "+companyName);
    }


    public static void main(String[] args) {
        //System.out.println(count);
        StaticFinalDemo obj=new StaticFinalDemo("A",101);
        obj.display();

        StaticFinalDemo obj2=new StaticFinalDemo("B",102);
        obj2.display();
    }
}
