import java.util.Scanner;

class CORTEZ_ACTIVIY_II{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        // lets goooo //
        
        if(age <= 11){
            System.out.println("Child");
        }
        else if(age <=17){
            System.out.println("Teen");
        }
        else if(age <=64){
            System.out.println("Adult");
        }
    }   
}
 