import java.util.Scanner;

class DELAPEÑA_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter an Input: ");
        int num = sc.nextInt();

        long factorial = 1;

        for (int i=1; i<=num; i++) {
            factorial*=i;
            sc.close();
    }
    System.out.println(" Factorial of " + num + " is: " + factorial);
  }
}