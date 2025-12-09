package constructor;

public class ConstructorChainingUSingThis {
    int id;
    String name;
    ConstructorChainingUSingThis(){
        this(101);

        System.out.println("This is default constructor.....");
    }
    ConstructorChainingUSingThis(int id){
        //this();  //C.E--recursive constructor invocation
        System.out.println("This in parameterized constructor with int value..");
        System.out.println(this.id=id);
    }

    public static void main(String[] args) {
        ConstructorChainingUSingThis obj=new ConstructorChainingUSingThis();
        //ConstructorChainingUSingThis obj1=new ConstructorChainingUSingThis(101);
    }
}
