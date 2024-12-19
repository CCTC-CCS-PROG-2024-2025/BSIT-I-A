import java.util.Scanner;

public class SIAROT_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your skin type and ");
        String skinType = scanner.nextLine();

        System.out.print("Also your contact number: ");
        String contactNumber = scanner.nextLine();

        // Brand Choice
        System.out.println("\nChoose your preferred brand:");
        System.out.println("0302. BLK Cosmetics:$345");
        System.out.println("8634. Vice Cosmetics:$245");
        System.out.print("Enter your choice: ");
        int brandChoice = scanner.nextInt();

        // Product Selection and Calculation
        int productCount;
        double totalPrice = 0.0;

        switch (brandChoice) {
            case 0302:
                System.out.print("Enter the number of BLK blush products you want: ");
                productCount = scanner.nextInt();
                totalPrice = productCount * 345;
                break;
            case 8634:
                System.out.print("Enter the number of Vice Cosmetics blush products you want: ");
                productCount = scanner.nextInt();
                totalPrice = productCount * 245;
                break;
            default:
                System.out.println("Invalid brand choice.");
                return;
        }

        // Customer Information and Purchase Summary
        System.out.println("\nThank You for purchasing dear costumer! Here's your info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Skin Type: " + skinType + "Contact Number: " + contactNumber);

        System.out.println("\nPurchase Summary:");
        System.out.println("Brand: " + (brandChoice == 1 ? "BLK Cosmetics" : "Vice Cosmetics"));
        System.out.println("Number of Products: " + productCount);
        System.out.println("Total Price: $" + totalPrice);

        scanner.close();
    }
}