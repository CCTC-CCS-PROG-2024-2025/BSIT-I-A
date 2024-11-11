import java.util.Scanner;

public class CASERIAL_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        long factorial = 1;  // Using long to handle larger factorials

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}
