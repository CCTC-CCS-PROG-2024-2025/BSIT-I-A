import java.util.Scanner;

public class ARGONGONCILLO_FINALS {
    
    public static void main(String[] args) {
        // Declare and initialize variables
        int age = 19;
        String name = "ALVEN";

        // Conditional statement (if-else)
        if (age >= 18) {
            System.out.println(name + " an adult.");
        } else {
            System.out.println(name + " a minor.");
        }

        // Looping (for loop)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Looping (while loop)
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Switch statement
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("July");
                break;
            case 2:
                System.out.println("August");
                break;
            case 3:
                System.out.println("September");      
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}