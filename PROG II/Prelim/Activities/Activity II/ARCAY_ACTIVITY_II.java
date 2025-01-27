import java.util.Scanner;

class ARCAY_ACTIVITY_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];//Stores of the Array.
        double sum = 0;//Sum.
        
        System.out.println("Please input your scores");//Asking the user to input the scores.
        for (int x=0; x<scores.length; x++){//looping over arrays.
            System.out.print("Score " + (x+1) + ": ");
            scores [x] = sc.nextDouble(); //Input the scores.
            sum += scores[x];//Getting the sum.
        }
        double average = sum / scores.length;//Calculate the average.
        System.out.println("Average: "+ average);//Output the Average.
        sc.close();
    }
}