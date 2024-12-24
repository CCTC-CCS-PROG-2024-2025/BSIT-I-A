import java.util.Scanner;

class DIZON_JUMAR_FINAL {
    public static void main(String[] args) {
        // a scanner object for user inputs
        Scanner scanner = new Scanner(System.in);
            while (true) {

            System.out.println("Shape Menu:");

            System.out.println("Circle");
               
            System.out.println("Rectangle");
              
            System.out.println("Triangle");
            
            System.out.println("Square");
                

    System.out.println("CHOOSE A SHAPE (1-4): ");

        System.out.println("PRESS 0 TO EXIT");

            int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                
                calculateCircle(scanner);
                break;
                case 2:
                calculateRectangle(scanner);
                break;
                case 3:
                calculateTriangle(scanner);
                break;
                case 4:
                calculateSquare(scanner);
                break;
                case 0:
                
                System.out.println("GOODBYE!!");
                break;
                default:

                System.out.println("INVALID CHOICE... PLEASE TRY AGAIN.");


            }
        }
    }

    static void calculateCircle(Scanner scanner) {
        System.out.print("ENTER CIRCLE RADIUS:");
        double RADIUS = scanner.nextDouble();
            double area = Math.PI * Math.pow(RADIUS, 2);
            double circumference = 2 * Math.PI * RADIUS;
                System.out.println("Area: " + area);
                  System.out.println("Circumference: " + circumference);
    }
    static void calculateRectangle(Scanner scanner) {
System.out.print("ENTER LENGTH: ");
double LENGTH = scanner.nextDouble();
System.out.print("ENTER WIDTH: ");
double WIDTH = scanner.nextDouble();
double area = LENGTH * WIDTH;
        double perimeter = 2 * (LENGTH + WIDTH);
            System.out.println("Area: " + area);
            System.out.println("Perimater: " + perimeter);
    }

    static void calculateTriangle(Scanner scanner) {
System.out.print("ENTER BASE: ");
double BASE = scanner.nextDouble();
    System.out.print("ENTER HEIGHT: ");
        double HEIGHT = scanner.nextDouble();
            double area = 0.5 * BASE * HEIGHT; 
                System.out.println("Area: " + area);
            

    }
    static void calculateSquare(Scanner scanner) {
        System.out.print("ENTER SIDE: ");
        double SIDE = scanner.nextDouble();
        Double area = Math.pow(SIDE, 2);
            double perimeter = 4 * SIDE;
                    System.out.println("Area: " + area);
                    System.out.println("Perimater: " + perimeter);
        }
}