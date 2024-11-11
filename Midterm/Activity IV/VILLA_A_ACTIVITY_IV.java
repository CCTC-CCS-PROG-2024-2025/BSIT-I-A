import java.util.Scanner;

class VILLA_A_ACTIVITY_IV{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter non-negative integers:");
    int n = sc.nextInt();
    long fact = 1;

    for(int i = 1; i<=n; i++){
    fact*=i; 

    }
    System.out.println(fact);
}    
}
