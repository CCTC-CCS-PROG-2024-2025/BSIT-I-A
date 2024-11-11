import java.util.Scanner;

public class ALQUEZA_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter non-negative integer: ");
        int num = sc.nextInt();
        int factorial = 1;

        if (num < 0) {
            System.out.println("Error factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++)
            factorial*= i;
        }
        System.out.println("The factorial of " + num + " is " + factorial);
    }
}