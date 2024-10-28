import java.util.Scanner;

public class CASERIAL_ACTIVITY_II_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int x = sc.nextInt();
        while(x > -1){
            System.out.println(x);
            x = x-1;
        }
    }
}