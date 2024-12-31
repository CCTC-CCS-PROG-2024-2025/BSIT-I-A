import java.util.Scanner;

public class PANUGALING_FINAL {
    public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println("Hello! Welcome to the Number Analyzer Program!");

    System.out.println();
    System.out.print("What's your name? ");
    String userName = scanner.nextLine();

    int userNumber;

    while (true) {
        System.out.print("Hi oy " + userName + "! Enter ug number between 1 and 100: ");
        userNumber = scanner.nextInt();

        if (userNumber >= 1 && userNumber <= 100) {
            break;
        } else {
            System.out.println("Oops! Dili na Pwede! . Please pick a number between 1 and 100.");
        }
    }

    System.out.println("Thanks, " + userName + "! Sana all pilion ang " + userNumber + ".");

    if (userNumber < 50) {
        System.out.println("Looks like your number is less than 50.");
    } else {
        System.out.println("Your number is 50 or greater. Cool!");
    }

    switch (userNumber % 2) {
        case 0:
            System.out.println("Also, " + userNumber + " is an EVEN number.");
            break;
        case 1:
            System.out.println("And guess what? " + userNumber + " is an ODD number.");
            break;
        default:
            System.out.println("Loh? Something went wrong. So weird!");
    }

    int sum = 0;
    int count = 1;
    while (count <= userNumber) {
        sum += count;
        count++;
    }
    System.out.println("The sum of all numbers from 1 to " + userNumber + " is: " + sum);

    double total = 0;
    for (int i = 1; i <= userNumber; i++) {
        total += i;
    }
    double average = total / userNumber;
    System.out.printf("The average of numbers from 1 to " + userNumber + " is: " + average);

    System.out.println("That’s it for now, " + userName + "! Salamat sa pagsuway ani nga program!");
    System.out.println("Goodbye! Happy New Year!");

    scanner.close();
    
    }

}