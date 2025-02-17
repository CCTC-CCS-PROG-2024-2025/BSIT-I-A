import java.util.Scanner;

class DIMCO_ACTIVITY_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];//Stores of the Array.
        System.out.println("Please input your scores");
        double sum = 0;
        for (int x=0; x<scores.length; x++){
            System.out.print("Score " + (x+1) + ": ");
            int score = sc.nextInt();
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("Average: "+ average);
        sc.close();
    }
}