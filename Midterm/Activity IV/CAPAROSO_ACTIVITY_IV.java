import java.util.Scanner;

public class CAPAROSO_ACTIVITY_IV {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int num=scanner.nextInt();

        int factorial=1;

        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("The factorial of " + num + " is " + factorial);
    }
}
