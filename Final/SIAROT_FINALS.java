import java.util.Scanner;

public class SIAROT_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your skin type (Oily, Dry, Normal, Combination): ");
        String skinType = scanner.next();

        System.out.print("Enter the number of blush on you want to buy: ");
        int numberOfBlush = scanner.nextInt();

        System.out.println("Choose your preferred brand:");
        System.out.println("1. BLK Cosmetics=$345");
        System.out.println("2. Vice Cosmetics=$245");
        System.out.print("Enter your choice: ");
        int brandChoice = scanner.nextInt();

        int totalPrice = 0;
        switch (brandChoice) {
            case 1:
                totalPrice = numberOfBlush * 345;
                System.out.println("You chose BLK Cosmetics.");
                break;
            case 2:
                totalPrice = numberOfBlush * 245;
                System.out.println("You chose Vice Cosmetics.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (totalPrice > 0) {
            System.out.println("\nCustomer Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Skin Type: " + skinType);
            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("No purchase made.");
        }

        scanner.close();
    }
}