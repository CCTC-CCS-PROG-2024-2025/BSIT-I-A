import java.util.Scanner;

public class LARGO_FINAL_ACTIVITY {

    // Method to calculate the probability of an event
    public static double calculateProbability(int favorableOutcomes, int totalOutcomes) {
        if (totalOutcomes == 0) {
            System.out.println("Error: Total outcomes cannot be zero.");
            return 0.0; // Return 0 if total outcomes are 0 to avoid division by zero
        }
        return (double) favorableOutcomes / totalOutcomes;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of favorable outcomes
        System.out.print("Enter the number of favorable outcomes: ");
        int favorableOutcomes = scanner.nextInt();

        // Ask for the total number of possible outcomes
        System.out.print("Enter the total number of outcomes: ");
        int totalOutcomes = scanner.nextInt();

        // Calculate the probability
        double probability = calculateProbability(favorableOutcomes, totalOutcomes);

        // Display the result
        if (totalOutcomes != 0) {
            System.out.println("The probability of the event is: " + probability);
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}