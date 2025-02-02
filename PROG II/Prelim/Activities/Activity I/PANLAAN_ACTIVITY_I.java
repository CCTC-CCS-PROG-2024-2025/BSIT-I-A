import java.util.Scanner;

class PANLAAN_ACTIVITY_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] names = new String[5]; //Stores Arays Of Stolen Identities.

        System.out.println("Kindly Input 5 Names."); //Ask The User To Input 5 Stolen Identities Of Their Choice.
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
        System.out.print("Input The Stolen Identity's Number In The Order Of Your Input: "); //Ask The User To Input One Of The Stolen Identity's Number In Te order of Input.
        int choose = sc.nextInt();
        int choose1 = choose - 1;
        System.out.println();
        System.out.println("Name: " + (names[choose1])); //This Will Output The Stolen Identity Of User's Input.
        sc.close();
    }
}