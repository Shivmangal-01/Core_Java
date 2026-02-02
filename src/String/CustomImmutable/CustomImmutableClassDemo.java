package String.CustomImmutable;
//step-1 declare class as final
final class Student{
    //step-2 make all fields private and final
    private final int id;
    private final String name;

    //step-3 initialize all fields with constructor
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    //step-4 provide only getter method

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class CustomImmutableClassDemo {
    public static void main(String[] args) {
        Student s=new Student(1,"shiv");
        System.out.println(s.getId());
        System.out.println(s.getName());
        //s.id=2;  //C.E  'id' has private access in 'String.CustomImmutable.Student'

    }
}
