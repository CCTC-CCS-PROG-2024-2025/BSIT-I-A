import java.util.Scanner;
public class RAGODOS_ACTIVITY_II {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println();
        System.out.print("Enter Your Age");
        int age = scanner.nextInt();

        if (age <=11) {
            System.out.println("child");
        } else if (age <=17) {
            System.out.println("Teen");
        } else if (age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
           
            scanner.close();
        }   


              
    }

    }
