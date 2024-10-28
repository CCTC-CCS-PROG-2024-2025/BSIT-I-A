import java.util.Scanner;

class CABANA_ACTIVITY_III {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int seconds = sc.nextInt();

        while (seconds >= 0){
            System.out.println(seconds);
            seconds--;
        }
    }
}