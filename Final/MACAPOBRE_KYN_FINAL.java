import java.util.Scanner;

public class MACAPOBRE_FINAL {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Zenless Zone Zero Merchandise Shop!");

        // Product information (using variables)
        String[] products = {"T-shirts", "Hoodies", "Figures", "Keychains"};
        double[] prices = {15.00, 30.00, 50.00, 10.00}; 
        int[] stock = {100, 50, 20, 150};

        // User input (using Scanner)
        Scanner scanner = new Scanner(System.in);

        int choice;
        int quantity;
        double total = 0.0;

        // Display product catalog
        System.out.println("Product Catalog:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
        }

        // User selection (using while loop)
        while (true) {
            System.out.print("Enter your choice (1-" + products.length + " or 0 to exit): ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit the loop
            }

            // Check for valid choice
            if (choice < 1 || choice > products.length) {
                System.out.println("Invalid choice. Please try again.");
                continue; // Skip to the next iteration
            }

            // Get quantity from user
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();

            // Check for sufficient stock
            if (quantity > stock[choice - 1]) {
                System.out.println("Insufficient stock. Available: " + stock[choice - 1]);
                continue; // Skip to the next iteration
            }

            // Calculate price
            double itemPrice = prices[choice - 1] * quantity;
            total += itemPrice;

            // Update stock
            stock[choice - 1] -= quantity;

            System.out.println(quantity + " " + products[choice - 1] + "(s) added to cart. Total: $" + total);
        }

        // Display final bill
        System.out.println("\nThank you for shopping! Your total is: $" + total);

        // Discount (using conditions)
        if (total >= 100) {
            double discount = total * 0.1; // 10% discount;
            System.out.println("Congratulations! You've received a 10% discount of $" + discount);
        }

        // Payment options (using switch statement)
        System.out.println("\nPayment Options:");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        System.out.print("Select your payment method: ");
        int paymentChoice = scanner.nextInt();

        switch (paymentChoice) {
            case 1:
                System.out.println("Payment made in cash.");
                break;
            case 2:
                System.out.println("Payment made by credit card.");
                break;
            case 3:
                System.out.println("Payment made by debit card.");
                break;
            default:
                System.out.println("Invalid payment method.");
        }

        System.out.println("\nOrder completed!");
    }
}