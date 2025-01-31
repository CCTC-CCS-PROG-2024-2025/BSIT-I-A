import java.util.Scanner;

class ZAMORA_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];                                                                // stores of the array 
       
        System.out.println("\nEnter the names of top 5 most handsome in the room: ");                 // asking the user to input names of the most handsome
        for (int x = 0; x < 5; x++) {
            System.out.print((x + 1) + ". ");
            names[x] = sc.nextLine();
        }   
        
        System.out.print("\nSelect the most handsome [1-5]: ");                                      // asking you to choose the most handsome 
        int choose = sc.nextInt();
        
        if (choose >= 1 && choose <= 5) {
            System.out.println("\nThe most handsome is: " + names[choose - 1]);                         // display the selected name ng pogi
        } else {
                System.out.println("\nInvalid choice. Please rerun and enter the most handsome between 1 and 5.\n");    // ayosin mo boy
            }       
        sc.close();
    }
}
