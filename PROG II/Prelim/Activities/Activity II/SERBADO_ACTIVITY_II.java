import java.util.Scanner;

class SERBADO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];
        double sum = 0; // Initialize the sum variable

        System.out.println("Please enter 10 scores:");

        for (int x = 0; x < scores.length; x++) {
            System.out.println("Score " + (x + 1) + ": ");
            scores[x] = sc.nextInt();
            sum += scores[x]; // Accumulate the sume of scores
        }
        double average = sum / scores.length; // Calculate the average
        System.out.println("The average of the entered scores is:" + average);
    }
 }