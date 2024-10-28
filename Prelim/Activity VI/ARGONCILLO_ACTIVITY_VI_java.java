import java.util.Scanner;

public class class ARGONCILLO_ACTIVITY_VI_java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.In);

        System.out.println(x:"Enter the first number:");
        int num1 = input.nextInt();
        System.out.println(x:"Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int diff;
        if (num1 > num2) {
        }
        else {
            diff = num1 - num2;
        }
        int prod = num1 * num2;

        System.out.println("sum = "+ sum);
        System.out.println("Different = "+ diff);
        System.out.println("Product = "+ prod);
    }
}