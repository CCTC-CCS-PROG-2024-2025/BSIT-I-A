import java.util.Scanner;

public class APURADO_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the JEFER'S Haircut Shop!");

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your Haircut:");
        System.out.println("10. Classic Cut (200)");
        System.out.println("22. Modern Fade (300)");
        System.out.println("36. Undercut (350)");
        System.out.println("40. Crew Cut (250)");



        // Get user's choice
        System.out.print("Enter your choice (from selected options): ");
        int choice = scanner.nextInt();

        

        // Use a switch statement to process the choice
        switch (choice) {
            case 10:
                System.out.println(name + ", you chose Classic Cut (200)");
                // Add to cart or process payment
                break;
            case 22:
                System.out.println(name + ", you chose Modern Fade (300)");
                // Add to cart or process payment
                break;
            case 36:
                System.out.println(name + ", you chose Undercut (350)");
                // Add to cart or process payment
                break;
            case 40:
                System.out.println(name + ", you chose Crew Cut (250)");
                // Add to cart or process payment
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }


        // Example of using a for loop:
        // Let's say we want to print the haircut options using a for loop
        System.out.println("Thank You for choosing us! Here's your freebies!");
        String[] Thankyou = {"Shampoo", "Conditioner", "5% discount", "Towel"};
        int[] prices = {5, 3, 5, 1};

        for (int i = 0; i < Thankyou.length; i++) {
            System.out.println((i + 1) + ". " + Thankyou[i] + " (" + prices[i] + ")");
        }

        scanner.close();
    }
}