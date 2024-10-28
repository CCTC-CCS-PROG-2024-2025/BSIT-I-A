import java.util.Scanner;
class LARGO_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{

        System.out.print("enter the first number: ");
        int no1 = sc.nextInt();
        System.out.print("enter the second number: ");
        int no2 = sc.nextInt();
        }

        int sum = no1+no2;
        int diff = no1-no2;
        int prod = no1*no2;


        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);


    }
}