
import java.util.Scanner;
public class LAO_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Non-Negative Integer: ");
        int num = sc.nextInt();
        int i = 1, fact = 1;
        while(i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
