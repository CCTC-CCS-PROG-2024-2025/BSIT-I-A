import java.util.Scanner;

class CORTEZ_FINAL_PROJECT {

    public static String studentName;
    public static int[] LAW1;
    public static int[] ARTS1;
    public static int[] THEO1;

    
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Welcome to Student Grade Management System!");
        

        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();
        

        LAW1 = new int[3];
        ARTS1 = new int[3];
        THEO1= new int[3];
        
    
        inputGrades(scanner, "LAW1", LAW1);
        inputGrades(scanner, "ARTS", ARTS1);
        inputGrades(scanner, "THEO1", THEO1);
        
     
        displayStudentInfo();
        
     
        calculateAverageGrades();
        
  
        scanner.close();
    }
    
    public static void inputGrades(Scanner scanner, String subject, int[] grades) {
        System.out.println("\nEntering " + subject + " grades:");
        
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter GRADE " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
         
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Invalid grade! Grade must be between 0 and 100.");
                System.out.print("Enter GRADE " + (i + 1) + " again: ");
                grades[i] = scanner.nextInt();
            }
        }
    }
    
    public static void displayStudentInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + studentName);

        displaySubjectGrades("LAW1",  LAW1);
        displaySubjectGrades("ARTS1", ARTS1);
        displaySubjectGrades("THEO1", THEO1);
    }

    public static void displaySubjectGrades(String subject, int[] grades) {
        System.out.print(subject + " Grades: ");
  
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }
    
    public static void calculateAverageGrades() {
        System.out.println("\n--- Grade Averages ---");
         
        System.out.println("LAW1 Average: " + calculateAverage(LAW1));
        System.out.println("ARTS1 Average: " + calculateAverage(ARTS1));
        System.out.println("THEO1 Average: " + calculateAverage(THEO1));
    }
 
    public static double calculateAverage(int[] grades) {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
      
        return (double) sum / grades.length;
    }
}