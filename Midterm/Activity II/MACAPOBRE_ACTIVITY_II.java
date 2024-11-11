import java.util.Scanner;

class MACAPOBRE_ACTIVITY_PROG_II {
    public static void main(String [] args){
          Scanner cs = new Scanner (System.in );
          
          System.out.println("What is your age?");
          int age = cs.nextInt();
    


          if ( age >= 0 && age <=11){
            System.out.println("child");
          }
          else if (age >= 12 && age <= 17){
            System.out.println("teen");

          }
          else if (age >= 18 && age <= 64){
            System.out.println("adult");
          }
          cs.close();
}
}