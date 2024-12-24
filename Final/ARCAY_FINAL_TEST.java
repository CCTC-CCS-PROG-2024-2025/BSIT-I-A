import java.util.Scanner;

public class ARCAY_FINAL_TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Here is where you can choose between Sign up or Register

        System.out.println("Hello there! Dear Customers");
        System.out.println("Welcome to the OCCC Online Shopping or Over Care Computer Components!");
        System.out.println("Before you proceed, Create an account or Sign in your account.");
        System.out.println("Sign in or Register");
            String pick = sc.nextLine();
                switch(pick){
                    case "Register":
                            System.out.print("Enter your gmail/facebook account: ");
                            String acc = sc.nextLine();
                            System.out.print("Enter your age: ");
                            int a = 1;
                            int age = sc.nextInt();
                            for (int x = 1; x<=1000; x++){
                                System.out.print("Enter your age: ");
                                int age1 = sc.nextInt();
                                if (age1 < 18 ){
                                    System.out.println("Age: " + age1);
                                    System.out.println("Too young. ");
                                    System.out.println("Enter a valid age.");
                                } else {
                                    break;
                                }
                            }   
                            System.out.print("Enter your username: ");
                            String fix = sc.nextLine();
                            String us = sc.nextLine();
                            System.out.print("Enter your password: ");
                            String pass1 = sc.nextLine();
                            System.out.print("Re-enter your password: ");
                            String pass2 = sc.nextLine();
                            System.out.println("Welcome, " + us);
                            break;
                    case "register":
                            System.out.print("Enter your gmail/facebook account: ");
                            String Acc = sc.nextLine();
                            for (int x = 1; x<=1000; x++){
                                System.out.print("Enter your age: ");
                                int age3 = sc.nextInt();
                                if (age3 < 18 ){
                                    System.out.println("Age: " + age3);
                                    System.out.println("Too young. ");
                                    System.out.println("Enter a valid age.");
                                }else {
                                    break;
                                }
                                int age2 = sc.nextInt();
                                    if (age2 >= 0 && age2 < 18){
                                        System.out.println("Age: " + age2);
                                        System.out.println("Too young. ");
                                        System.out.println("Enter a valid age.");
                                    } if (age2 >= 18) {
                                        break;
                                    }
                            }
                            System.out.print("Enter your username: ");
                            String fix1 = sc.nextLine();
                            String Us = sc.nextLine();
                            System.out.print("Enter your password: ");
                            String Pass1 = sc.nextLine();
                            System.out.print("Re-enter your password: ");
                            String Pass2 = sc.nextLine();
                            System.out.println("Welcome, " + Us);
                            break;
                    case "Sign in":
                            System.out.print("Enter your username: ");
                            String user = sc.nextLine();
                            System.out.print("Enter your password: ");
                            String pass = sc.nextLine();
                            System.out.println("Welcome back, " + user);
                            break;
                    case "sign in":
                            System.out.print("Enter your username: ");
                            String User = sc.nextLine();
                            System.out.print("Enter your password: ");
                            String Pass = sc.nextLine();
                            System.out.println("Welcome back, " + User);
                            break;
         }
         /*In this code.
          
          you can decide whether you want to deposit a money or proceed to choose an item.

          this code will let you deposit 3 times if you want, then if all that chances are used, the code will proceed 
          on the items listed.
          */
         int sum = 0;
        for (int x = 1; x<=3; x++){
        System.out.println("Do you want to Deposit a money to this account or not? ");
        System.out.println("If yes type '1', and if no type '0'. ");
        int deposit = sc.nextInt();
        if (deposit == 0){
            break;
        }
        if (deposit == 1){
            System.out.println("Enter the amount you want to deposit: ");
            System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
            System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
            int money = sc.nextInt();
            if (money >= 5000 && money <= 1000000){
                System.out.println("Thank you, " );
                System.out.println("You have Deposited an amount of: " + money);
            } else {
                money -= money;
                System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
            }
            sum += money;
            System.out.println(sum);
        } 
    }
    // Here is the different prices of different parts of a computer hardware.
    int amd1 = 2950;
        int amd2 = 2950;
        int amd3 = 7250;
        int amd4 = 5000;
        int amd5 = 7000;
        int amd6 = 6000;
        int amd7 = 3499;
        int amd8 = 7120;
        int amd9 = 7490;
        int amd10 = 8845;
        int amd11 = 12075;
        int amd12 = 12075;
        int amd13 = 26995;
        int amd14 = 18195;
        int amd15 = 24500;
        int amd16 = 26000;
        int amd17 = 26000;
        int amd18 = 37496;
        int amd19 = 36500;
        int amd20 = 32665;

        int intel1 = 4820;
        int intel2 = 6670;
        int intel3 = 7520;
        int intel4 = 20999;
        int intel5 = 8974;
        int intel6 = 20999;
        int intel7 = 24950;
        int intel8 = 26999;
        int intel9 = 25940;
        int intel10 = 33750;
        int intel11 = 37999;
        int intel12 = 31850;

        int mboard1 = 71992;
        int mboard2 = 22295;
        int mboard3 = 15850;
        int mboard4 = 32249;

        int gbRAM1 = 816;
        int gbRAM2 = 1125;

        int GBram1 = 1632;
        int GBram2 = 2250;
        int GBram3 = 2345;

        int hdd5001 = 2620;
        int hdd5002 = 1750;
        int hdd5003 = 467;

        int hdd1tb1 = 2813;
        int hdd1tb2 = 3119;
        int hdd1tb3 = 2179;

        int hdd2tb1 = 3686;
        int hdd2tb2 = 3695;
        int hdd2tb3 = 3095;

        int ssd5001 = 2085;
        int ssd5002 = 5750;
        int ssd5003 = 4918;

        int ssd1tb1 = 7195;
        int ssd1tb2 = 7900;
        int ssd1tb3 = 9299;

        int ssd2tb1 = 16425;
        int ssd2tb2 = 11550;
        int ssd2tb3 = 17856;

        int amdgpu1 = 58602;
        int amdgpu2 = 55950;
        int amdgpu3 = 34095;
        int amdgpu4 = 26397;
        int amdgpu5 = 17995;
        int amdgpu6 = 41825;
        int amdgpu7 = 38070;
        int amdgpu8 = 32204;
        int amdgpu9 = 28098;
        int amdgpu10 = 22232;

        int intelgpu1 = 92205;
        int intelgpu2 = 63200;
        int intelgpu3 = 63200;
        int intelgpu4 = 55995;
        int intelgpu5 = 40550;
        int intelgpu6 = 33150;
        int intelgpu7 = 20515;
        int intelgpu8 = 22950;
        int intelgpu9 = 18695;
        int intelgpu10 = 13100;

        int psu1 = 31618;
        int psu2 = 22194;
        int psu3 = 19921;
        int psu4 = 10124;
        int psu5 = 3420;

        int aircooling1 = 7035;
        int aircooling2 = 2699;
        int aircooling3 = 4395;
        int aircooling4 = 6219;
        int aircooling5 = 5865;

        int watercooling1 = 14995;
        int watercooling2 = 8800;
        int watercooling3 = 4995;
        int watercooling4 = 4340;

        int lcdmonitor1 = 33699;
        int lcdmonitor2 = 55727;
        int lcdmonitor3 = 26500;
        int lcdmonitor4 = 39302;
        int lcdmonitor5 = 17008;

        int oledmonitor1 = 68800;
        int oledmonitor2 = 52995;
        int oledmonitor3 = 76200;
        int oledmonitor4 = 37835;
        int oledmonitor5 = 61474;

        //this code will ask you to choose what components you were looking for.
        System.out.println(" ");
        System.out.println("So what Computer hardware components are you looking for?");
        System.out.println("1.'CPU'");
        System.out.println("2.'Motherboard'");
        System.out.println("3.'RAM'");
        System.out.println("4.'Storage Disk'");
        System.out.println("5.'GPU'");
        System.out.println("6.'PSU'");
        System.out.println("7.'Cooling'");
        System.out.println("8.'Monitor'");
        System.out.println(" ");
        int p = sc.nextInt();
        
        switch (p){
            case 1:
            System.out.println(" ");
            System.out.println("AMD or Intel");
            System.out.println("1. 'AMD'");
            System.out.println("2. 'Intel'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int cpu = sc.nextInt();
            switch (cpu){
            case 1:
            System.out.println(" ");
            System.out.println("1.AMD Ryzen 3 1200 12nm: 'Php 2,950.00'");
            System.out.println("2.AMD Ryzen 3 1200 14nm: 'Php 2.950.00'");
            System.out.println("3.AMD Ryzen 3 1300X: 'Php 7,250.00'");
            System.out.println("4.AMD Ryzen 3 2200G: 'Php 5,000.00'");
            System.out.println("5.AMD Ryzen 3 3300X: 'Php 7,000.00'");
            System.out.println("6.AMD Ryzen 3 4100: 'Php 6,000.00'");
            System.out.println("7.AMD Ryzen 5 1400: 'Php 3,499.00'");
            System.out.println("8.AMD Ryzen 5 5600: 'Php 7,120.00'");
            System.out.println("9.AMD Ryzen 5 5600G: 'Php 7,490.00'");
            System.out.println("10.AMD Ryzen 5 5600GT: 'Php 8,845.00'");
            System.out.println("11.AMD Ryzen 5 7600: 'Php 12,075.00'");
            System.out.println("12.AMD Ryzen 5 7600X: 'Php 12,075.00'");
            System.out.println("13.AMD Ryzen 7 7800X3D: 'Php 26,995.00'");
            System.out.println("14.AMD Ryzen 7 8700F: 'Php 18,195.00'");
            System.out.println("15.AMD Ryzen 7 9700X: 'Php 24,500.00'");
            System.out.println("16.AMD Ryzen 7 PRO 7745: 'Php 26,000.00'");
            System.out.println("17.AMD Ryzen 9 7900X: 'Php 26,000.00'");
            System.out.println("18.AMD Ryzen 9 7900X3D: 'Php 37,496.00'");
            System.out.println("19.AMD Ryzen 9 7950X: 'Php 36,500.00'");
            System.out.println("20.AMD Ryzen 9 9900X:'Php 32,665.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int AMD = sc.nextInt();
                switch (AMD) {
                    case 1:
                    System.out.println("AMD Ryzen 3 1200 12nm: 'Php 2,950.00'");
                    if (amd1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd1 +"=");
                        sum -= amd1;
                        System.out.println("Remaining balance: " + sum);
                    }
                    break;
                    case 2:
                    System.out.println("AMD Ryzen 3 1200 14nm: 'Php 2.950.00'");
                    if (amd2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "-" + amd2 + "=");
                        sum -= amd2;
                    }
                    break;
                    case 3:
                    System.out.println("AMD Ryzen 3 1300X: 'Php 7,250.00'");
                    if (amd3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "-" + amd3 + "=");
                        sum -= amd3;
                    }
                    break;
                    case 4:
                    System.out.println("AMD Ryzen 3 2200G: 'Php 5,000.00' ");
                    if (amd4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " +amd4 +"=");
                        sum -= amd4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("AMD Ryzen 3 3300X: 'Php 7,000.00'");
                    if (amd5 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- "+ amd5 +"=");
                        sum -= amd5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 6:
                    System.out.println("AMD Ryzen 3 4100: 'Php 6,000.00'");
                    if (amd6 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd6 +"=");
                        sum -= amd6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 7:
                    System.out.println("AMD Ryzen 5 1400: 'Php 3,499.00'");
                    if (amd7 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd7 +"=");
                        sum -= amd7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 8:
                    System.out.println("AMD Ryzen 5 5600: 'Php 7,120.00'");
                    if (amd8 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd8 +"=");
                        sum -= amd8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 9:
                    System.out.println("AMD Ryzen 5 5600G: 'Php 7,490.00'");
                    if (amd9 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd9 +"=");
                        sum -= amd9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 10:
                    System.out.println("AMD Ryzen 5 5600GT: 'Php 8,845.00'");
                    if (amd10 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd10 +"=");
                        sum -= amd10;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 11:
                    System.out.println("AMD Ryzen 5 7600: 'Php 12,075.00'");
                    if (amd11 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd11 +"=");
                        sum -= amd11;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 12:
                    System.out.println("AMD Ryzen 5 7600X: 'Php 14,350.00");
                    if (amd12 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd12 +"=");
                        sum -= amd12;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 13:
                    System.out.println("AMD Ryzen 7 7800X3D: 'Php 26,995.00'");
                    if (amd13 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd13 +"=");
                        sum -= amd13;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 14:
                    System.out.println("AMD Ryzen 7 8700F: 'Php 18,195.00'");
                    if (amd14 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd14 +"=");
                        sum -= amd14;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 15:
                    System.out.println("AMD Ryzen 7 9700X: 'Php 24,500.00'");
                    if (amd15 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd15 +"=");
                        sum -= amd15;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 16:
                    System.out.println("AMD Ryzen 7 PRO 7745: 'Php 26,000.00'");
                    if (amd16 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd16 +"=");
                        sum -= amd16;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 17:
                    System.out.println("AMD Ryzen 9 7900X: 'Php 26,000.00'");
                    if (amd17 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd17 +"=");
                        sum -= amd17;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 18:
                    System.out.println("AMD Ryzen 9 7900X3D: 'Php 37,496.00'");
                    if (amd18 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd18 +"=");
                        sum -= amd18;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 19:
                    System.out.println("AMD Ryzen 9 7950X: 'Php 36,500.00'");
                    if (amd19 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd19 +"=");
                        sum -= amd19;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 20:
                    System.out.println("AMD Ryzen 9 9900X:'Php 32,665.00'");
                    if (amd20 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd20 +"=");
                        sum -= amd20;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;        
                }    
            break;
            case 2:
            System.out.println(" ");
            System.out.println("1.Intel Core i3-12100F: 'Php 4,820.00'");
            System.out.println("2.Intel Core i3-13100F: 'Php 6,670.00'");
            System.out.println("3.Intel Core i3-14100F: 'Php 7,520.00'");
            System.out.println("4.Intel Core i5-13600K: 'Php 20,999.00'");
            System.out.println("5.Intel Core i5-13400F: 'Php 8,974.00'");
            System.out.println("6.Intel Core i5-12600K: 'Php 20,999.00'");
            System.out.println("7.Intel Core i7-14700K: 'Php 24,950.00'");
            System.out.println("8.Intel Core i7-13700K: 'Php 26,999.00'");
            System.out.println("9.Intel Core i7-12700K: 'Php 25,940.00'");
            System.out.println("10.Intel Core i9-14900K: 'Php 33,750.00'");
            System.out.println("11.Intel Core i9-13900K: 'Php 37,999.00'");
            System.out.println("12.Intel Core i9-13900KF: 'Php 31,850.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int INTEL = sc.nextInt();
            switch (INTEL){
                case 1:
                    System.out.println("Intel Core i3-12100F: 'Php 4,820.00'");
                    if (intel1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel1 +"=");
                        sum -= intel1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                case 2:
                System.out.println("2.Intel Core i3-13100F: 'Php 6,670.00'");
                    if (intel2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel2 +"=");
                        sum -= intel2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 3:
                System.out.println("3.Intel Core i3-14100F: 'Php 7,520.00'");
                    if (intel3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel3 +"=");
                        sum -= intel3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 4:
                System.out.println("4.Intel Core i5-13600K: 'Php 20,999.00'");
                    if (intel4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel4 +"=");
                        sum -= intel4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 5:
                System.out.println("5.Intel Core i5-13400F: 'Php 8,974.00'");
                    if (intel5 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel5 +"=");
                        sum -= intel5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 6:
                System.out.println("Intel Core i5-12600K: 'Php 20,999.00'");
                    if (intel6 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel6 +"=");
                        sum -= intel6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 7:
                System.out.println("Intel Core i7-14700K: 'Php 24,950.00'");
                    if (intel7 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel7 +"=");
                        sum -= intel7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 8:
                System.out.println("Intel Core i7-13700K: 'Php 26,999.00'");
                    if (intel8 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel8 +"=");
                        sum -= intel8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 9:
                System.out.println("Intel Core i7-12700K: 'Php 25,940.00'");
                    if (intel9 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel9 +"=");
                        sum -= intel9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 10:
                System.out.println("Intel Core i7-12700K: 'Php 25,940.00'");
                    if (intel10 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel10 +"=");
                        sum -= intel10;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 11:
                System.out.println("Intel Core i9-13900K: 'Php 37,999.00'");
                    if (intel11 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel11 +"=");
                        sum -= intel11;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 12:
                System.out.println("Intel Core i9-13900KF: 'Php 31,850.00'");
                    if (intel12 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel12 +"=");
                        sum -= intel12;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 

            }
            break;
            default:
            System.out.println("You've entered an invalid option. ");
            }
            break;
            case 2:
            System.out.println(" ");
            System.out.println("1. ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
            System.out.println("2. ASUS ROG Strix Z790-A Gaming WiFi: 'Php 22,295.00'");
            System.out.println("3. ASUS ROG Strix B650-A Gaming WiFi: 'Php 15,850.00'");
            System.out.println("4. ASUS ROG Strix Z790-I Gaming WiFi: 'Php 32,249.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int mboard = sc.nextInt();
            switch (mboard){
                case 1:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard1 +"=");
                        sum -= mboard1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard2 +"=");
                        sum -= mboard2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard3 +"=");
                        sum -= mboard3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard4 +"=");
                        sum -= mboard4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    default:
                    System.out.println("You've entered an invalid option. ");
            }
            break;
            case 3:
            System.out.println(" ");
            System.out.println("RAM Capacity");
            System.out.println("1. '8gb RAM'");
            System.out.println("2.'16gb RAM'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int ramtype = sc.nextInt();
            switch (ramtype){
                case 1:
                System.out.println(" ");
                System.out.println("1. Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                System.out.println("2. G.Skill Ripjaws V DDR4 3600MHz CL18: 'Php 1,125.00'");
                System.out.println(" ");
                int ram8 = sc.nextInt();
                switch (ram8){
                    case 1:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (gbRAM1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + gbRAM1 +"=");
                        sum -= gbRAM1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (gbRAM2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + gbRAM2 +"=");
                        sum -= gbRAM2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                case 2:
                System.out.println(" ");
                System.out.println("1. Corsair Vengeance RGB Pro DDR4 3600MHz CL18: 'Php 1,632.00'");
                System.out.println("2. G.Skill Trident Z Neo DDR4 3600MHz CL16: 'Php 2,250.00'");
                System.out.println("3. Kingston Fury Beast DDR4 3600MHz CL16: 'Php 2,345.00'");
                System.out.println(" ");
                int ram16 = sc.nextInt();
                switch (ram16){
                    case 1:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (GBram1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + GBram1 +"=");
                        sum -= GBram1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (GBram2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + GBram2 +"=");
                        sum -= GBram2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (GBram3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + GBram3 +"=");
                        sum -= GBram3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
            }
            break;
            case 4:
            System.out.println(" ");
            System.out.println("Storage type Capacity");
            System.out.println("1. 'HDD'");
            System.out.println("2.'SSD'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int disk = sc.nextInt();
            switch (disk){
                case 1:
                System.out.println(" ");
                System.out.println("1. '500gb' ");
                System.out.println("2. '1tb' ");
                System.out.println("3. '2tb' ");
                System.out.println(" ");
                int hdd = sc.nextInt();
                switch(hdd){
                    case 1:
                    System.out.println(" ");
                    System.out.println("1. Seagate Barracuda: 'Php 2,620.00'");
                    System.out.println("2. Western Digital Blue: 'Php 1,750.00'");
                    System.out.println("3. Toshiba P300: 'Php 467.00' ");
                    System.out.println(" ");
                    int hdd500 = sc.nextInt();
                    switch(hdd500){
                        case 1:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd5001 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd5001 +"=");
                        sum -= hdd5001;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Western Digital Blue: 'Php 1,750.00'");
                    if (hdd5002 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd5002 +"=");
                        sum -= hdd5002;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Toshiba P300: 'Php 467.00' ");
                    if (hdd5003 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd5003 +"=");
                        sum -= hdd5003;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    }
                    break;
                    case 2:
                    System.out.println(" ");
                    System.out.println("1. Seagate Barracuda: 'Php 2,813.00'");
                    System.out.println("2. Western Digital Blue: 'Php 3,119.00'");
                    System.out.println("3. Toshiba P300: 'Php 2,179.00'");
                    System.out.println(" ");
                    int hdd1tb = sc.nextInt();
                    switch (hdd1tb){
                        case 1:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd1tb1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd1tb1 +"=");
                        sum -= hdd1tb1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd1tb2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd1tb2 +"=");
                        sum -= hdd1tb2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd1tb3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd1tb3 +"=");
                        sum -= hdd1tb3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    }
                    case 3:
                    System.out.println(" ");
                    System.out.println("1. Seagate Barracuda: 'Php 3,686.00'");
                    System.out.println("2. Western Digital Blue: 'Php 3,695.00'");
                    System.out.println("3. Toshiba P300: 'Php 3,095.00' ");
                    System.out.println(" ");
                    int hdd2tb = sc.nextInt();
                    switch(hdd2tb){
                        case 1:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd2tb1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd2tb1 +"=");;
                        sum -= hdd2tb1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd2tb2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd2tb2 +"=");;
                        sum -= hdd2tb2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd2tb3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd2tb3 +"=");;
                        sum -= hdd2tb3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    }
                    break;
                }
                break;
                case 2:
                System.out.println(" ");
                System.out.println("1. '500gb' ");
                System.out.println("2. '1tb' ");
                System.out.println("3. '2tb' ");
                System.out.println(" ");
                int ssd = sc.nextInt();
                switch (ssd){
                    case 1:
                    System.out.println(" ");
                    System.out.println("1. Samsung 990 Pro: 'Php 2,085.00'");
                    System.out.println("2. WD Black SN850X: 'Php 5,750.00'");
                    System.out.println("3. Crucial P5 Plus: 'Php 4,918.00' ");
                    System.out.println(" ");
                    int ssd500 = sc.nextInt();
                    switch (ssd500){
                        case 1:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd5001 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd5001 +"=");;
                            sum -= ssd5001;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 2:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd5002 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd5002 +"=");;
                            sum -= ssd5002;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 3:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd5001 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd5002 +"=");;
                            sum -= ssd5002;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                    }
                    break;
                    case 2:
                    System.out.println(" ");
                    System.out.println("1. Samsung 990 Pro: 'Php 7,195.00'");
                    System.out.println("2. WD Black SN850X: 'Php 7,900.00'");
                    System.out.println("3. Crucial P5 Plus: 'Php 9,299.00' ");
                    System.out.println(" ");
                    int ssd1tb = sc.nextInt();
                    switch (ssd1tb){
                        case 1:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd1tb1 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd1tb1 +"=");
                            sum -= ssd1tb1;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 2:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd1tb2 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd1tb2 +"=");
                            sum -= ssd1tb2;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 3:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd1tb3 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd1tb3 +"=");
                            sum -= ssd1tb3;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                    }
                    break;
                    case 3:
                    System.out.println(" ");
                    System.out.println("1. Samsung 990 Pro: 'Php 16,425.00'");
                    System.out.println("2. WD Black SN850X: 'Php 11,550.00'");
                    System.out.println("3. Crucial P5 Plus: 'Php 17,856.00' ");
                    System.out.println(" ");
                    int ssd2tb = sc.nextInt();
                    switch (ssd2tb){
                        case 1:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd2tb1 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd2tb1 +"=");
                            sum -= ssd2tb1;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 2:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd2tb2 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd2tb2 +"=");
                            sum -= ssd2tb2;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 3:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd2tb3 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd2tb3 +"=");
                            sum -= ssd2tb3;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                    }
                    break;
                    default:
                    System.out.println("You've entered an invalid option. ");
                }
            }
            break;
            case 5:
            System.out.println(" ");
            System.out.println("What model of GPU");
            System.out.println("1. 'AMD' ");
            System.out.println("2.'NVIDEA'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int gpu = sc.nextInt();
            switch (gpu){
                case 1:
                System.out.println(" ");
                System.out.println("1. AMD Radeon RX 7900 XTX: 'Php 58,602.00'");
                System.out.println("2. AMD Radeon RX 7900 XT: 'Php 55,950.00'");
                System.out.println("3. AMD Radeon RX 7800 XT: 'Php 34,095.00'");
                System.out.println("4. AMD Radeon RX 7700 XT: 'Php 26,397.00'");
                System.out.println("5. AMD Radeon RX 7600: 'Php 17,995.00'");
                System.out.println("6. AMD Radeon RX 6950 XT: 'Php 41,825.00'");
                System.out.println("7. AMD Radeon RX 6800 XT: 'Php 38,070.00'");
                System.out.println("8. AMD Radeon RX 6750 XT: 'Php 32,204.00'");
                System.out.println("9. AMD Radeon RX 6700 XT: 'Php 28,098.00'");
                System.out.println("10. AMD Radeon RX 6600 XT: 'Php 22,232.00'");
                System.out.println(" ");
                int amdgpu = sc.nextInt();
                switch(amdgpu){
                    case 1:
                    System.out.println("AMD Radeon RX 7900 XTX: 'Php 58,602.00'");
                    if (amdgpu1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu1 +"=");
                        sum -= amdgpu1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("AMD Radeon RX 7900 XT: 'Php 55,950.00'");
                    if (amdgpu2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu2 +"=");
                        sum -= amdgpu2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("AMD Radeon RX 7800 XT: 'Php 34,095.00'");
                    if (amdgpu3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu3 +"=");
                        sum -= amdgpu3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("AMD Radeon RX 7700 XT: 'Php 26,397.00'");
                    if (amdgpu4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu4 +"=");
                        sum -= amdgpu4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("AMD Radeon RX 7600: 'Php 17,995.00'");
                    if (amdgpu5 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu5 +"=");
                        sum -= amdgpu5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 6:
                    System.out.println("AMD Radeon RX 6950 XT: 'Php 41,825.00'");
                    if (amdgpu6 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu6 +"=");
                        sum -= amdgpu6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 7:
                    System.out.println("AMD Radeon RX 6800 XT: 'Php 38,070.00'");
                    if (amdgpu7 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu7 +"=");
                        sum -= amdgpu7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 8:
                    System.out.println("AMD Radeon RX 6750 XT: 'Php 32,204.00'");
                    if (amdgpu8 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu8 +"=");
                        sum -= amdgpu8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 9:
                    System.out.println("AMD Radeon RX 6700 XT: 'Php 28,098.00'");
                    if (amdgpu9 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu9 +"=");
                        sum -= amdgpu9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 10:
                    System.out.println("AMD Radeon RX 6600 XT: 'Php 22,232.00'");
                    if (amdgpu10 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu10 +"=");
                        sum -= amdgpu10;
                    }
                    break;
                }
                break;
                case 2:
                System.out.println(" ");
                System.out.println("1. NVIDIA GeForce RTX 4090: 'Php Php 92,205'");
                System.out.println("2. NVIDIA GeForce RTX 4080 Ti: 'Php 63,200.00'");
                System.out.println("3. NVIDIA GeForce RTX 4080: 'Php 63,200'");
                System.out.println("4. NVIDIA GeForce RTX 4070 Ti: 'Php 55,995.00'");
                System.out.println("5. NVIDIA GeForce RTX 4070: 'Php 40,550.00'");
                System.out.println("6. NVIDIA GeForce RTX 4060 Ti: 'Php 33,150.00'");
                System.out.println("7. NVIDIA GeForce RTX 4060: 'Php 20,515.00'");
                System.out.println("8. NVIDIA GeForce RTX 3060 Ti: 'Php 22,950.00'");
                System.out.println("9. NVIDIA GeForce RTX 3060: 'Php 18,695.00'");
                System.out.println("10. NVIDIA GeForce GTX 1660 Super: 'Php 13,100.00'");
                System.out.println(" ");
                int intelgpu = sc.nextInt();
                switch(intelgpu){
                    case 1:
                    System.out.println("NVIDIA GeForce RTX 4090: 'Php Php 92,205'");
                    if (intelgpu1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu1 +"=");
                        sum -= intelgpu1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("NVIDIA GeForce RTX 4080 Ti: 'Php 63,200.00'");
                    if (intelgpu2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu2 +"=");
                        sum -= intelgpu2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("NVIDIA GeForce RTX 4080: 'Php 63,200'");
                    if (intelgpu3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu3 +"=");
                        sum -= intelgpu3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("NVIDIA GeForce RTX 4070 Ti: 'Php 55,995.00'");
                    if (intelgpu4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu4 +"=");
                        sum -= intelgpu4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("NVIDIA GeForce RTX 4070: 'Php 40,550.00'");
                    if (intelgpu5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu5 +"=");
                        sum -= intelgpu5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 6:
                    System.out.println("NVIDIA GeForce RTX 4060 Ti: 'Php 33,150.00'");
                    if (intelgpu6 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu6 +"=");
                        sum -= intelgpu6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 7:
                    System.out.println("NVIDIA GeForce RTX 4060: 'Php 20,515.00'");
                    if (intelgpu7 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu7 +"=");
                        sum -= intelgpu7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 8:
                    System.out.println("NVIDIA GeForce RTX 3060 Ti: 'Php 22,950.00'");
                    if (intelgpu8 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu8 +"=");
                        sum -= intelgpu8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 9:
                    System.out.println("NVIDIA GeForce RTX 3060: 'Php 18,695.00'");
                    if (intelgpu9 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu9 +"=");
                        sum -= intelgpu9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 10:
                    System.out.println("NVIDIA GeForce GTX 1660 Super: 'Php 13,100.00'");
                    if (intelgpu10 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu10 +"=");
                        sum -= intelgpu10;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                default:
                System.out.println("You've entered an invalid option. ");
            }
            break;
            case 6:
            System.out.println(" ");
            System.out.println("Models of PSU");
            System.out.println("1. Seasonic Prime TX-1600: 'Php 31,618.00'");
            System.out.println("2. Corsair AX1600i: 'Php 22,194.00'");
            System.out.println("3. Corsair RMx: 'Php 19,921.00'");
            System.out.println("4. be quiet! Straight Power 12: 'Php 10,124.00'");
            System.out.println("5. XPG Pylon: 'Php 3.420.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int psu = sc.nextInt();
            switch(psu){
                case 1:
                    System.out.println("Seasonic Prime TX-1600: 'Php 31,618.00'");
                    if (psu1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu1 +"=");
                        sum -= psu1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Corsair AX1600i: 'Php 22,194.00'");
                    if (psu2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu2 +"=");
                        sum -= psu2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Corsair RMx: 'Php 19,921.00'");
                    if (psu3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu3 +"=");
                        sum -= psu3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("be quiet! Straight Power 12: 'Php 10,124.00'");
                    if (psu4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu4 +"=");
                        sum -= psu4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("XPG Pylon: 'Php 3.420.00'");
                    if (psu5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu5 +"=");
                        sum -= psu5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    default:
                    System.out.println("You've entered an invalid option. ");
            }
            break;
            case 7:
            System.out.println(" ");
            System.out.println("Types of Cooling");
            System.out.println("1. 'Air Cooling' ");
            System.out.println("2. 'Water Cooling'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int cooling = sc.nextInt();
            switch(cooling){
                case 1:
                System.out.println("1. Noctua NH-D15: 'Php 7,035.00' ");
                System.out.println("2. Cooler Master Hyper 212 RGB Black Edition: 'Php 2,699.00' ");
                System.out.println("3. Deepcool AK620: 'Php 4,395.00'");
                System.out.println("4. Scythe Mugen 5 Rev.B: 'Php 6,219.00' ");
                System.out.println("5. Thermalright Silver Arrow IB-E Extreme: 'Php 5,865.00' ");
                int aircooling = sc.nextInt();
                switch (aircooling){
                    case 1:
                    System.out.println("Noctua NH-D15: 'Php 7,035.00'");
                    if (aircooling1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling1 +"=");
                        sum -= aircooling1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Cooler Master Hyper 212 RGB Black Edition: 'Php 2,699.00'");
                    if (aircooling2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling2 +"=");
                        sum -= aircooling2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Deepcool AK620: 'Php 4,395.00'");
                    if (aircooling3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling3 +"=");
                        sum -= aircooling3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("Scythe Mugen 5 Rev.B: 'Php 6,219.00'");
                    if (aircooling4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling4 +"=");
                        sum -= aircooling4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("Thermalright Silver Arrow IB-E Extreme: 'Php 5,865.00'");
                    if (aircooling5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling5 +"=");
                        sum -= aircooling5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                case 2:
                System.out.println("1. Corsair H150i Elite LCD XT: 'Php 14,995.00' ");
                System.out.println("2. Lian Li Galahad II Performance 360: 'Php 8,800.00' ");
                System.out.println("3. Arctic Liquid Freezer II 280: 'Php 4,995.00' ");
                System.out.println("4. EK Water Blocks: 'Php 4,340.00' ");
                int watercooling = sc.nextInt();
                switch(watercooling){
                    case 1:
                    System.out.println("Corsair H150i Elite LCD XT: 'Php 14,995.00' ");
                    if (watercooling1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling1 +"=");
                        sum -= watercooling1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Lian Li Galahad II Performance 360: 'Php 8,800.00'");
                    if (watercooling2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling2 +"=");
                        sum -= watercooling2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Arctic Liquid Freezer II 280: 'Php 4,995.00'");
                    if (watercooling3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling3 +"=");
                        sum -= watercooling3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("EK Water Blocks: 'Php 4,340.00'");
                    if (watercooling4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling4 +"=");
                        sum -= watercooling4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                default:
                System.out.println("You've entered an invalid option. ");
            }
            break;
            case 8:
            System.out.println(" ");
            System.out.println("Types of Monitor");
            System.out.println("1. 'LCD Curved Monitor' ");
            System.out.println("2. 'OLED Curved Monitor'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int monitor = sc.nextInt();
            switch (monitor){
                case 1:
                System.out.println("1. Samsung Odyssey G7: 'Php 33,699.00' ");
                System.out.println("2. LG UltraGear 38WN95C-W: 'Php 55,727.00' ");
                System.out.println("3. Samsung Odyssey G5: 'Php 26,500.00' ");
                System.out.println("4. AOC CU34G2X: Refresh Rate: 'Php 39,302.00' ");
                System.out.println("5. MSI Optix MAG342CQR: 'Php 17,008.00'");
                int lcdmonitor = sc.nextInt();
                switch (lcdmonitor){
                    case 1:
                    System.out.println("Samsung Odyssey G7: 'Php 33,699.00' ");
                    if (lcdmonitor1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor1 +"=");
                        sum -= lcdmonitor1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("LG UltraGear 38WN95C-W: 'Php 55,727.00' ");
                    if (lcdmonitor2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor2 +"=");
                        sum -= lcdmonitor2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Samsung Odyssey G5: 'Php 26,500.00'");
                    if (lcdmonitor3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor3 +"=");
                        sum -= lcdmonitor3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("AOC CU34G2X: Refresh Rate: 'Php 39,302.00' ");
                    if (lcdmonitor4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor4 +"=");
                        sum -= lcdmonitor4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("MSI Optix MAG342CQR: 'Php 17,008.00'");
                    if (lcdmonitor5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor5 +"=");
                        sum -= lcdmonitor5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                case 2:
                System.out.println("1. MSI MPG 321URX QD-OLED: 'Php 68,800.00'");
                System.out.println("2. MSI MPG 271QRX: 'Php 52,995.00'");
                System.out.println("3. Asus ROG Swift OLED PG34WCDM: 'Php 76,200.00'");
                System.out.println("4. Alienware 34 QD-OLED AW3423DWF: 'Php 37,835.00'");
                System.out.println("5. Samsung Odyssey OLED G9: 'Php 61,474.00'");
                int oledmonitor = sc.nextInt();
                switch(oledmonitor){
                    case 1:
                    System.out.println("MSI MPG 321URX QD-OLED: 'Php 68,800.00'");
                    if (oledmonitor1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor1 +"=");
                        sum -= oledmonitor1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("MSI MPG 271QRX: 'Php 52,995.00'");
                    if (oledmonitor2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor2 +"=");
                        sum -= oledmonitor2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Asus ROG Swift OLED PG34WCDM: 'Php 76,200.00'");
                    if (oledmonitor3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor3 +"=");
                        sum -= oledmonitor3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("Alienware 34 QD-OLED AW3423DWF: 'Php 37,835.00'");
                    if (oledmonitor4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor4 +"=");
                        sum -= oledmonitor4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("Samsung Odyssey OLED G9: 'Php 61,474.00'");
                    if (oledmonitor5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor5 +"=");
                        sum -= oledmonitor5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                default:
                System.out.println("You've entered an invalid option. ");
            }

            break;
        }

        //For this code, this will serve as a loop to the code above.
        //There are 2 optionts for you to make. Press 1 to go back from the start and press 0 to exit.
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.print("Enter a number  '0'  to exit and '1' to go back from the start: ");
            int number = sc.nextInt();

            if (number == 0) {
                System.out.println("Thank you for trusting our shop!!");
                System.out.println("Come again next time!!");
                continueLoop = false;
            } else {
                System.out.println(" ");
        System.out.println("So what Computer hardware components are you looking for?");
        System.out.println("1.'CPU'");
        System.out.println("2.'Motherboard'");
        System.out.println("3.'RAM'");
        System.out.println("4.'Storage Disk'");
        System.out.println("5.'GPU'");
        System.out.println("6.'PSU'");
        System.out.println("7.'Cooling'");
        System.out.println("8.'Monitor'");
        System.out.println(" ");
        int P = sc.nextInt();
        
        switch (P){
            case 1:
            System.out.println(" ");
            System.out.println("AMD or Intel");
            System.out.println("1. 'AMD'");
            System.out.println("2. 'Intel'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int cpu = sc.nextInt();
            switch (cpu){
            case 1:
            System.out.println(" ");
            System.out.println("1.AMD Ryzen 3 1200 12nm: 'Php 2,950.00'");
            System.out.println("2.AMD Ryzen 3 1200 14nm: 'Php 2.950.00'");
            System.out.println("3.AMD Ryzen 3 1300X: 'Php 7,250.00'");
            System.out.println("4.AMD Ryzen 3 2200G: 'Php 5,000.00'");
            System.out.println("5.AMD Ryzen 3 3300X: 'Php 7,000.00'");
            System.out.println("6.AMD Ryzen 3 4100: 'Php 6,000.00'");
            System.out.println("7.AMD Ryzen 5 1400: 'Php 3,499.00'");
            System.out.println("8.AMD Ryzen 5 5600: 'Php 7,120.00'");
            System.out.println("9.AMD Ryzen 5 5600G: 'Php 7,490.00'");
            System.out.println("10.AMD Ryzen 5 5600GT: 'Php 8,845.00'");
            System.out.println("11.AMD Ryzen 5 7600: 'Php 12,075.00'");
            System.out.println("12.AMD Ryzen 5 7600X: 'Php 12,075.00'");
            System.out.println("13.AMD Ryzen 7 7800X3D: 'Php 26,995.00'");
            System.out.println("14.AMD Ryzen 7 8700F: 'Php 18,195.00'");
            System.out.println("15.AMD Ryzen 7 9700X: 'Php 24,500.00'");
            System.out.println("16.AMD Ryzen 7 PRO 7745: 'Php 26,000.00'");
            System.out.println("17.AMD Ryzen 9 7900X: 'Php 26,000.00'");
            System.out.println("18.AMD Ryzen 9 7900X3D: 'Php 37,496.00'");
            System.out.println("19.AMD Ryzen 9 7950X: 'Php 36,500.00'");
            System.out.println("20.AMD Ryzen 9 9900X:'Php 32,665.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int AMD = sc.nextInt();
                switch (AMD) {
                    case 1:
                    System.out.println("AMD Ryzen 3 1200 12nm: 'Php 2,950.00'");
                    if (amd1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd1 +"=");
                        sum -= amd1;
                        System.out.println("Remaining balance: " + sum);
                    }
                    break;
                    case 2:
                    System.out.println("AMD Ryzen 3 1200 14nm: 'Php 2.950.00'");
                    if (amd2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "-" + amd2 + "=");
                        sum -= amd2;
                    }
                    break;
                    case 3:
                    System.out.println("AMD Ryzen 3 1300X: 'Php 7,250.00'");
                    if (amd3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "-" + amd3 + "=");
                        sum -= amd3;
                    }
                    break;
                    case 4:
                    System.out.println("AMD Ryzen 3 2200G: 'Php 5,000.00' ");
                    if (amd4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " +amd4 +"=");
                        sum -= amd4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("AMD Ryzen 3 3300X: 'Php 7,000.00'");
                    if (amd5 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- "+ amd5 +"=");
                        sum -= amd5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 6:
                    System.out.println("AMD Ryzen 3 4100: 'Php 6,000.00'");
                    if (amd6 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd6 +"=");
                        sum -= amd6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 7:
                    System.out.println("AMD Ryzen 5 1400: 'Php 3,499.00'");
                    if (amd7 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd7 +"=");
                        sum -= amd7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 8:
                    System.out.println("AMD Ryzen 5 5600: 'Php 7,120.00'");
                    if (amd8 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd8 +"=");
                        sum -= amd8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 9:
                    System.out.println("AMD Ryzen 5 5600G: 'Php 7,490.00'");
                    if (amd9 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd9 +"=");
                        sum -= amd9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 10:
                    System.out.println("AMD Ryzen 5 5600GT: 'Php 8,845.00'");
                    if (amd10 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd10 +"=");
                        sum -= amd10;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 11:
                    System.out.println("AMD Ryzen 5 7600: 'Php 12,075.00'");
                    if (amd11 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd11 +"=");
                        sum -= amd11;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 12:
                    System.out.println("AMD Ryzen 5 7600X: 'Php 14,350.00");
                    if (amd12 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd12 +"=");
                        sum -= amd12;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 13:
                    System.out.println("AMD Ryzen 7 7800X3D: 'Php 26,995.00'");
                    if (amd13 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd13 +"=");
                        sum -= amd13;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 14:
                    System.out.println("AMD Ryzen 7 8700F: 'Php 18,195.00'");
                    if (amd14 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd14 +"=");
                        sum -= amd14;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 15:
                    System.out.println("AMD Ryzen 7 9700X: 'Php 24,500.00'");
                    if (amd15 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd15 +"=");
                        sum -= amd15;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 16:
                    System.out.println("AMD Ryzen 7 PRO 7745: 'Php 26,000.00'");
                    if (amd16 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd16 +"=");
                        sum -= amd16;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 17:
                    System.out.println("AMD Ryzen 9 7900X: 'Php 26,000.00'");
                    if (amd17 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd17 +"=");
                        sum -= amd17;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 18:
                    System.out.println("AMD Ryzen 9 7900X3D: 'Php 37,496.00'");
                    if (amd18 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd18 +"=");
                        sum -= amd18;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 19:
                    System.out.println("AMD Ryzen 9 7950X: 'Php 36,500.00'");
                    if (amd19 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd19 +"=");
                        sum -= amd19;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 20:
                    System.out.println("AMD Ryzen 9 9900X:'Php 32,665.00'");
                    if (amd20 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amd20 +"=");
                        sum -= amd20;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;        
                }    
            break;
            case 2:
            System.out.println(" ");
            System.out.println("1.Intel Core i3-12100F: 'Php 4,820.00'");
            System.out.println("2.Intel Core i3-13100F: 'Php 6,670.00'");
            System.out.println("3.Intel Core i3-14100F: 'Php 7,520.00'");
            System.out.println("4.Intel Core i5-13600K: 'Php 20,999.00'");
            System.out.println("5.Intel Core i5-13400F: 'Php 8,974.00'");
            System.out.println("6.Intel Core i5-12600K: 'Php 20,999.00'");
            System.out.println("7.Intel Core i7-14700K: 'Php 24,950.00'");
            System.out.println("8.Intel Core i7-13700K: 'Php 26,999.00'");
            System.out.println("9.Intel Core i7-12700K: 'Php 25,940.00'");
            System.out.println("10.Intel Core i9-14900K: 'Php 33,750.00'");
            System.out.println("11.Intel Core i9-13900K: 'Php 37,999.00'");
            System.out.println("12.Intel Core i9-13900KF: 'Php 31,850.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int INTEL = sc.nextInt();
            switch (INTEL){
                case 1:
                    System.out.println("Intel Core i3-12100F: 'Php 4,820.00'");
                    if (intel1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel1 +"=");
                        sum -= intel1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                case 2:
                System.out.println("2.Intel Core i3-13100F: 'Php 6,670.00'");
                    if (intel2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel2 +"=");
                        sum -= intel2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 3:
                System.out.println("3.Intel Core i3-14100F: 'Php 7,520.00'");
                    if (intel3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel3 +"=");
                        sum -= intel3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 4:
                System.out.println("4.Intel Core i5-13600K: 'Php 20,999.00'");
                    if (intel4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel4 +"=");
                        sum -= intel4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 5:
                System.out.println("5.Intel Core i5-13400F: 'Php 8,974.00'");
                    if (intel5 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel5 +"=");
                        sum -= intel5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 6:
                System.out.println("Intel Core i5-12600K: 'Php 20,999.00'");
                    if (intel6 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel6 +"=");
                        sum -= intel6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 7:
                System.out.println("Intel Core i7-14700K: 'Php 24,950.00'");
                    if (intel7 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel7 +"=");
                        sum -= intel7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 8:
                System.out.println("Intel Core i7-13700K: 'Php 26,999.00'");
                    if (intel8 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel8 +"=");
                        sum -= intel8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 9:
                System.out.println("Intel Core i7-12700K: 'Php 25,940.00'");
                    if (intel9 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel9 +"=");
                        sum -= intel9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 10:
                System.out.println("Intel Core i7-12700K: 'Php 25,940.00'");
                    if (intel10 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel10 +"=");
                        sum -= intel10;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 11:
                System.out.println("Intel Core i9-13900K: 'Php 37,999.00'");
                    if (intel11 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel11 +"=");
                        sum -= intel11;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 
                    case 12:
                System.out.println("Intel Core i9-13900KF: 'Php 31,850.00'");
                    if (intel12 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intel12 +"=");
                        sum -= intel12;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break; 

            }
            break;
            default:
            System.out.println("You've entered an invalid option. ");
            }
            break;
            case 2:
            System.out.println(" ");
            System.out.println("1. ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
            System.out.println("2. ASUS ROG Strix Z790-A Gaming WiFi: 'Php 22,295.00'");
            System.out.println("3. ASUS ROG Strix B650-A Gaming WiFi: 'Php 15,850.00'");
            System.out.println("4. ASUS ROG Strix Z790-I Gaming WiFi: 'Php 32,249.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int mboard = sc.nextInt();
            switch (mboard){
                case 1:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard1 +"=");
                        sum -= mboard1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard2 +"=");
                        sum -= mboard2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard3 +"=");
                        sum -= mboard3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("ASUS ROG Rampage VII Extreme: 'Php 71,992.00'");
                    if (mboard4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + mboard4 +"=");
                        sum -= mboard4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    default:
                    System.out.println("You've entered an invalid option. ");
            }
            break;
            case 3:
            System.out.println(" ");
            System.out.println("RAM Capacity");
            System.out.println("1. '8gb RAM'");
            System.out.println("2.'16gb RAM'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int ramtype = sc.nextInt();
            switch (ramtype){
                case 1:
                System.out.println(" ");
                System.out.println("1. Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                System.out.println("2. G.Skill Ripjaws V DDR4 3600MHz CL18: 'Php 1,125.00'");
                System.out.println(" ");
                int ram8 = sc.nextInt();
                switch (ram8){
                    case 1:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (gbRAM1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + gbRAM1 +"=");
                        sum -= gbRAM1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (gbRAM2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + gbRAM2 +"=");
                        sum -= gbRAM2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                case 2:
                System.out.println(" ");
                System.out.println("1. Corsair Vengeance RGB Pro DDR4 3600MHz CL18: 'Php 1,632.00'");
                System.out.println("2. G.Skill Trident Z Neo DDR4 3600MHz CL16: 'Php 2,250.00'");
                System.out.println("3. Kingston Fury Beast DDR4 3600MHz CL16: 'Php 2,345.00'");
                System.out.println(" ");
                int ram16 = sc.nextInt();
                switch (ram16){
                    case 1:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (GBram1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + GBram1 +"=");
                        sum -= GBram1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (GBram2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + GBram2 +"=");
                        sum -= GBram2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Corsair Vengeance LPX DDR4 3200MHz CL16: 'Php 816.00'");
                    if (GBram3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + GBram3 +"=");
                        sum -= GBram3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
            }
            break;
            case 4:
            System.out.println(" ");
            System.out.println("Storage type Capacity");
            System.out.println("1. 'HDD'");
            System.out.println("2.'SSD'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int disk = sc.nextInt();
            switch (disk){
                case 1:
                System.out.println(" ");
                System.out.println("1. '500gb' ");
                System.out.println("2. '1tb' ");
                System.out.println("3. '2tb' ");
                System.out.println(" ");
                int hdd = sc.nextInt();
                switch(hdd){
                    case 1:
                    System.out.println(" ");
                    System.out.println("1. Seagate Barracuda: 'Php 2,620.00'");
                    System.out.println("2. Western Digital Blue: 'Php 1,750.00'");
                    System.out.println("3. Toshiba P300: 'Php 467.00' ");
                    System.out.println(" ");
                    int hdd500 = sc.nextInt();
                    switch(hdd500){
                        case 1:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd5001 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd5001 +"=");
                        sum -= hdd5001;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Western Digital Blue: 'Php 1,750.00'");
                    if (hdd5002 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd5002 +"=");
                        sum -= hdd5002;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Toshiba P300: 'Php 467.00' ");
                    if (hdd5003 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd5003 +"=");
                        sum -= hdd5003;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    }
                    break;
                    case 2:
                    System.out.println(" ");
                    System.out.println("1. Seagate Barracuda: 'Php 2,813.00'");
                    System.out.println("2. Western Digital Blue: 'Php 3,119.00'");
                    System.out.println("3. Toshiba P300: 'Php 2,179.00'");
                    System.out.println(" ");
                    int hdd1tb = sc.nextInt();
                    switch (hdd1tb){
                        case 1:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd1tb1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd1tb1 +"=");
                        sum -= hdd1tb1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd1tb2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd1tb2 +"=");
                        sum -= hdd1tb2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd1tb3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd1tb3 +"=");
                        sum -= hdd1tb3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    }
                    case 3:
                    System.out.println(" ");
                    System.out.println("1. Seagate Barracuda: 'Php 3,686.00'");
                    System.out.println("2. Western Digital Blue: 'Php 3,695.00'");
                    System.out.println("3. Toshiba P300: 'Php 3,095.00' ");
                    System.out.println(" ");
                    int hdd2tb = sc.nextInt();
                    switch(hdd2tb){
                        case 1:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd2tb1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd2tb1 +"=");;
                        sum -= hdd2tb1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd2tb2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd2tb2 +"=");;
                        sum -= hdd2tb2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Seagate Barracuda: 'Php 2,620.00'");
                    if (hdd2tb3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + hdd2tb3 +"=");;
                        sum -= hdd2tb3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    }
                    break;
                }
                break;
                case 2:
                System.out.println(" ");
                System.out.println("1. '500gb' ");
                System.out.println("2. '1tb' ");
                System.out.println("3. '2tb' ");
                System.out.println(" ");
                int ssd = sc.nextInt();
                switch (ssd){
                    case 1:
                    System.out.println(" ");
                    System.out.println("1. Samsung 990 Pro: 'Php 2,085.00'");
                    System.out.println("2. WD Black SN850X: 'Php 5,750.00'");
                    System.out.println("3. Crucial P5 Plus: 'Php 4,918.00' ");
                    System.out.println(" ");
                    int ssd500 = sc.nextInt();
                    switch (ssd500){
                        case 1:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd5001 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd5001 +"=");;
                            sum -= ssd5001;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 2:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd5002 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd5002 +"=");;
                            sum -= ssd5002;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 3:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd5001 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd5002 +"=");;
                            sum -= ssd5002;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                    }
                    break;
                    case 2:
                    System.out.println(" ");
                    System.out.println("1. Samsung 990 Pro: 'Php 7,195.00'");
                    System.out.println("2. WD Black SN850X: 'Php 7,900.00'");
                    System.out.println("3. Crucial P5 Plus: 'Php 9,299.00' ");
                    System.out.println(" ");
                    int ssd1tb = sc.nextInt();
                    switch (ssd1tb){
                        case 1:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd1tb1 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd1tb1 +"=");
                            sum -= ssd1tb1;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 2:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd1tb2 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd1tb2 +"=");
                            sum -= ssd1tb2;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 3:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd1tb3 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd1tb3 +"=");
                            sum -= ssd1tb3;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                    }
                    break;
                    case 3:
                    System.out.println(" ");
                    System.out.println("1. Samsung 990 Pro: 'Php 16,425.00'");
                    System.out.println("2. WD Black SN850X: 'Php 11,550.00'");
                    System.out.println("3. Crucial P5 Plus: 'Php 17,856.00' ");
                    System.out.println(" ");
                    int ssd2tb = sc.nextInt();
                    switch (ssd2tb){
                        case 1:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd2tb1 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd2tb1 +"=");
                            sum -= ssd2tb1;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 2:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd2tb2 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd2tb2 +"=");
                            sum -= ssd2tb2;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                        case 3:
                        System.out.println("Samsung 990 Pro: 'Php 2,085.00'");
                        if (ssd2tb3 > sum){
                            System.out.println("Insufficient Funds.");
                            System.out.println(" ");
                        System.out.println("Enter the amount you want to deposit: ");
                        System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                        System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                        int money = sc.nextInt();
                        if (money >= 5000 && money <= 1000000){
                        System.out.println("Thank you, " );
                        System.out.println("You have Deposited an amount of: " + money);
                        } else {
                        money -= money;
                        System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                        }
                         sum += money;
                        System.out.println("Total Balance: " + sum);
                        } else{
                            System.out.println(sum + " "+ "- " + ssd2tb3 +"=");
                            sum -= ssd2tb3;
                        }
                        System.out.println("Remaining balance: " + sum);
                        break;
                    }
                    break;
                    default:
                    System.out.println("You've entered an invalid option. ");
                }
            }
            break;
            case 5:
            System.out.println(" ");
            System.out.println("What model of GPU");
            System.out.println("1. 'AMD' ");
            System.out.println("2.'NVIDEA'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int gpu = sc.nextInt();
            switch (gpu){
                case 1:
                System.out.println(" ");
                System.out.println("1. AMD Radeon RX 7900 XTX: 'Php 58,602.00'");
                System.out.println("2. AMD Radeon RX 7900 XT: 'Php 55,950.00'");
                System.out.println("3. AMD Radeon RX 7800 XT: 'Php 34,095.00'");
                System.out.println("4. AMD Radeon RX 7700 XT: 'Php 26,397.00'");
                System.out.println("5. AMD Radeon RX 7600: 'Php 17,995.00'");
                System.out.println("6. AMD Radeon RX 6950 XT: 'Php 41,825.00'");
                System.out.println("7. AMD Radeon RX 6800 XT: 'Php 38,070.00'");
                System.out.println("8. AMD Radeon RX 6750 XT: 'Php 32,204.00'");
                System.out.println("9. AMD Radeon RX 6700 XT: 'Php 28,098.00'");
                System.out.println("10. AMD Radeon RX 6600 XT: 'Php 22,232.00'");
                System.out.println(" ");
                int amdgpu = sc.nextInt();
                switch(amdgpu){
                    case 1:
                    System.out.println("AMD Radeon RX 7900 XTX: 'Php 58,602.00'");
                    if (amdgpu1 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu1 +"=");
                        sum -= amdgpu1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("AMD Radeon RX 7900 XT: 'Php 55,950.00'");
                    if (amdgpu2 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu2 +"=");
                        sum -= amdgpu2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("AMD Radeon RX 7800 XT: 'Php 34,095.00'");
                    if (amdgpu3 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu3 +"=");
                        sum -= amdgpu3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("AMD Radeon RX 7700 XT: 'Php 26,397.00'");
                    if (amdgpu4 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu4 +"=");
                        sum -= amdgpu4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("AMD Radeon RX 7600: 'Php 17,995.00'");
                    if (amdgpu5 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu5 +"=");
                        sum -= amdgpu5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 6:
                    System.out.println("AMD Radeon RX 6950 XT: 'Php 41,825.00'");
                    if (amdgpu6 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu6 +"=");
                        sum -= amdgpu6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 7:
                    System.out.println("AMD Radeon RX 6800 XT: 'Php 38,070.00'");
                    if (amdgpu7 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu7 +"=");
                        sum -= amdgpu7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 8:
                    System.out.println("AMD Radeon RX 6750 XT: 'Php 32,204.00'");
                    if (amdgpu8 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu8 +"=");
                        sum -= amdgpu8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 9:
                    System.out.println("AMD Radeon RX 6700 XT: 'Php 28,098.00'");
                    if (amdgpu9 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu9 +"=");
                        sum -= amdgpu9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 10:
                    System.out.println("AMD Radeon RX 6600 XT: 'Php 22,232.00'");
                    if (amdgpu10 > sum){
                        System.out.println("Insufficient Funds.");
                        System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + amdgpu10 +"=");
                        sum -= amdgpu10;
                    }
                    break;
                }
                break;
                case 2:
                System.out.println(" ");
                System.out.println("1. NVIDIA GeForce RTX 4090: 'Php Php 92,205'");
                System.out.println("2. NVIDIA GeForce RTX 4080 Ti: 'Php 63,200.00'");
                System.out.println("3. NVIDIA GeForce RTX 4080: 'Php 63,200'");
                System.out.println("4. NVIDIA GeForce RTX 4070 Ti: 'Php 55,995.00'");
                System.out.println("5. NVIDIA GeForce RTX 4070: 'Php 40,550.00'");
                System.out.println("6. NVIDIA GeForce RTX 4060 Ti: 'Php 33,150.00'");
                System.out.println("7. NVIDIA GeForce RTX 4060: 'Php 20,515.00'");
                System.out.println("8. NVIDIA GeForce RTX 3060 Ti: 'Php 22,950.00'");
                System.out.println("9. NVIDIA GeForce RTX 3060: 'Php 18,695.00'");
                System.out.println("10. NVIDIA GeForce GTX 1660 Super: 'Php 13,100.00'");
                System.out.println(" ");
                int intelgpu = sc.nextInt();
                switch(intelgpu){
                    case 1:
                    System.out.println("NVIDIA GeForce RTX 4090: 'Php Php 92,205'");
                    if (intelgpu1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu1 +"=");
                        sum -= intelgpu1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("NVIDIA GeForce RTX 4080 Ti: 'Php 63,200.00'");
                    if (intelgpu2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu2 +"=");
                        sum -= intelgpu2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("NVIDIA GeForce RTX 4080: 'Php 63,200'");
                    if (intelgpu3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu3 +"=");
                        sum -= intelgpu3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("NVIDIA GeForce RTX 4070 Ti: 'Php 55,995.00'");
                    if (intelgpu4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu4 +"=");
                        sum -= intelgpu4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("NVIDIA GeForce RTX 4070: 'Php 40,550.00'");
                    if (intelgpu5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu5 +"=");
                        sum -= intelgpu5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 6:
                    System.out.println("NVIDIA GeForce RTX 4060 Ti: 'Php 33,150.00'");
                    if (intelgpu6 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu6 +"=");
                        sum -= intelgpu6;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 7:
                    System.out.println("NVIDIA GeForce RTX 4060: 'Php 20,515.00'");
                    if (intelgpu7 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu7 +"=");
                        sum -= intelgpu7;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 8:
                    System.out.println("NVIDIA GeForce RTX 3060 Ti: 'Php 22,950.00'");
                    if (intelgpu8 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu8 +"=");
                        sum -= intelgpu8;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 9:
                    System.out.println("NVIDIA GeForce RTX 3060: 'Php 18,695.00'");
                    if (intelgpu9 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu9 +"=");
                        sum -= intelgpu9;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 10:
                    System.out.println("NVIDIA GeForce GTX 1660 Super: 'Php 13,100.00'");
                    if (intelgpu10 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + intelgpu10 +"=");
                        sum -= intelgpu10;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                default:
                System.out.println("You've entered an invalid option. ");
            }
            break;
            case 6:
            System.out.println(" ");
            System.out.println("Models of PSU");
            System.out.println("1. Seasonic Prime TX-1600: 'Php 31,618.00'");
            System.out.println("2. Corsair AX1600i: 'Php 22,194.00'");
            System.out.println("3. Corsair RMx: 'Php 19,921.00'");
            System.out.println("4. be quiet! Straight Power 12: 'Php 10,124.00'");
            System.out.println("5. XPG Pylon: 'Php 3.420.00'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int psu = sc.nextInt();
            switch(psu){
                case 1:
                    System.out.println("Seasonic Prime TX-1600: 'Php 31,618.00'");
                    if (psu1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu1 +"=");
                        sum -= psu1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Corsair AX1600i: 'Php 22,194.00'");
                    if (psu2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu2 +"=");
                        sum -= psu2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Corsair RMx: 'Php 19,921.00'");
                    if (psu3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu3 +"=");
                        sum -= psu3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("be quiet! Straight Power 12: 'Php 10,124.00'");
                    if (psu4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu4 +"=");
                        sum -= psu4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("XPG Pylon: 'Php 3.420.00'");
                    if (psu5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + psu5 +"=");
                        sum -= psu5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    default:
                    System.out.println("You've entered an invalid option. ");
            }
            break;
            case 7:
            System.out.println(" ");
            System.out.println("Types of Cooling");
            System.out.println("1. 'Air Cooling' ");
            System.out.println("2. 'Water Cooling'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int cooling = sc.nextInt();
            switch(cooling){
                case 1:
                System.out.println("1. Noctua NH-D15: 'Php 7,035.00' ");
                System.out.println("2. Cooler Master Hyper 212 RGB Black Edition: 'Php 2,699.00' ");
                System.out.println("3. Deepcool AK620: 'Php 4,395.00'");
                System.out.println("4. Scythe Mugen 5 Rev.B: 'Php 6,219.00' ");
                System.out.println("5. Thermalright Silver Arrow IB-E Extreme: 'Php 5,865.00' ");
                int aircooling = sc.nextInt();
                switch (aircooling){
                    case 1:
                    System.out.println("Noctua NH-D15: 'Php 7,035.00'");
                    if (aircooling1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling1 +"=");
                        sum -= aircooling1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Cooler Master Hyper 212 RGB Black Edition: 'Php 2,699.00'");
                    if (aircooling2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling2 +"=");
                        sum -= aircooling2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Deepcool AK620: 'Php 4,395.00'");
                    if (aircooling3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling3 +"=");
                        sum -= aircooling3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("Scythe Mugen 5 Rev.B: 'Php 6,219.00'");
                    if (aircooling4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling4 +"=");
                        sum -= aircooling4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("Thermalright Silver Arrow IB-E Extreme: 'Php 5,865.00'");
                    if (aircooling5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + aircooling5 +"=");
                        sum -= aircooling5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                case 2:
                System.out.println("1. Corsair H150i Elite LCD XT: 'Php 14,995.00' ");
                System.out.println("2. Lian Li Galahad II Performance 360: 'Php 8,800.00' ");
                System.out.println("3. Arctic Liquid Freezer II 280: 'Php 4,995.00' ");
                System.out.println("4. EK Water Blocks: 'Php 4,340.00' ");
                int watercooling = sc.nextInt();
                switch(watercooling){
                    case 1:
                    System.out.println("Corsair H150i Elite LCD XT: 'Php 14,995.00' ");
                    if (watercooling1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling1 +"=");
                        sum -= watercooling1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("Lian Li Galahad II Performance 360: 'Php 8,800.00'");
                    if (watercooling2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling2 +"=");
                        sum -= watercooling2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Arctic Liquid Freezer II 280: 'Php 4,995.00'");
                    if (watercooling3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling3 +"=");
                        sum -= watercooling3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("EK Water Blocks: 'Php 4,340.00'");
                    if (watercooling4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + watercooling4 +"=");
                        sum -= watercooling4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                default:
                System.out.println("You've entered an invalid option. ");
            }
            break;
            case 8:
            System.out.println(" ");
            System.out.println("Types of Monitor");
            System.out.println("1. 'LCD Curved Monitor' ");
            System.out.println("2. 'OLED Curved Monitor'");
            System.out.println("0. Back. ");
            System.out.println(" ");
            int monitor = sc.nextInt();
            switch (monitor){
                case 1:
                System.out.println("1. Samsung Odyssey G7: 'Php 33,699.00' ");
                System.out.println("2. LG UltraGear 38WN95C-W: 'Php 55,727.00' ");
                System.out.println("3. Samsung Odyssey G5: 'Php 26,500.00' ");
                System.out.println("4. AOC CU34G2X: Refresh Rate: 'Php 39,302.00' ");
                System.out.println("5. MSI Optix MAG342CQR: 'Php 17,008.00'");
                int lcdmonitor = sc.nextInt();
                switch (lcdmonitor){
                    case 1:
                    System.out.println("Samsung Odyssey G7: 'Php 33,699.00' ");
                    if (lcdmonitor1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor1 +"=");
                        sum -= lcdmonitor1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("LG UltraGear 38WN95C-W: 'Php 55,727.00' ");
                    if (lcdmonitor2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor2 +"=");
                        sum -= lcdmonitor2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Samsung Odyssey G5: 'Php 26,500.00'");
                    if (lcdmonitor3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor3 +"=");
                        sum -= lcdmonitor3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("AOC CU34G2X: Refresh Rate: 'Php 39,302.00' ");
                    if (lcdmonitor4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor4 +"=");
                        sum -= lcdmonitor4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("MSI Optix MAG342CQR: 'Php 17,008.00'");
                    if (lcdmonitor5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + lcdmonitor5 +"=");
                        sum -= lcdmonitor5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                case 2:
                System.out.println("1. MSI MPG 321URX QD-OLED: 'Php 68,800.00'");
                System.out.println("2. MSI MPG 271QRX: 'Php 52,995.00'");
                System.out.println("3. Asus ROG Swift OLED PG34WCDM: 'Php 76,200.00'");
                System.out.println("4. Alienware 34 QD-OLED AW3423DWF: 'Php 37,835.00'");
                System.out.println("5. Samsung Odyssey OLED G9: 'Php 61,474.00'");
                int oledmonitor = sc.nextInt();
                switch(oledmonitor){
                    case 1:
                    System.out.println("MSI MPG 321URX QD-OLED: 'Php 68,800.00'");
                    if (oledmonitor1 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor1 +"=");
                        sum -= oledmonitor1;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 2:
                    System.out.println("MSI MPG 271QRX: 'Php 52,995.00'");
                    if (oledmonitor2 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor2 +"=");
                        sum -= oledmonitor2;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 3:
                    System.out.println("Asus ROG Swift OLED PG34WCDM: 'Php 76,200.00'");
                    if (oledmonitor3 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor3 +"=");
                        sum -= oledmonitor3;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 4:
                    System.out.println("Alienware 34 QD-OLED AW3423DWF: 'Php 37,835.00'");
                    if (oledmonitor4 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor4 +"=");
                        sum -= oledmonitor4;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                    case 5:
                    System.out.println("Samsung Odyssey OLED G9: 'Php 61,474.00'");
                    if (oledmonitor5 > sum){
                    System.out.println("Insufficient Funds.");
                    System.out.println(" ");
                    System.out.println("Enter the amount you want to deposit: ");
                    System.out.println("Minimum amount you can deposit is 5,000 pesos. ");
                    System.out.println("Maximum amount you can deposit in a day is 1,000,000 pesos. ");
                    int money = sc.nextInt();
                    if (money >= 5000 && money <= 1000000){
                    System.out.println("Thank you, " );
                    System.out.println("You have Deposited an amount of: " + money);
                    } else {
                    money -= money;
                    System.out.println("Can't proccess. Amount didn't meet the standard reuirments.");
                    }
                     sum += money;
                    System.out.println("Total Balance: " + sum);
                    } else{
                        System.out.println(sum + " "+ "- " + oledmonitor5 +"=");
                        sum -= oledmonitor5;
                    }
                    System.out.println("Remaining balance: " + sum);
                    break;
                }
                break;
                default:
                System.out.println("You've entered an invalid option. ");
            }

            break;
        }
            }
        }
     }
 }
                
        