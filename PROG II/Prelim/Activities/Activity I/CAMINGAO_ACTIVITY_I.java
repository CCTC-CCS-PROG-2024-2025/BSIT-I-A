import java.util.Scanner;

public class CAMINGAO_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        
        System.out.println("\nPlease enter the names:");
        for (int x = 0; x < names.length; x++) {
            System.out.print((x + 1) + ". ");
            names[x] = sc.nextLine();
        }
        
        int choose;
        while (true) {
            System.out.print("\nSelect a display name:");
            if (sc.hasNextInt()) {
                choose = sc.nextInt();
                if (choose >= 1 && choose <= 5) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); 
            }
        }

        System.out.println("Name: " + names[choose - 1]);
        sc.close();
    }
}