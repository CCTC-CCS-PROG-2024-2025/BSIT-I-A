import java.util.Scanner;

class ABONG_ACTIVITY_V {
    public static void main(String[]arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("How many boys in here");
        int Sum = sc.nextInt();
        System.out.println("How many girls in here");
        int Difference = sc.nextInt();

        int sum = Sum + Difference;
        int Diff = Sum - Difference;
        int product = Sum * Difference;
        
        System.out.println("sum = " +Sum);
        System.out.println("diff = " +Diff);
        System.out.println("product = " +product);
         
    


        
    }
}
