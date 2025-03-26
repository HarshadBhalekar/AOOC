
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number:");
        int n = sc.nextInt();

        int facto = 1;

        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                facto *= i;
            }
            System.out.println("The factorial of " + n  + " is: " + facto);

        } else if (n == 0) {
            System.out.println("Factorial of o is 1");
        } else {
            System.out.println("Negative number does not have factorial number");
        }
    }
}
