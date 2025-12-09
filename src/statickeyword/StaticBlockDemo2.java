package statickeyword;

public class StaticBlockDemo2 {
    static String eName="Shiv";
    static int eId;
    static int age;
    String cName="xyz";//Instance variable

    //change value of static variable in static block
    static{
        eName="vishu";
        System.out.println("Employee name:"+eName
        );
    }

    //initialize the value of static variable in SB
    static{
        eId=101;
        System.out.println("Employee Id :"+eId);
    }
    //if we dont assign value of static variable it will print default value
    static{
        System.out.println("Employee age:"+age);

    }

//    static{
//        System.out.println("Company name:"+cName);//C.E cannot access non static variable in static block
//    }
public static void main(String[] args) {

}
}
