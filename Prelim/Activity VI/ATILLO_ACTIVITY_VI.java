import java.util.Scanner;

class ATILLO_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int score1 = sc.nextInt();
        System.out.println("Enter the first number");
        int score2 = sc.nextInt();

        int sum = score1 + score2;
        int difference = score1 - score2;
        int product = score1 = score2;
        System.out.println("sum: " + sum);
        System.out.println("Difference:" + difference);
        System.out.println("product: " + product);
    }
}
