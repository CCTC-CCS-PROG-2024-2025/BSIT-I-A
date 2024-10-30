import java.util.Scanner;

public class DIMCO_ACTIVITY_III {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

       int y = x;

       do {
        System.out.println(y);
        y--;
       } while (y >= 1);

       sc.close();

    }
}