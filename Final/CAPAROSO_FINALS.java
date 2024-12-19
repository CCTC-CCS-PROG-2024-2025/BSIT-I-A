import java.util.Scanner;

public class CAPAROSO_FINALS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO NILFA'S SHOE STORE!");
        
        // User information input loop
        String name;
        int age;
        double height, weight, shoeSize;
        boolean validInput = false;

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            System.out.print("Enter your height (in cm): ");
            height = scanner.nextDouble();

            System.out.print("Enter your weight (in kg): ");
            weight = scanner.nextDouble();

            System.out.print("Enter your Shoe Size (only option: 6.5, 7, 7.5, 8, 8.5): ");
            shoeSize = scanner.nextDouble();

            // Validate shoe size with a loop
            for (double validSize : new double[]{6.5, 7, 7.5, 8, 8.5}) {
                if (shoeSize == validSize) {
                    validInput = true;
                    break;
                }
            }

            if (!validInput) {
                System.out.println("Invalid shoe size. Please enter one of the available options.");
            }
        } while (!validInput); // Repeat until valid shoe size is entered

        double price = 0.0;
        String category = "";

        // Shoe price selection with loop
        int priceChoice;
        boolean validChoice = false;

        do {
            System.out.println("\nShoe Size: " + shoeSize);
            System.out.println("Choose your price option for brand of your shoes, note:ANY SHOE SIZE AND PRICES OF EACH BRAND ARE THE SAME :");
            System.out.println("1. Regular S-6.5, M-7 & 7.5, L-8 & 8.5 (puma shoes): " + 500.00);
            System.out.println("2. Premium S-6.5, M-7 & 7.5, L-8 & 8.5 (adidas shoes): " + 750.00);
            System.out.println("3. Limited Edition S-6.5, M-7 & 7.5, L-8 & 8.5 (nike shoes): " + 1000.00);

            System.out.print("Enter your choice (1, 2, or 3): ");
            priceChoice = scanner.nextInt();

            validChoice = priceChoice >= 1 && priceChoice <= 3; // Check for valid range 1-3

            if (!validChoice) {
                System.out.println("Invalid price option.");
            }
        } while (!validChoice); // Repeat until valid price choice is entered

        switch (priceChoice) {
            case 1:
                if (shoeSize >= 6.5) {
                    System.out.println("Incorrect price for this shoe size.");
                }
                price = 500.00;
                category = "Regular Puma";
                break;
            case 2:
                if (shoeSize < 6.5 || shoeSize > 8.5) {
                    System.out.println("Incorrect price for this shoe size.");
                }
                price = 750.00;
                category = "Premium Adidas";
                break;
            case 3:
                if (shoeSize <= 8.5) {
                    System.out.println("Incorrect price for this shoe size.");
                }
                price = 1000.00;
                category = "Limited Edition Nike";
                break;
        }

        // Payment section
        System.out.println("\nChoose your payment method:");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");

        System.out.print("Enter your choice (1 or 2): ");
        int paymentChoice = scanner.nextInt();

        System.out.print("Enter amount paid: ");
        double amountPaid = scanner.nextDouble();

        // Calculate change
        double change = amountPaid - price;

        // Display output with formatted amounts
        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Shoe Size: " + shoeSize);
        System.out.println("Price: " + price + " (" + category + ")");
        System.out.println("Payment Method:");
        if (paymentChoice == 1) {
            System.out.println("Cash");
        } else if (paymentChoice == 2) {
            System.out.println("Credit Card");
        } else {
            System.out.println("Invalid payment method.");
        }
        System.out.println("Amount Paid: " + amountPaid);

        if (change >= 0) {
            System.out.println("Change: " + change);
        } else {
            System.out.println("Insufficient payment. Please pay " + (change < 0 ? -change : change) + " more.");
        }

        scanner.close();
    }
}
