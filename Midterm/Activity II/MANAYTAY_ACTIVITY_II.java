import java.util.Scanner;

 class MANAYTAY_II{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextln();

        if (age >= 0 && age <= 11) {
            System.out.println("child");
        }
        else if (age >= 12 && age <= 17) {
            System.out.println("Teen");
        }
        else if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Enter a valid age:");
        }
    }


}