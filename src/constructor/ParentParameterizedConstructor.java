package constructor;
class parent{
    parent (int x){
        System.out.println("parent parameterized constructor");
    }
}
public class ParentParameterizedConstructor extends parent {
    ParentParameterizedConstructor(int i){
        super(10);
        System.out.println("child parameterized constructor..");
    }
}
class Test {
    public static void main(String[] args) {
        new ParentParameterizedConstructor(10);
    }
}