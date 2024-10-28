import java.util.Scanner;

class VILLA_A_ACTIVITY_III {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.println("Input timer: ");
        int x = sc.nextInt();

        int y = x;

        do{
            System.out.println(y);
            y--;
        }   while(y >= 1);

           sc.close();
        }
    }
    

