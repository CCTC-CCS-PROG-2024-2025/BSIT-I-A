import java.util.Scanner;

class VILLAR_ACTIVITY_IV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Input the non-Negative Integer: ");
        int num = sc.nextInt();

        if (num < 0){ 
            System.out.println(" Factorial Numberistt Kay Error ");
        } else {
            int fac = 1;
            for(int i = 1; i<=num; i++){
                fac *= i;
            } System.out.println(" The Factorial of " + num + " = " + fac);
        }
    }
}