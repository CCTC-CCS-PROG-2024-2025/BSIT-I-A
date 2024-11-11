import java.util.Scanner;

public class ARGONCILLO_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter non-negative integer: ");
        int num = sc.nextInt();
        int factorial = 1;

        if (num < 0) {
            System.out.printl("Error factorial is not defined for negative number.");
        }else {
            for (int i = 1; i <= num; i++)
            factorial*=i;
        }
        System.out.printl("the factorial of " + num + "is" + factorial); 
    }    
}