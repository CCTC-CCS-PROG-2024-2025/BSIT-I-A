import java.util.Scanner;

class SIAROT_ACTIVITY_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];//Stores of the Array.
        System.out.println("Please input your scores");
        double sum = 0;
        for (int x=0; x<scores.length; x++){
            System.out.print("Score " + (x+1) + ": ");
            int score = sc.nextInt();//Input the scores.
            sum += score;//Getting the sum.
        }
        double average = sum / scores.length;//Calculate the average.
        System.out.println("Average: "+ average);//Output the Average.
        sc.close();
    }
}