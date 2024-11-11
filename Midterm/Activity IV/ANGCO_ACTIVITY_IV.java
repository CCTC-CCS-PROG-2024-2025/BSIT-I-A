import java.util.Scanner;

public class ANGCO_ACTIVITY_IV {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Enter non-negative integer: ");
    int integer = scanner.nextInt();

    int factorial = 1;

    for (int i = 1; i <= integer; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + integer + " is " + factorial);
  }
}