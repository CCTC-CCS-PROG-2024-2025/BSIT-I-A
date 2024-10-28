import java.util.Scanner;

class ARGONCIILO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        (age >= 0 && age <= 11)
        String ageGroup;

        if (age >= 0 && age <= 11) {
            ageGroup = "Child";
        }else if (age >= 12 && age <= 18) {
             ageGroup = "Teen";   
        }else if (age >= 18   && age <= 64) {
            ageGroup = "Adult"; 
        }else {(age >= 0 && age <= 11)
            ageGroup = "Invalid Age";

        }
        System.out.println("Age Group: " + ageGroup);
    }
}