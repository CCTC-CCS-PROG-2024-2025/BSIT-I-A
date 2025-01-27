import java.util.Scanner;

class BACLAAN_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        double sum=0;

        System.out.println("Please Enter 10 Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("score " + (i + 1) +": ");
            scores[i] = scanner.nextDouble(); 
            sum += scores[i];
        }
        double average = sum / scores.length;
        System.out.println("The average of the entered score is:" + average);

        scanner.close();
    }
}