import java.util.Scanner;

class CANEZARES_ACTIVITY_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];
        double sum = 0;
        
        System.out.println("Kindly provide your scores: ");
        for (int x=0; x<scores.length; x++){
            System.out.print("Score " + (x+1) + ": ");
            scores [x] = sc.nextDouble(); 
            sum += scores[x];
        }

        double avg = sum / scores.length;
        System.out.println("Average: "+ avg);
        
        sc.close();
    }
}