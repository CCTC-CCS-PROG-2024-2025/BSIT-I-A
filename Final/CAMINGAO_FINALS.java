import java.util.Scanner;

public class CAMINGAO_FINALS {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static int amount = 0;

    public static void main (String[] args) {
        do {
            System.out.println("WELCOME TO CAMINGAO'S FINE FOOD\n");
            System.out.println("~\n~\n~\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ \n" +
                    "--Camingao's Fine Food Main Menu--\n" +
                    "* 1   -     House Special      ~\n" +
                    "~ 2   -     Seafoods           *\n" +
                    "* 3   -     Beverages          ~\n" +
                    "~ 4   -     Desserts           *\n" +
                    "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ \n~\n~\n~");

            System.out.print("What would you like to order?: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1: House_Special();
                    break;
                case 2: Seafoods();
                    break;
                case 3: Beverages();
                    break;
                case 4: Desserts();
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("Invalid input\n");
            }
        } while (choice != 5);
    }

    public static void House_Special() {
        displayMenu("House Special", new String[]{
                "Spaghetti               - 55.00",
                "Humba                   - 35.00",
                "Fried Rice              - 30.00",
                "Crispy Fried Dumpling   - 45.00"
        });

        System.out.print("Enter Order for the House Special: ");
        choice = sc.nextInt();
        processOrder(new int[]{55, 35, 30, 45}, choice);
    }

    public static void Seafoods() {
        displayMenu("Seafoods", new String[]{
                "Shrimp salted egg       - 75.00",
                "Baked Scallops          - 50.00",
                "Crab Gata w/ sitaw      - 45.00",
                "Adobong pusit           - 85.00"
        });

        System.out.print("Enter Order for the Seafoods: ");
        choice = sc.nextInt();
        processOrder(new int[]{75, 50, 45, 85}, choice);
    }

    public static void Beverages() {
        displayMenu("Beverages", new String[]{
                "Bottled Water           - 20.00",
                "Pineapple juice         - 35.00",
                "Coke Zero               - 55.00",
                "Houseblend Iced Tea     - 68.00"
        });

        System.out.print("Enter Order for the Beverages: ");
        choice = sc.nextInt();
        processOrder(new int[]{20, 35, 55, 68}, choice);
    }

    public static void Desserts() {
        displayMenu("Desserts", new String[]{
                "Strawberry Cheesecake   - 280.00",
                "Cloud Crinkles          - 200.00",
                "Oreo Choco Chip         - 95.00",
                "Cashew Yema Tarts       - 230.00"
        });

        System.out.print("Enter Order for the Dessert: ");
        choice = sc.nextInt();
        processOrder(new int[]{280, 200, 95, 230}, choice);
    }

    // Helper method to display the menu
    public static void displayMenu(String category, String[] items) {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("<>               " + category + "             <>");
        for (String item : items) {
            System.out.println("<> " + item + " <>");
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
    }

    // Helper method to process an order
    public static void processOrder(int[] prices, int choice) {
        if (choice >= 1 && choice <= prices.length) {
            System.out.print("\nEnter the desired quantity: ");
            int quantity = sc.nextInt();
            amount += prices[choice - 1] * quantity;
            System.out.println("\nYou ordered " + quantity + " of item " + choice);
            System.out.println("Your bill is: " + amount);
        } else {
            System.out.println("Invalid input, returning to menu.");
        }

        askForMoreOrders();
    }

    // Method to ask if the user wants to place another order
    public static void askForMoreOrders() {
        System.out.print("1 - Yes   2 - No\nWant to place another order?: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println("\nThank you for purchasing, please come again.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input. Exiting.");
                System.exit(0);
                break;
        }
    }
}
