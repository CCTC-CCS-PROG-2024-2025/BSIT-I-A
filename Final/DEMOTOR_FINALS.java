import java.util.Scanner;

public class DEMOTOR_FINALS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Information
        String[] userPrompts = {
                "Enter your name: ",
                "Enter your contact number: ",
                "Enter your address: "
        };
        String[] userInfo = new String[userPrompts.length];

        for (int i = 0; i < userPrompts.length; i++) {
            System.out.print(userPrompts[i]);
            userInfo[i] = scanner.nextLine();
        }

        // Furniture Selection
        System.out.println("\nChoose only one furniture item for each purchase:");
        String[] furnitureOptions = {
                "1. Bed",
                "2. Sala Set",
                "3. Sofa Bed",
                "4. Drawers"
        };

        for (String option : furnitureOptions) {
            System.out.println(option);
        }

        System.out.print("Enter your choice (1-4): ");
        int furnitureChoice = scanner.nextInt();

        // Wood Type Selection
        System.out.println("\nChoose your preferred wood type:");
        String[] woodOptions = {
                "13. Mahogany",
                "22. Bamboo",
                "36. Pine"
        };

        for (String option : woodOptions) {
            System.out.println(option);
        }

        System.out.print("Enter your choice (13, 22 or 36): ");
        int woodTypeChoice = scanner.nextInt();

        // Purchase Summary
        String furnitureName = "";
        String woodType = "";

        switch (furnitureChoice) {
            case 1:
                furnitureName = "Bed";
                break;
            case 2:
                furnitureName = "Sala Set";
                break;
            case 3:
                furnitureName = "Sofa Bed";
                break;
            case 4:
                furnitureName = "Drawers";
                break;
            default:
                System.out.println("Invalid furniture choice.");
                return;
        }

        switch (woodTypeChoice) {
            case 13:
                woodType = "Mahogany";
                break;
            case 22:
                woodType = "Bamboo";
                break;
            case 36:
                woodType = "Pine";
                break;
            default:
                System.out.println("Invalid wood type choice.");
                return;
        }

        System.out.println("\nHere's your details:");
        System.out.println("Name: " + userInfo[0]);
        System.out.println("Contact Number: " + userInfo[1]);
        System.out.println("Address: " + userInfo[2]);
        System.out.println("Furniture: " + furnitureName);
        System.out.println("Wood Type: " + woodType);

        System.out.println("\nFor more info, kindly message us at Demotor Furniture FB page.");

        scanner.close();
    }
}