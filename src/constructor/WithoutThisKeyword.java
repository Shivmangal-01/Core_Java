package constructor;

public class WithoutThisKeyword {
    int empId;
    String empName;
    int empAge;

    //constructor (parameterized)
    WithoutThisKeyword(int empId,String empName,int empAge){
       /* empId=empId;
        empName=empName;
        empAge=empAge;
        //it returns default values because compiler gets confused bcoz local and instance variable have same names if i use
        //this then it will refer current class object*/

        this.empId=empId;
        this.empName=empName;
        this.empAge=empAge;
        //now it will assign values that are passed in constructor call
    }

    public static void main(String[] args) {
        WithoutThisKeyword obj=new WithoutThisKeyword(101,"a",24);
        System.out.println("Emp Id : "+obj.empId);
        System.out.println("Emp Name : "+obj.empName);
        System.out.println("Emp Age : "+obj.empAge);
    }
}
