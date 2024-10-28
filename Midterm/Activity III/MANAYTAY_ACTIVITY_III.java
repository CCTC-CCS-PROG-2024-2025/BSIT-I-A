import java.util.Scanner;
public class MANAYTAY_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds Number: ");
        int sec = sc.nextlnt();
        while (sec >= 0) {
            System.out.println(sec);
            sec--;
        }
    }
}
