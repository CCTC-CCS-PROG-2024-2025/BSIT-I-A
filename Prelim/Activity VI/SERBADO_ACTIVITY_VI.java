import java.util.Scanner;
 
class SERBADO_ACTIVITY_VI{
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter your height: ");
       int height = sc.nextInt();
       System.out.print("Enter your weight: ");
       int weight = sc.nextInt();
       int sum = (height+weight);
       int diff = (height-weight);
       int prod = (height/weight);
       System.out.println("Sum: "+sum);
       System.out.println("Diff: "+diff);
       System.out.println("Prod: "+prod);
   }
}