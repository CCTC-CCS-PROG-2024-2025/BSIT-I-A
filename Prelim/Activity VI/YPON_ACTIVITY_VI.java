import java.util.Scanner;

public class YPON_ACTIVITY_VI {
public static void main (String[] args) {
 Scanner sc = new Scanner (System.in);
 
 System.out.print("Enter the first number");
 int num1 = sc.nextInt();
 System.out.print("Enter the second number");
 int num2 = sc.nextInt();

 int sum = num1 + num2;
 int diff = num1 - num2;
 int prod = num1 * num2;

 System.out.println("Sum: " + sum);
 System.out.println("Difference: " + diff);
 System.out.println("Product: " + prod);
}
}
