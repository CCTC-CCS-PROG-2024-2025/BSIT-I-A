import java.util.Scanner;

public class VILLA_F_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-integer: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
          }
        System.out.println(" The factorial of " + num + " is " + factorial);
        sc.close();

    }
}
