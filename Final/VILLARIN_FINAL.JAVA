import java.util.Scanner;

public class MANAYTAY_FINAL{
    @SuppressWarnings("resource"){
        public static void main(String[] args)
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String name = "";
        double height = 0;
        double weight = 0;
        String size = "";
        int quantity = 0;
        double totalCost = 0;

        // Ask for user's name 
        System.out.print("enter your name: ");
        name = scanner.nexLine();

        // Ask for user's heigth and weight using a while loop
        boolean validInput = fales;
        while (lvalidInput) {
            System.out.print("Enter yor height (in cm): ");
            heigth = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            Symstem.out.print("Enter your weight (in kg): ");
            weight = scanner.nexDouble();
            scanner.nextLine(); // Consume newline left-over

            if (height > 0 && weight > 0) {
                validInput =true;
            }else{
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        // Determine T-shirt size based on height and weight
        size = determineSize(height. weight);

        // Ask for quantity using a for loop
        int attempts = 0;
        for (attempts = 0; attempts < 3; attempts++) {
        System.out.print("Enter the quantity of T-shirts you want to order: ");
        quantity = scanner.nexlint();
        scanner.nextLine(); // Consume nexline left-over

        if (quantity > 0) {
            break;
        } else {
            System.out.println("Invalid input. Please enter a positive number.");
        }
    }
    if (attempt ==3) {
        System.out,println("Maximum attempts reached. Defaulting to 1.");
        quantity = 1;
    }

    // Calculate total cost
    totalCost = calculatetoTotalCost(size, quantity);

    //Print the order summary
    System.out.println("\nOrder Summary:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height + " cm");
    System.out.println("Weight: " + weight + " kg");
    System.out.println("T-shirt Size: " + t-shirtSize);
    System.out.println("Price: " + price + "(" + catagory + ")");
    System.out,println("Payment Method:");
    for (paymentChoice == 1) {
        System.out.println("Cash");
    } else if (paymentChoice == 2) {
        System.out.println("Credit Card");
    } else {
        System.out.println("Invalid payment method.");
    }
    System.out.println("Amount Paid: " + amountPaid);

    if (charge >= 0) {
        System.out.println("Change: " + change);
    } else {
        System.out.println("Insufficient payment. Please pay " + (change < 0 ? -change : change) + " more. ");

    }

    scanner.close();
} 
}