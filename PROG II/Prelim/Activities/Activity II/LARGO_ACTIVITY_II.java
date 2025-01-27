import java.util.Scanner;

public class LARGO_ACTIVITY_II {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];

        System.out.println("Enter 10 score: ");

        for(int i = 0; i < scores.length; i++) {
            System.out.println("Score" + (i + 1) + ": ");
            scores[i] = sc.nextDouble();
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("the average score is: " + average);
    }
}