import java.util.Scanner;

class YPON_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] scores = new double[10]; 
        double sum=0; 
       
        System.out.println("Please Enter 10 Scores: ");
        for (int x = 0; x < scores.length; x++) { 
            System.out.print("Score " + (x + 1) + ": ");
            scores[x]= sc.nextInt(); 
            sum += scores[x]; 
        }
        double average = sum / scores.length;
        System.out.println("The average of the entered score is:" + average);
        sc.close();
    }
}
