package String;

public class MaxCharFromString {
    public static void main(String[] args) {
        String s="shivmangal";
        char small=s.charAt(0);
        //System.out.println(small);
        for(int i=0;i<s.length();i++){
            char max=s.charAt(i);
            if(max>small){
                small=max;
            }
        }
        System.out.println(small);
        int asciiVal=small;
        System.out.println(asciiVal);
    }

}
