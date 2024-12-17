import java.util.InputMismatchException;
import java.util.Scanner;

 /* hey sir kenneth, so i made this cool q&a code, but it kinda bombed. i'm still new to this coding stuff,
and i can't figure out how to hide this secret easter egg part lol
it's a work in progress hihi
i had to use this weird inputmismatchexception thing cuz vscode kept freaking out about duplicate cases, 
especially for the calculation part..... the "2. Perform a calculation"

[import java.util.InputMismatchException] is only for the part of case "2"

i couldn't have done it without the help of 
Workik.com and this 

youtube video: https://www.youtube.com/watch?v=4pADPX88kaw */ 


//oh! one last thing sir, every response when you type ur answer is on the above of ~~~"What would you like to do?"~~~

class Stardust_CANEZARES_FINAL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Greetings, star traveler! I'm Astra, your cosmic guide. Ask me anything, and I'll do my best to assist you on your journey through the cosmos.");

        while (true) {
            System.out.println("What would you like to do? \n1. Ask a question \n2. Perform a calculation \n3. Activate secret mode");
            String a = sc.nextLine().toLowerCase();












            switch (a) {
                case "1":
                    System.out.print("What's your cosmic query, traveler? ( 'What is your favorite color?', 'How old are you?', 'What is the meaning of life?') ");
                    String question = sc.nextLine().toLowerCase();

                    if (question.contains("color") || question.contains("hue")) {
                        System.out.println("Ah, a lover of the cosmic ocean! A wise choice indeed.");
                        
                    } else if (question.contains("age")) {
                        System.out.print("How many rotations around your home star have you experienced, traveler? ");
                        int age = sc.nextInt();
                        sc.nextLine(); 

                        if (age >= 18) {
                            System.out.println("Ah, a seasoned explorer! Your journey has just begun ");
                        } else {
                            System.out.println("A young starfarer, full of potential! The cosmos awaits ");
                        }
                    } else if (question.contains("meaning") || question.contains("purpose")) {
                        System.out.println("The meaning of existence is a cosmic mystery, traveler. Perhaps it's to explore, to learn, and to connect with others ");
                    } else {
                        System.out.println("Your query sparks my curiosity. Let's delve deeper into the cosmos together. What else would you like to ask?");
                    }
                    break; 









                    //this is were the import java.util.InputMismatchException comes from 

                case "2":
                    try {
                        System.out.print("Enter the first cosmic value: ");
                        double num1 = sc.nextDouble();
                        sc.nextLine(); 

                        System.out.print("Enter the second cosmic value: ");
                        double num2 = sc.nextDouble();
                        sc.nextLine(); 

                        System.out.println("Choose your cosmic operation:");
                        System.out.println("1. Addition");
                        System.out.println("2. Subtraction");
                        System.out.println("3. Multiplication");
                        System.out.println("4. Division");
                        System.out.print("Enter your choice (1-4): ");
                        int operationChoice = sc.nextInt();
                        sc.nextLine(); 

                        double result;
                        switch (operationChoice) {
                            case 1: 
                            case 2: 
                                result = operationChoice == 1 ? num1 + num2 : num1 - num2;
                                System.out.println("The result of your operation is: " + result);
                                break;
                            case 3:
                                result = num1 * num2;
                                System.out.println("The product of your cosmic values is: " + result);
                                break;
                            case 4:
                                if (num2 == 0) {
                                    System.out.println("Error: Division by zero is not allowed!");
                                } else {
                                    result = num1 / num2;
                                    System.out.println("The quotient of your cosmic values is: " + result);
                                }
                                break;
                            default:
                                System.out.println("Invalid operation choice.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter valid numbers ");
                        sc.nextLine(); 
                    }
                    break; 










                    // oh myyy is this the easter egg? ;D
                case "3":
                    System.out.println("Hold on, did you say 'secret code'? (shhh!)");
                    System.out.print("Enter the cosmic passphrase: ");
                    String secretPhrase = sc.nextLine();

                    if (secretPhrase.equals("unlock the stardust")) {
                        System.out.println("You've unlocked a hidden dimension! Let's embark on a new adventure...");

                        /* This part sir is on Working in Progress, i would probably continue this
                         * once i'm really good at coding :D
                         */
                        
                    } else {
                        System.out.println("Hmm, that doesn't seem to be the correct passphrase. Perhaps next time!");
                    }
                    break; 

                default:
                    System.out.println("Invalid input. Please choose a valid option");
            }
        }
    }
}