import java.util.Scanner;

public class PANUGALING_ACTIVITY_VI {
    public static void main(String[] args) {

    // Declare Variables to store the numbers and the results
    double num1, num2;
    double  sum, difference, product;

    // Scanner Object
    Scanner scanner = new Scanner(System.in);

    // User Input
    System.out.println();
    System.out.println("Welcome to Basic Input Calculator");
    System.out.println();

    System.out.print("Please Enter First Number: ");
    num1 = scanner.nextDouble();

    System.out.print("PLease Enter Second Number: ");
    num2 = scanner.nextDouble(); 

    // Performing Simple Equations
    sum = num1 + num2;
    difference = num1 - num2;
    product = num1 * num2;

    // Printing Results
    System.out.println();
    System.out.println("---RESULTS---");
    System.out.println("Sum = " + sum);
    System.out.println("Difference = " + difference);
    System.out.println("Product = " + product);

    }
}