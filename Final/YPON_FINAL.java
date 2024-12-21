import java.util.Scanner;

class YPON_FINAL {
    public static void main(String[] args) {

        String materialName;
        int quantity;
        double price;
        float discount;
        boolean inStock;
 
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the name of the art material:");
        materialName = scanner.nextLine();
 
        System.out.println("Enter the quantity:");
        quantity = scanner.nextInt();
 
        System.out.println("Enter the price per item:");
        price = scanner.nextDouble();
 
        System.out.println("Enter the discount percentage:");
        discount = scanner.nextFloat();
 
        System.out.println("Is the item in stock? (true/false):");
        inStock = scanner.nextBoolean();
 
        double totalPrice = quantity * price;
        double discountAmount = totalPrice * (discount / 100);
        double finalPrice = totalPrice - discountAmount;
 
        // Output the results
        System.out.println("Material: " + materialName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final price after discount: " + finalPrice);
        System.out.println("In stock: " + inStock);
 
        if (inStock) {
            System.out.println("The item is available for purchase.");
        } else {
            System.out.println("The item is currently out of stock.");
        }
 
        System.out.println("Enter the material type (1 for Paint, 2 for Brush, 3 for Canvas):");
        int materialType = scanner.nextInt();
        switch (materialType) {
            case 1:
                System.out.println("You selected Paint.");
                break;
            case 2:
                System.out.println("You selected Brush.");
                break;
            case 3:
                System.out.println("You selected Canvas.");
                break;
            default:
                System.out.println("Invalid selection.");
        }
 
        if (quantity > 10 && finalPrice > 100) {
            System.out.println("You qualify for a bulk purchase discount!");
        } else if (quantity > 5 || finalPrice > 50) {
            System.out.println("You qualify for a small discount.");
        } else {
            System.out.println("No additional discounts available.");
        }
 
        int count = 0;
        while (count < quantity) {
            System.out.println("Processing item " + (count + 1));
            count++;
        }
 
        for (int s = 0; s < quantity; s++) {
            System.out.println("Item " + (s + 1) + " processed.");
        }
 
        scanner.close();
    }
}       