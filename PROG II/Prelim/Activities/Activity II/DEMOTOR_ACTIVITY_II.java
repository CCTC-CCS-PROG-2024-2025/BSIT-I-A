import java.util.Scanner; //this imports the Scanner class to enable user input in java

public class DEMOTOR_ACTIVITY_II { //defines a (public) java class
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //this creates a Scanner object sc to take input from the user
        int[] scores = new int[10]; //scores array that holds 10 integer values
        double sum = 0; //this initializes a double variable called 'sum' to store the total of array integer values
        for (int x = 0; x < scores.length; x++) { //this loop iterates through the scores array from index 0 to 9, increasing x by 1 each time
            System.out.print("Score " + (x + 1) + ": "); //output the loop
            int score = sc.nextInt(); //ask the user to input the scores
            sum += score; //adding the value of scores to the sum and updates the sum
        }
        double average = sum / scores.length; //this will calculate the average
        System.out.println("Average: " + average); //output the average
        sc.close(); //stop
    }
}