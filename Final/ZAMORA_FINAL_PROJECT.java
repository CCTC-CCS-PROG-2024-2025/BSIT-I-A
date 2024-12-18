import java.util.Scanner;

class ZAMORA_FINAL_PROJECT {

    public static String studentName;
    public static int[] COMP1;
    public static int[] PROG1;
    public static int[] HCI1;

    
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Welcome to Student Grade Management System!");
        

        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();
        

        HCI1 = new int[3];
        PROG1 = new int[3];
        COMP1= new int[3];
        
    
        inputGrades(scanner, "COMP1", COMP1);
        inputGrades(scanner, "HCI1", HCI1);
        inputGrades(scanner, "PROG1", PROG1);
        
     
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

        displaySubjectGrades("HCI1",  HCI1);
        displaySubjectGrades("PROG1", PROG1);
        displaySubjectGrades("COMP1", COMP1);
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
         
        System.out.println("HCI1 Average: " + calculateAverage(HCI1));
        System.out.println("PROG1 Average: " + calculateAverage(PROG1));
        System.out.println("COMP1 Average: " + calculateAverage(COMP1));
    }
 
    public static double calculateAverage(int[] grades) {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
      
        return (double) sum / grades.length;
    }
}