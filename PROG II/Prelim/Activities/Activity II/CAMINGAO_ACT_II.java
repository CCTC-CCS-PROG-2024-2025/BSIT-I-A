import java.util.Scanner; 

 class CAMINGAO_ACTIVITY_II {

    public static void main(String[] args) {
        int[] scores = new int[10]; 
         Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < scores.length; i++) {
        
            System.out.println("Score "+ (i+1)+":");
            scores[i] = sc.nextInt();           
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / (double) scores.length;
        System.out.println("The average is: " + average);
        
    }
}