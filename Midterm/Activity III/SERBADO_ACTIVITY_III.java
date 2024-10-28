import java.util.Scanner;
public class SERBADO_ACTIVITY_III {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        while (num >=0) {
            System.out.println(num);
            num--;
        }
    }
}
