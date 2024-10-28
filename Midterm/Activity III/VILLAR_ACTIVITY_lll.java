import java.util.Scanner;

class VILLAR_ACTIVITY_III { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of seconds: ");
        int second = sc.nextInt();

        while (second >= 0){
            System.out.println(second);
            second--;
        }
    }
}