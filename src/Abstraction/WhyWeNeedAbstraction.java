package Abstraction;

public class WhyWeNeedAbstraction {
}
abstract class WayOfEating{
    abstract void eat(); //abstract method
}

class IndianWayOFEating extends WayOfEating{
    @Override
    void eat(){
        System.out.println("Indian people use their hand while eating...");
    }
}

class WesternWayOfEating extends WayOfEating{
    @Override
    void eat() {
        System.out.println("Western people use fork/spoon while eating...");
    }
}

