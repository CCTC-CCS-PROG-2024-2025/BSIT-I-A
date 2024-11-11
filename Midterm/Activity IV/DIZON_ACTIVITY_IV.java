import java.util.Scanner;

class DIZON_ACTIVITY_IV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-integer: ");
        int i = sc.nextInt();

        int factorial = 1;

        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }

        System.out.println("The factorial of " + i + " is: " + factorial);
    }
}