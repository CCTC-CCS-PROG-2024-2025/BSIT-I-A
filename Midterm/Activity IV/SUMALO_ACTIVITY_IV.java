import java.util.Scanner;

 class SUMALO_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Input: ");
        int num = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}
