import java.util.Scanner;

// oooops huli ka
public class CASERIAL_ACTIVITY_I {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] names = new String [5];

        System.out.println("\nList 5 Pogi");

        for (int i = 0; i < 5; i++) {
            System.out.print("Pogi " + (i + 1 ) + " : ");
            names[i] = scanner.nextLine();
        }

        int number;
        while (true) {
        System.out.print("Pili kana ng Pogi (1-5) : ");
        number = scanner.nextInt();

            if (number >=1 && number <=5) {
            System.out.println("\nSuper Pogi is " + names[number-1]);
            break;
            } else {
            System.out.println("\nIosin mo dae");
            
            }
        }
    }
}