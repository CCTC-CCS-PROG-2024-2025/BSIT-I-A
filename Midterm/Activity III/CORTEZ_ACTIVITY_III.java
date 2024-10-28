import java.util.Scanner;
class CORTEZ_ACTIVIY_III {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the next number 1");
      int num = sc.nextInt();
      while(num <= 0){
        System.out.println(num);
        num=num-1;
      }

    }
}   