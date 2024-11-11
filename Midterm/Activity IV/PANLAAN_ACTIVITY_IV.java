import java.util.Scanner;

class PANLAAN_ACTIVITY_IV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input a Non-Negative Integer: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Factorial Number Error");
        } else {
            int Fac = 1;
            for(int i = 1; i<=num; i++){
                Fac *= i;
            } System.out.println("The Factorial of " + num + " = " + Fac);
        }
    }
}
        