import java.ulit.scanner;
 class BUTON_ACTIVITY_III {
    public static void main (String[] args) {
    Scanner sc = new scanner(System.In);
    System.out.println();
    System.out.print("Enter Timer:");
    int timer = scanner.nextInt();

    while (timer >= 0 ) {
        System.out.println(timer);
        timer --;
    }
    scanner.close();
}
 }
