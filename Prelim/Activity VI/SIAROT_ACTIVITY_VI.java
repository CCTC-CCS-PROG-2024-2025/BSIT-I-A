import java.util.Scanner;

class SIAROT_ACTIVITY_VI {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1= sc.nextInt();
        System.out.println("Enter the other number:");
        int num2= sc.nextInt();
        int sum =num1 + num2;
        int prod = num1 * num2;
        int diff = num1 - num2;
        System.out.println("Sum = "+ sum);
        System.out.println("Prod = " + prod);
        System.out.println("Diff = "+ diff);





    }
}