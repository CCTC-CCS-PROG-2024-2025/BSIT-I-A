import java.util.Scanner;

public class DIZON_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.In);

        System.out.println("Enter first number: ");
        int  num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int diff;
        if (num1 > num2) {
        }
        else {
            diff = num1 - num2;
        }
        int prod = num1 * num2;

        System.out.println("Sum = "+ sum);
        System.out.println("Different = "+ diff);
        System.out.println("Product = "+ prod);
    }
}