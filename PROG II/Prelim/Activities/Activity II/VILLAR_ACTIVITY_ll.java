import java.util.Scanner;

class VILLAR_ACTIVITY_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];     //stores of the array.
        double sum = 0;     //sum.
        
        System.out.println("Please input your scores");     //asking the user to input the scores.
        for (int x=0; x<scores.length; x++){      //looping over arrays.
            System.out.print("Score " + (x+1) + ": ");
            scores [x] = sc.nextDouble();    //input the scores.
            sum += scores[x];     //getting the sum.
        }
        double average = sum / scores.length;    //calculate the average.
        System.out.println("Average: "+ average);     //output the average.
    }
}