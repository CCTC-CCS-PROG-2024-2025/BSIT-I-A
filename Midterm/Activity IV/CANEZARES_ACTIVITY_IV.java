import java.util.Scanner;

public class CANEZARES_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non integer: ");
        int a = sc.nextInt();

        int factorial = 1;

        for (int num = 1; num <= a; num++) {
            factorial *= a;
        }
        System.out.println(" The Factorial of " + 1 + " is: " + factorial);
    }
}