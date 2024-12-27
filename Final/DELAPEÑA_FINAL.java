import java.util.Scanner;

public class DELAPEÑA_FINAL {
    public static void main(String[] args) {
        int WP;
        System.out.println("Hi, welcome!");
        Scanner eg = new Scanner(System.in);
                    System.out.print("First Name: ");
                    String name = eg.nextLine();
                    System.out.print("Last Name: ");
                    String lastname = eg.nextLine();
                    System.out.println("Hello, " + name +" "+ lastname + "!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Select a number");
            System.out.println("2. Check if a number is even or odd");
            System.out.println("3. Factorial of a number");
            System.out.println("4. Exit");
            System.out.print("Please select a number 1-4: ");
            WP = sc.nextInt();

            switch (WP) {
                case 1:
                    System.out.print("Enter the range: ");
                    int number = sc.nextInt();
                    System.out.println("Numbers from 1 to " + number + ":");
                    for (int i = 1; i <= number; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter a number to check: ");
                    int gg = sc.nextInt();
                    if (gg % 2 == 0) {
                        System.out.println("The number is even.");
                    } else {
                        System.out.println("The number is odd.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number to calculate its factorial: ");
                    int fact = sc.nextInt();
                    if (fact < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        int factorial = 1;
                        int i = 1;
                        while (i <= fact) {
                            factorial *= i;
                            i++;
                        }
                        System.out.println("The factorial of " + fact + " is " + factorial);
                    }
                    break;

                case 4:
                    System.out.println("Thank you " + name +"," + " Goodbye!");
                    sc.close();
                    eg.close();
                    return;

                default:
                    System.out.println("Invalid choice, Try again.");
                    break;
            }
        }
    }
}