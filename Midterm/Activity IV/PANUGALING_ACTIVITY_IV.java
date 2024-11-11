import java.util.Scanner;

public class PANUGALING_ACTIVITY_IV {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.println();
    System.out.print("Enter a non-negative integer: ");
    int integer = scanner.nextInt();

    int factorial = 1;

    for (int i = 1; i <= integer; i++) {
        factorial *= i;
    }

    System.out.println("So, the factorial of " + integer + " is " + factorial);


  }
}