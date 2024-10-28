import java.util.Scanner;

public class VILLA_F_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a number");
        int b = sc.nextInt();
        int sum = a + b;
        int mult = a * b;
        int minus = a - b;
        sc.close();
        System.out.println("sum = " + sum);
        System.out.println("mult = " + mult);
        System.out.println("minus = " + minus);
       }
    
    
}
