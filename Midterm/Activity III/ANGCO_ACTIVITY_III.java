import java.util.Scanner;

public class ANGCO_ACTIVITY_III {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println();
        System.out.print("Enter Timer: ");
        int timer = scanner.nextInt();

        while (timer >= 0) {
            System.out.println(timer);
            timer--;
        } 
    }
}
