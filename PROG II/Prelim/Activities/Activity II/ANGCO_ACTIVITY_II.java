import java.util.Scanner;

class Abong_ACTIVITY_II {
    public static void main ( String [] args) {
        Scanner scanner = new Scanner ( System.in);
        double [] scores = new double [10];
        double sum = 0; 

        System.out.println(" Please enter 10 score:");

        for ( int i = 0; 1 < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];

            double average = sum / scores.length;
            System.out.println(" The average of the entered scores is " + average);
        }
    }
}
