import java.util.Scanner;
public class TITO_FINAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //The following lines shall guide you accordingly.

        System.out.println("Loading...");
        int xx = 1;
        do {
            System.out.println(xx);
            xx++;
        } while (xx <= 10);                                                                                         

        System.out.println("");
        System.out.println("Greetings!");
        System.out.println("Welcome to Novel Notes.");
        System.out.println("Here, you can read Novels and Comics in general!");
        System.out.println("You can also write Notes with our Notes feature!");
        System.out.println("To continue, you are required to Sign in, Sign up if you don't have an account yet, or be Guest with a unique nickname!");
        System.out.println("");
        System.out.println("Type 1 for Sign in!");
        System.out.println("Type 2 for Sing up!");
        System.out.println("Type 3 for Guest!");
        System.out.println("");
        System.out.print("Type your choice here: ");
        String pick = sc.nextLine();
        System.out.println("");

        /*From here on out,
        you will log in and enjoy the features!*/

        switch (pick) {
            case "1":
            System.out.print("Enter your Email/Username: ");
            String User = sc.nextLine();
            System.out.print("Enter your Password: ");
            String Pass = sc.nextLine();
            System.out.println("");
            System.out.println("Welcome back, "+User+"!");
            System.out.println("");
            break;
            case "2":
            System.out.print("Enter an Email Account: ");
            String Email = sc.nextLine();
            System.out.print("Create a Username: ");
            String user = sc.nextLine();
            int a = 1;
            for (int x = 1; x <= 1000; x++) {
                System.out.print("Enter your Age: ");
                int Age1 = sc.nextInt();
                if (Age1 < 18 || Age1 < 1) {
                    System.out.println("Age: "+Age1);
                    System.out.println("Too young.");
                    System.out.println("Enter a Valid Age.");
                } else {
                    break;
                }
            }
            System.out.print("Create a Password: ");
            String n = sc.nextLine();
            String pass = sc.nextLine();
            System.out.print("Re-type your Password: ");
            String Repass = sc.nextLine();
            System.out.println("");
            System.out.println("Welcome to Novel Notes, "+user+"!");
            System.out.println("");
            System.out.println("Here, you can read Novels, Mangas, Manhwas, Manhuas, or Comics in general!");
            System.out.println("You can also write Notes with our Notes feature!");
            System.out.println("If you want to read our latest chapter releases without having to wait, you can purchase our Premium Subscription for as low as 499.00 PHP!");
            System.out.println("Have fun, reader!");
            System.out.println("");
            break;
            case "3":
            System.out.print("Create a Unique Nickname: ");
            String Nickname = sc.nextLine();
            System.out.println("");
            System.out.println("Welcome to Novel Notes, "+Nickname+"!");
            System.out.println("");
            System.out.println("Here, you can read Novels, Mangas, Manhwas, Manhuas, or Comics in general!");
            System.out.println("You can also write Notes with our Notes feature, however, you will have to log in with an account in order to save it in case you accidentally log out.");
            System.out.println("If you want to read our latest chapter releases without having to wait, you will also need to log in with an account and purchase our Premium Subscription for as low as 499.00 PHP.");
            System.out.println("Have fun, reader!");
            System.out.println("");
            break;
        }
        int sum = 0;
        for (int x = 1; x <= 1; x++) {
            System.out.println("Do you wish to buy our Premium Subscription? The benefits includes various features and mainly focused on being able to access early release products and chapters!");
            System.out.println("If so, we introduce you to our Bank feature which lets you purchase our Premium Subscription and other products in the future!");
            System.out.println("Our Bank feature requires a minimum of 1000.00 PHP and a maximum of 10000.00 PHP");
            System.out.println("");
            System.out.println("Just type '1' if Yes and '2' if No.");
            System.out.println("");
            System.out.print("Type it here: ");
            int choice = sc.nextInt();
            System.out.println("");
            if (choice == 2) {
                break;
            }
            if (choice == 1) {
                System.out.println("Enter the amount you wish to deposit in our Bank!");
                System.out.println("");
                System.out.print("Type it here: ");
                int PHP = sc.nextInt();
                System.out.println("");
                if (PHP >= 1000 && PHP <= 10000) {
                    System.out.println("You have successfully deposited an amount of "+PHP+" PHP in our Bank!");
                    System.out.println("");
                } else {
                    PHP -= PHP;
                    System.out.println("Error, you didn't meet the requirements.");
                }
                sum += PHP;
                System.out.println(sum);
            }
        }
        for (int x = 1; x <= 1; x++) {
        System.out.println("If you want to buy our Premium Subscription to have access to its priviledges, type '1', and if you don't want to, type '2' to proceed.");
        System.out.println("");
        System.out.println("The Premium Subscription costs 499.00 PHP.");
        System.out.print("Type it here: ");
        int option = sc.nextInt();
        System.out.println("");
        if (option == 1) {
            System.out.println(sum+" "+"- 499 =");
            System.out.println(sum - 499);
            if (sum < 499) {
                System.out.println("Error, not enough balance.");
                for (int c = 1; x <= 1; x++) {
                System.out.println("Do you wish to deposit money to our Bank feature? Type '1' if Yes, type '2' if No.");
                System.out.println("");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter the amount you wish to deposit in our Bank!");
                    System.out.println("");
                    System.out.print("Type it here: ");
                    int PHP = sc.nextInt();
                    System.out.println("");
                    if (PHP >= 1000 && PHP <= 10000) {
                        System.out.println("You have successfully deposited an amount of "+PHP+" PHP in our Bank!");
                        System.out.println("");
                    } else {
                        PHP -= PHP;
                        System.out.println("Error, you didn't meet the requirements.");
                    }
                    sum += PHP;
                    System.out.println(sum);
                    if (choice == 2) {
                        break;
                    }
                }
            }
            }
        } else if (option == 2) {
            break;
        }
        }
        System.out.println("Thank you for your purchase!");
        System.out.println("Here are our latest updates. Also, you now have access for latest chapter releases, so stay tuned!");
        System.out.println("Choose the type you want to read and type its number.");
        System.out.println("");
        System.out.println("1 'latestreleasenovel1'");
        System.out.println("");
        System.out.print("Type it here: ");
        int chooose = sc.nextInt();
        System.out.println("");
        if (chooose == 1) {
            System.out.println("The sound of the raindrops...");
            System.out.println("");
        }
        System.out.println("...");
        System.out.println("");
        System.out.println("Below are the free ones, have fun reading!");
        System.out.println("Choose the type you want to read, Notes feature included if you wish to take some notes, and type its number.");
        System.out.println("");
        System.out.println("1. 'Novel'");
        System.out.println("2. 'Manga'");
        System.out.println("3. 'Manhwa'");
        System.out.println("4. 'Manhua'");
        System.out.println("5. 'Notes'");
        System.out.println("");
        System.out.print("Type it here: ");
        int choose = sc.nextInt();
        System.out.println("");
        if (choose == 1) {
            System.out.println("1. 'novel1'");
            System.out.println("2. 'novel2'");
            System.out.println("3. 'novel3'");
            System.out.println("");
            System.out.print("Type it here: ");
            String n = sc.nextLine();
            int novel = sc.nextInt();
            System.out.println("");
            if (novel == 1) {
                System.out.println("Once upon a time...");
            } else if (novel == 2) {
                System.out.println("Day and night...");
            } else if (novel == 3) {
                System.out.println("The man who...");
            }
        } else if (choose == 2) {
            System.out.println("1. 'manga1'");
            System.out.println("2. 'manga2'");
            System.out.println("3. 'manga3'");
            System.out.println("");
            System.out.print("Type it here: ");
            String nn = sc.nextLine();
            int manga = sc.nextInt();
            System.out.println("");
            if (manga == 1) {
                System.out.println("The gaze of the abyss...");
            } else if (manga == 2) {
                System.out.println("Under The starry night...");
            } else if (manga == 3) {
                System.out.println("Beneath the moonlight...");
            }
        } else if (choose == 3) {
            System.out.println("1. 'manhwa1'");
            System.out.println("2. 'manhwa2'");
            System.out.println("3. 'manhwa3'");
            System.out.println("");
            System.out.print("Type it here: ");
            String nnn = sc.nextLine();
            int manhwa = sc.nextInt();
            System.out.println("");
            if (manhwa == 1) {
                System.out.println("The world changed after...");
            } else if (manhwa == 2) {
                System.out.println("It all started when...");
            } else if (manhwa == 3) {
                System.out.println("A line ends when...");
            }
        } else if (choose == 4) {
            System.out.println("1. 'manhua1'");
            System.out.println("2. 'manhua2'");
            System.out.println("3. 'manhua3'");
            System.out.println("");
            System.out.print("Type it here: ");
            String nnnn = sc.nextLine();
            int manhua = sc.nextInt();
            System.out.println("");
            if (manhua == 1) {
                System.out.println("The Jianghu is a place...");
            } else if (manhua == 2) {
                System.out.println("The war on the Central Plains...");
            } else if (manhua == 3) {
                System.out.println("Cultivating to immortality...");
            }
        } else if (choose == 5) {
            System.out.println("Write your Notes here down below!");
            System.out.println("");
            System.out.print("Type it here: ");
            String nnnnn = sc.nextLine();
            String notes = sc.nextLine();
            System.out.println("");
        }
    }
}