import java.util.Scanner;

class ALQUEZA_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff;
        if (num1 > num2) {
            diff = num1 - num2;
        } else {
            diff = num2 - num1;
        }
        int prod = num1 * num2;

        System.out.println("Sum ="+ sum);
        System.out.println("Different ="+ diff);
        System.out.println("Product ="+ prod);
    }
}