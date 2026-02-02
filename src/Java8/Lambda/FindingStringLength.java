package Java8.Lambda;
interface InterfaceOne{
    int len(String s);
}
public class FindingStringLength {
    public static void main(String[] args) {
        InterfaceOne i=(s)->s.length();
        System.out.println(i.len("Hello"));
    }
}
