import java.util.Scanner;

public class VILLA_F_FINALS {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int age;
            boolean accessGranted = false;

            // age verification
        System.out.print("Enter your age: ");
            age = scanner.nextInt();
                    if (age >= 18 && age <= 65) {
                        accessGranted = true;
                        scanner.close();
        System.out.println("Access granted......");
                    } else {
        
            System.out.println("Acess denied... Age restriction (18-65)...");  
                    }       
                    if (accessGranted) {
                        while (true) {
            int choice;
            double total = 0;
            while (true) {
                    // Food Menu
    System.out.println("\nFast Food Menu: ");
    System.out.println("1. Burger (P45)");
    System.out.println("2. Pizza (P125)");
    System.out.println("3. Sandwich (P35)");
    System.out.println("4. Salad (P60)");
    System.out.println("5. Drinks (P20)");
    System.out.println("6. Order Total");
    System.out.println("7. EXIT");

    System.out.println("Enter Choice (1-7): ");
                choice = scanner.nextInt();
                    // A loop for each food order and it will sum all the total if 6 is choosen in the order menu
                    switch(choice) {
                        case 1:
                        total += 45;
System.out.println("Burger added to order...");
                        break;
                        case 2:
                        total += 125;
System.out.println("Pizza added to order...");
                        break;
                        case 3:
                        total += 35;
System.out.println("Sandwich added to order...");
                        break;
                        case 4:
                        total += 60;
System.out.println("Salad added to order...");
                        break;
                        case 5:
                        total += 20;
System.out.println("Drink added to order...");
                        break;
                        case 6:
System.out.printf("Order total: P%.2f%n", total);
                        break;
                        case 7:
System.out.println("Thank you for ordering.....");

                    return;
                    default:

System.out.println("Invalid choice.....");
                        }
                    }
                }
            }
        }
    }
