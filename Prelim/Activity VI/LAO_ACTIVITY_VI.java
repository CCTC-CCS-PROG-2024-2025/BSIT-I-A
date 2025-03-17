import java.util.Scanner;

class LAO_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int score1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int score2 = sc.nextInt();

        int sum = score1 + score2;
        System.out.println("Sum = " + sum);
        int difference = score1 - score2;
        System.out.println("Difference = " + difference);
        int product = score1 * score2;
        System.out.println("Product = " + product);
    }
}