import java.util.Scanner;

public class VILLA_A_FINAL {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String name = "";
        double height = 0;
        double weight = 0;
        String size = "";
        int quantity = 0;
        double totalCost = 0;

        // Ask for user's name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Ask for user's height and weight using a while loop
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter your height (in cm): ");
            height = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            System.out.print("Enter your weight (in kg): ");
            weight = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            if (height > 0 && weight > 0) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        // Determine T-shirt size based on height and weight
        size = determineSize(height, weight);

        // Ask for quantity using a for loop
        int attempts = 0;
        for (attempts = 0; attempts < 3; attempts++) {
            System.out.print("Enter the quantity of T-shirts you want to order: ");
            quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            if (quantity > 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        if (attempts == 3) {
            System.out.println("Maximum attempts reached. Defaulting to 1.");
            quantity = 1;
        }

        // Calculate total cost
        totalCost = calculateTotalCost(size, quantity);

        // Print the order summary     
        System.out.println("\nOrder Summary:");
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("T-shirt Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Php " + totalCost);

        // Print a message for each T-shirt ordered using a for loop
        for (int i = 0; i < quantity; i++) {
            System.out.println("T-shirt " + (i + 1) + " ordered successfully!");
        }

        // Close the Scanner object
        scanner.close();
    }

    // Method to determine T-shirt size based on height and weight
    public static String determineSize(double height, double weight) {
        if (height < 160 && weight < 50) {
            return "Small";
        } else if (height < 170 && weight < 60) {
            return "Medium";
        } else if (height < 180 && weight < 70) {
            return "Large";
        } else if (height < 190 && weight < 80) {
            return "Extra Large";
        } else {
            return "Extra Extra Large";
        }
    }

    // Method to calculate total cost
    public static double calculateTotalCost(String size, int quantity) {
        double cost = 0;
        switch (size) {
            case "Small":
                cost = 250.00;
                break;
            case "Medium":
                cost = 350.00;
                break;
            case "Large":
                cost = 450.00;
                break;
            case "Extra Large":
                cost = 550.00;
                break;
            case "Extra Extra Large":
                cost = 650.00;
                break;
        }
        return cost * quantity;
    }
}