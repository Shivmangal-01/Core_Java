package operators;

public class AssignmentOperator {

        public static void main(String[] args){

            int n = 10;

            // n = n + 5
            n += 5;
            System.out.println("After += : " + n);

            // n = n - 5
            n -= 5;
            System.out.println("After -= : " + n);

            // n = n * 5
            n *= 5;
            System.out.println("After *= : " + n);



            // n = n / 2
            n /= 5;
            System.out.println("After /= : " + n);

            // n = n % 3
            n %= 5;
            System.out.println("After %= : " + n);
        }

}
