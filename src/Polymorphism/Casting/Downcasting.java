package Polymorphism.Casting;
class DowncastParent{
    void show(){
        System.out.println("Parent class");
    }
}
public class Downcasting  extends DowncastParent{
    public static void main(String[] args) {
        //downcasting
        Downcasting d=(Downcasting) new DowncastParent();
    }
}
