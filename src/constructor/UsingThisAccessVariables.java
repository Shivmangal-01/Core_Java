package constructor;

public class UsingThisAccessVariables {
    String name;
    int age;
    UsingThisAccessVariables(String name,int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
    }



    public static void main(String[] args) {
        UsingThisAccessVariables obj=new UsingThisAccessVariables("shiv",24);
        obj.display();



    }
}
