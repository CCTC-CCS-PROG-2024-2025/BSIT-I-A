import java.util.Scanner;

class LAO_ACTIVITY_II{
     
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        System.out.println("enter the age");
        int age = cs.nextInt();

        if (age <=11) {
            System.out.println("child");

        }
        else if (age <=17) {
            System.out.println("teen");

        }    
        else if (age <=64) {
            System.out.println("adult");

        }
        cs.close();
    }
}a


