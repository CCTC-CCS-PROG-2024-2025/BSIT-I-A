import java.util.Scanner; // Import the Scanner class for user input

class JUNGOY_FINAL {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true; // Variable to control the loop

        // Main loop to keep the calculator running
        while (keepGoing) {
            // Display the menu
            System.out.println("Welcome to the Simple Calculator!");
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();

            // Exit if the user chooses to
            if (choice == 5) {
                keepGoing = false; // Set the loop control variable to false
                System.out.println("Thanks for using the calculator! Goodbye!");
                break; // Exit the loop
            }

            // Get the numbers from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble(); // First number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble(); // Second number

            // Variable to hold the result
            double result = 0;

            // Perform the operation based on the user's choice
            switch (choice) {
                case 1: // Addition
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2: // Subtraction
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3: // Multiplication
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4: // Division
                    if (num2 != 0) { // Check for division by zero
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Oops! You can't divide by zero.");
                    }
                    break;
                default: // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to do another calculation? (yes/no): ");
            String response = scanner.next(); // Get user response
            if (!response.equalsIgnoreCase("yes")) { // Check if the response is not "yes"
                keepGoing = false; // Set the loop control variable to false
                System.out.println("Thanks for using the calculator! Goodbye!");
            }
        }

        // Display a summary of the calculations performed
        System.out.println("Summary of calculations:");
        for (int i = 1; i <= 5; i++) { // For loop to display a simple summary
            System.out.println("Calculation " + i + ": Operation " + i);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}