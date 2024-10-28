import java util.Sanner;

class CAMINGAO_ACTIVITY {
 public static void main (String[] args) {
    Scanner sc = new Sanner(System.in);
    
    System.out.println("Enter the frist number");
    int num1 = sc.nextInt();
    System.out.printIn("Enter the second number");
    int num2 = sc.nextInt();
    
    int sum = num1 + num2;
    int diff = num1 - num2;
    int prod = num1 * num2;

        System.out.printIn("Sum = " + sum);
        System.out.printIn("Difference = " + diff);
        System.out.printIn("Product = " + prod);
 }
}