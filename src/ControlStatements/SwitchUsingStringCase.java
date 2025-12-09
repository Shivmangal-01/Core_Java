package ControlStatements;

public class SwitchUsingStringCase {
    public static void main(String[] args) {
        String color="Red";
        switch (color){
            case "Red":
                System.out.println("Red Color");
                break;
            case "Pink":
                System.out.println("Pink Color");
                break;
            case "Yellow":
                System.out.println("Yellow Color");
                break;
            default:
                System.out.println("No color Found");
        }
    }
}
