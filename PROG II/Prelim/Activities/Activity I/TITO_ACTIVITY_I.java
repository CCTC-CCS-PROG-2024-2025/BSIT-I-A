import java.util.Scanner;

class TITO_ACTIVITY_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] names = new String[5]; //stores array

        System.out.println();
        System.out.println("Kindly input the names."); //ask the user to input the names
        System.out.print("1. ");
        names[0] = sc.nextLine();
        System.out.print("2. ");
        names[1] = sc.nextLine();
        System.out.print("3. ");
        names[2] = sc.nextLine();
        System.out.print("4. ");
        names[3] = sc.nextLine();
        System.out.print("5. ");
        names[4] = sc.nextLine();

        System.out.println();
        System.out.print("Input the name's number that you wish to display: "); //ask the user to input one of the name's number
        int choose = sc.nextInt();
        int choose1 = choose - 1;
        System.out.println();
        System.out.println("Name: " + (names[choose1])); //this will output the user's input
        sc.close();
    }
}