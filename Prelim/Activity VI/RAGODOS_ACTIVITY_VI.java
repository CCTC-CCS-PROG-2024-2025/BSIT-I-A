import java.util.Scanner;

class RAGODOS{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("enter the second number: ");
    int num2 = sc.nextInt();
    
    
    int sum = num1 + num2;
    int diff = num1 + num2;
    int prod = num1 + num2;
    System.out.println("sum= " + sum);
    System.out.println("Difference = " + diff);
    System.out.println("Product = " + prod);
}
}
    
        