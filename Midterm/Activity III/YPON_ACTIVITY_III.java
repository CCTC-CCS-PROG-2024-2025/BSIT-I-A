import java.util.Scanner;

class YPON_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a timer");
        int num = sc.nextInt();

        while (num <= 0) {
            System.out.println(timer);
            timer--;
        }
    }
}