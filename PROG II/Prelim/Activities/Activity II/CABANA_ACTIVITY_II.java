import java.util.Scanner;

class CABAÑA_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] scores = new int [10];
        double sum = 0;
        System.out.println("Please enter 10 scores");

        for (int a=0; a<scores.length; a++) {
            System.out.print("Score " + (a+1) + ": ");
            scores [a] = sc.nextInt();
            sum += scores [a];
        }
        double average = sum/10;
        System.out.print("Average" + average);
    }
}