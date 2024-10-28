import java.util.Scanner;

class APURADO_ACTIVITY_VI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ener First Number: ");
        int score1 = sc.nextInt();
        System.out.print("Enter second number");
        int score2 = sc.nextInt();

        int sum = score1 + score2;
        System.out.print("Sum = " + sum);
        int diff = score1 - score2;
        System.out.print("Difference = " + diff);
        int product = score1 * score2;
        System.out.print("Product = " + product);
    }
}
