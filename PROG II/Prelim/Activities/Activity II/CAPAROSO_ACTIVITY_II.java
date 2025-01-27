import java.util.Scanner;

class CAPAROSO_ACTIVITY_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];
        double sum = 0;
        for (int x=0; x<scores.length; x++){
            System.out.print("Score " + (x+1) + ": ");
            int score = sc.nextInt();
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("Average: "+ average);
    }
}
