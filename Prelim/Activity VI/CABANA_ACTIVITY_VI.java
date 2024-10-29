import java.util.Scanner;

class CABANA_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int z = sc.nextInt();
        
        int sum = x + z;
        int diff = x - z;
        int prod = x * z;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
    }
}