import java.util.Scanner;

public class ARGONCILLO_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first second: ");
        int x = sc.nextLine();

        int y = x;

        do {
            System.out.println(y);
            y--;
        } while (y>=1);

        sc.close();
    }
}        
        
