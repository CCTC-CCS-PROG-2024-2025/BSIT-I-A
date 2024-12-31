import java.util.Scanner;

public class ANGCO_FINAL {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("How many people do you want to check the age for? ");
        int numPeople = scanner.nextInt();

        for (int i = 1; i <= numPeople; i++) {
            // Ask for each person's name and age
            System.out.print("Enter name for person " + i + ": ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("How old is " + name + "? ");
            int age = scanner.nextInt();

            if (age < 18) {
                System.out.println(name + " is a minor.");
            } else if (age >= 18 && age <= 60) {
                System.out.println(name + " is an adult.");
            } else {
                System.out.println(name + " is a senior citizen.");
            }
        }

        System.out.println("Thanks for using this Program. Goodbye Happy New Year!");

        scanner.close();
        
    }
}