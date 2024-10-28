import java.util.Scanner;

public class JUNGOY_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input timer: ");
        int x = sc.nextInt();

        int y = x;

        do{
            System.out.println(y);
            y--;
        } while(y >= 1);

          sc.close();
    }

}
