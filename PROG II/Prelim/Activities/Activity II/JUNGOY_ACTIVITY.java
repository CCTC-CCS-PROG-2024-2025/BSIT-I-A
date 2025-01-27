import java.util.Scanner;

class JUNGOY_ACTIVITY_II {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];
        double sum = 0;

        System.out.println("Plese enter your 10 score: ");

        for (int i = 0; i <scores.length; i++){
            System.out.print("Score " + (i+1) + ": ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        double average = sum / scores.length;
        System.out.println("Average: "+ average);
    }
}