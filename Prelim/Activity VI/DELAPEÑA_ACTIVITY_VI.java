
import java.util.Scanner;

class DELAPEÑA_ACTIVITY_VI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Boys Number: ");
    int Boys = sc.nextInt();
    System.out.print("Enter Girls Number: ");
    int Girls = sc.nextInt();

    int sum = Boys + Girls;
    int  difference = Boys - Girls;
    int product = Boys * Girls;

    System.out.println(sum);
    System.out.println(difference);
    System.out.println(product);
  }
}