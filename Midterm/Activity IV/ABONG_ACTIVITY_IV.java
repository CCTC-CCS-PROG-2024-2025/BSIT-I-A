import java.util.Scanner;
public class ABONG_ACTIVITY_IV {
 public static void main (String[]args) {
    Scanner sc = new Scanner( System.in);
    System.out.println("Enter a Non-Negative Integher:");
    int num = sc.nextInt();
    int i = 1,fact =1; 

    for ( int I = 1; i<=num;i++) {
        fact *= i;
        i++;
    }
    System.out.println("the fact of "+ num + " is 3"+ fact);
 }

}