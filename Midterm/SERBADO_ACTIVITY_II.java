  import java.util.Scanner;
class SERBADO_ACTIVITY_II {
    public static void main ( String[] args ) {
     Scanner sc = new Scanner (System.in);
          System.out.println("Enter the age");
     int num = sc.nextInt();

    if (age >= 0 && age <= 11) {
        System.out.println("Child");
    }
    else if (age <= 17) {
        System.out.println("Teen");
    }
    else if (age >= 18 && age <= 64) {
        System.out.println("Adult");
    }

     }
    }
