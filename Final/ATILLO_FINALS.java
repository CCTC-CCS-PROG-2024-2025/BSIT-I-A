import java.util.Scanner;

public class ATILLO_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user's information
        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        // Array of glasses with their descriptions and prices
        String[] glasses = {"Sunglasses", "Reading Glasses", "Blue Light Glasses"};
        double[] prices = {50.0, 30.0, 25.0};

        System.out.println("Welcome to the Glasses Shop! Choose your glasses below and see their prices!");

        // Display glasses and their descriptions
        for (int i = 0; i < glasses.length; i++) {
            System.out.println((i + 1) + ". " + glasses[i] + " - " + prices[i]);
        }

        // Get user's choice
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        // Use a switch statement to handle different choices
        switch (choice) {
            case 1:
                System.out.println("WOW! Great choice. You chose Sunglasses.");
                // Additional code for sunglasses, e.g., frame style, lens color
                break;
            case 2:
                System.out.println("Great! It suits you! You chose Reading Glasses.");
                // Additional code for reading glasses, e.g., magnification power
                break;
            case 3:
                System.out.println("Awesome taste! You chose Blue Light Glasses.");
                // Additional code for blue light glasses, e.g., lens tint
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Use a while loop to allow multiple selections
        boolean continueShopping = true;
        double totalCost = 0.0;
        while (continueShopping) {
            System.out.print("Do you want to add another item? (yes/no): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("yes")) {
                // Get user's choice and add to total cost
                System.out.print("Enter your choice (1, 2, or 3): ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 3) {
                    totalCost += prices[choice - 1];
                    System.out.println("Item added to cart.");
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                continueShopping = false;
            }
        }

        // Display the final total cost
        System.out.println("Total cost: $" + totalCost);
    }
}