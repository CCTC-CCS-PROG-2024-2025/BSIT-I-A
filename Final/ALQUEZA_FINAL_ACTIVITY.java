import java.util.Scanner;

public class ALQUEZA_FINAL_ACTIVITY{

    public static void main(String[] args) {
        // Product names and prices
        String[] products = {"Rice - ₱50.00/kg", "Eggs - ₱7.00/pc", "Milk - ₱80.00/liter", 
                            "Bread - ₱35.00/loaf", "Chicken - ₱180.00/kg"};
        double[] prices = {50.00, 7.00, 80.00, 35.00, 180.00};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message and menu display
        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Here are our products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }

        // Variables for tracking the order
        double totalPrice = 0.0;
        StringBuilder orderDetails = new StringBuilder();
        boolean ordering = true;

        // Start ordering products
        while (ordering) {
            System.out.print("\nEnter the number (1-5), or 0 to finish: ");
            int choice = scanner.nextInt();

            // Use switch statement for handling user choice
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    totalPrice += prices[choice - 1] * quantity;
                    orderDetails.append(quantity + " x " + products[choice - 1] + "\n");
                    System.out.println(quantity + " " + products[choice - 1] + " added to your order.");
                    break;

                case 0:
                    ordering = false;
                    System.out.println("\nThank you for your order!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            // Discount feature: Apply a 5% discount for orders over ₱1000
            if (totalPrice > 1000.00) {
                System.out.println("\nCongratulations! You've earned a 5% discount.");
                totalPrice *= 0.95; // Apply discount
                break; // Exit ordering loop after applying discount
            }
        }

        // Bonus feature: Freebies - 1 pack of cookies for orders over ₱500
        if (totalPrice > 500.00) {
            System.out.println("\nFreebies! You get a free pack of cookies!");
            orderDetails.append("Cookies - ₱0.00 (Freebies)\n");
        }

        // Display order summary
        if (orderDetails.length() > 0) {
            System.out.println("\nYour order:");
            System.out.println(orderDetails.toString());
            System.out.printf("Total price: ₱%.2f\n", totalPrice);
        } else {
            System.out.println("No items were ordered.");
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }
}
