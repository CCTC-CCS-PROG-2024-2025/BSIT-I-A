import java.util.Scanner;

class LACANGLACANG_CoffeeRestaurant {

   public static void  main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Define prices for coffee menu items
         double espressoPrice = 45;   
         double lattePrice = 50;
         double cappuccinoPrice = 50;
         double mochaPrice = 55;
 
         // Display the coffee menu
         System.out.println("Welcome to the Coffee Restaurant!");
         System.out.println("Here is our menu:");
         System.out.println("1. Espresso - 45");
         System.out.println("2. Latte - 50");
         System.out.println("3. Cappuccino - 50");
         System.out.println("4. Mocha - 55");
 
         System.out.print("Please select a coffee by entering the corresponding number (1-4): ");
         int choice = sc.nextInt();
 
         double totalPrice = 0.0;
 
         switch (choice) {
             case 1:
                 totalPrice = espressoPrice;
                 System.out.println("You have selected Espresso.");
                 break;
             case 2:
                 totalPrice = lattePrice;
                 System.out.println("You have selected Latte.");
                 break;
             case 3:
                 totalPrice = cappuccinoPrice;
                 System.out.println("You have selected Cappuccino.");
                 break;
             case 4:
                 totalPrice = mochaPrice;
                 System.out.println("You have selected Mocha.");
                 break;
             default:
                 System.out.println("Invalid choice. Please select a number between 1 and 4.");
                 return; 
         }
 
         System.out.print("Would you like to add extra items? (yes/no): ");
         String extraChoice = sc.next();
 
         if (extraChoice.equalsIgnoreCase("yes")) {
             System.out.println("Additional items:");
             System.out.println("1. Milk - 5");
             System.out.println("2. Sugar - 3");
 
             System.out.print("\nSelect the extra item by number (1-3) or press 0 to skip: ");
             int extraItem = sc.nextInt();
 
             switch (extraItem) {
                 case 1:
                     totalPrice += 5;
                     System.out.println("Milk added.");
                     break;
                 case 2:
                     totalPrice += 3;
                     System.out.println("Sugar added.");
                     break;
                 case 0:
                     System.out.println("No extra items added.");
                     break;
                 default:
                     System.out.println("Invalid choice. No extra item added.");
             }
         }
 
         System.out.println("Your total price is: $" + totalPrice);
         System.out.print("Would you like to proceed with the order? (yes/no): ");
         String confirmOrder = sc.next();
 
         if (confirmOrder.equalsIgnoreCase("yes")) {
             System.out.println("Thank you for your order! Enjoy your coffee!");
         } else {
             System.out.println("Order canceled. Have a nice day!");
         }
 
         sc.close();
     }
 }