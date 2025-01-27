import java.util.Scanner;
    
public class VILLA_F_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] scores = new int[10];
                double sum = 0;
                
        System.out.println("ENTER 10 scores:");
                for (int i = 0; i < scores.length; i++) {

            System.out.print("Score " + (i + 1) + ": ");
                scores[i] = scanner.nextInt();
                    sum += scores[i];
                }
                double average = sum / scores.length;
                System.out.println("THE AVERAGE IS: " + average);

                    scanner.close();
            }
    }