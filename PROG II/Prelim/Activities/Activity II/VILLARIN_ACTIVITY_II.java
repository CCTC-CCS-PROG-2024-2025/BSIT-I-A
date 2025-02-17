import java.util.Scanner;

class VILLARIN_ACTIVITY_II{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];
        double sum = 0;
        
        System.out.println("Enter 10 scores: ");

        for(int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1)+ ": ");
            scores[i] = scanner.nextDouble();
            sum += scores{i};

        }
        double average = sum / scores.length;
        System.out.println("The average of the entered score is: " + average);
    }
}
