import java.util.Scanner;

class DIZON_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();
    
        String ageGroup;
    
        if (age >= 0 && age <= 11) {
            ageGroup = "Child";
        } else if (age >= 12 && age <= 17) {
            ageGroup = "Teen";
        } else if (age >= 18 && age <= 64) {
            ageGroup = "Adult";
        } else {
            ageGroup = "Invalid Age";
    
        }
        System.out.println("Age Group: " + ageGroup);

    }
}

   