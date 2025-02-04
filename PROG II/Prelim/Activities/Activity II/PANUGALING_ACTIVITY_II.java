import java.util.Scanner;

public class PANUGALING_ACTIVITY_II {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int [] scores = new int [10];

        System.out.println("\nPlease Enter 10 scores");

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            sum += scores[i]; // sum = sum + scores[i];
        }

    
        double average = sum / 10.0;

    
        System.out.println("\nThe average of the scores is: " + average);

    }
}   