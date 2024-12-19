import java.util.InputMismatchException;
import java.util.Scanner;

//first of all i did'nt expect that the emojies wont print, i'll just leave it the way i made it hihi

 /* hey sir kenneth, so i made this cool q&a code, but it kinda bombed. i'm still new to this coding stuff,
and i can't figure out how to hide this secret easter egg part lol
it's a work in progress hihi
i had to use this weird inputmismatchexception thing cuz vscode kept freaking out about duplicate cases, 
especially for the calculation part..... the "2. Perform a calculation"

[import java.util.InputMismatchException] is only for the part of case "2"

i couldn't have done it without the help of 
Workik.com, for the story telling part and this 

youtube video: https://www.youtube.com/watch?v=4pADPX88kaw */ 


//oh! one last thing sir, every response when you type ur answer is on the above of ~~~"What would you like to do?"~~~

//   Celestial Passcode↓ 
class unlockthestardust {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println();
    System.out.println("🌌 Greetings, star traveler! I'm Astra, your cosmic guide. 🌠 Ask me anything ;), and I'll do my best to assist you on your journey through the cosmos. 🚀");
    

        while (true) {
            System.out.println("What mission do you want to embark on?");
            System.out.println();
            System.out.println("1. Pose a cosmic question");
            System.out.println("2. Perform a calculation from the depths of space");
            System.out.println("3. Activate secret mode — unlock hidden realms!");
            String a = sc.nextLine().toLowerCase(); /*tolowercase is important cuz it makes the input case insensitive
             so the program works bisag unsa pay i type sa user like "One" or "one" */












            switch (a) {
                case "1":
                    System.out.println("What's your cosmic query, traveler? ( 'What is your favorite color?', 'How old are you?', 'What is the meaning of life?') ");
                    String question = sc.nextLine().toLowerCase();
                    System.out.println();

                    if (question.contains("color") || question.contains("hue")) {
                        System.out.println("Ah, a lover of the cosmic ocean! A wise choice indeed.");
                        System.out.println();
                        
                    } else if (question.contains("age")) {
                        System.out.print("How many rotations around your home star have you experienced, traveler?: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        if (age >= 18) {
                            System.out.println("Ah, a seasoned explorer! Your journey has just begun ");
                            System.out.println();
                        } else {
                            System.out.println("A young starfarer, full of potential! The cosmos awaits ");
                            System.out.println();
                        }
                    } else if (question.contains("meaning") || question.contains("purpose")) {
                        System.out.println("The meaning of existence is a cosmic mystery, traveler. Perhaps it's to explore, to learn, and to connect with others ");
                    } else {
                        System.out.println("Your query sparks my curiosity. Let's delve deeper into the cosmos together. What else would you like to ask?");
                    }
                    break; 









                    //this is were the import java.util.InputMismatchException comes from till padung obuz

                case "2":
                    try {
                        System.out.print("Enter the first cosmic value: ");
                        double num1 = sc.nextDouble();
                        sc.nextLine(); 

                        System.out.print("Enter the second cosmic value: ");
                        double num2 = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.println();

                        System.out.println("Choose your cosmic operation:");
                        System.out.println("1. Add it up ✨");
                        System.out.println("2. Take it away 🌙");
                        System.out.println("3. Multiply the magic 💫");
                        System.out.println("4. Divide and conquer 🌟");
                        System.out.print("Spill the tea—what's your pick? (1-4): ");
                    
                        int gabriel = sc.nextInt();
                        System.out.println();
                        sc.nextLine(); 

                        double result;
                        switch (gabriel) {
                            case 1: 
                            case 2: 
                            result = gabriel == 1 ? num1 + num2 : num1 - num2;
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
                                System.out.println("Oops! Invalid operation selection, stellar traveler");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Error detected. Please enter valid numbers, stellar traveler");
                        sc.nextLine(); 
                    }
                    break; 










                    // oh myyy is this the easter egg? ;D 
                    case "3":
                    System.out.println("Hold on, did you say secret code? 🤫 (shhh!)");
                    System.out.print("🌌 Enter the cosmic passphrase: ✨");
                    String SECRET = sc.nextLine();
                    System.out.println();
                
                    if (SECRET.equals("unlock the stardust")) {
                        System.out.println("You've unlocked a hidden dimension! A mysterious gateway appears before you, leading to an unexplored corner of the universe...");
                        System.out.println("Suddenly, you hear a distant voice calling out to you from the depths of space...");
                        System.out.println();
                        
                        
                        System.out.println("\"Greetings, traveler. You have found a path few dare to take. Are you ready to discover the secrets of the cosmos?\"");
                        System.out.println("1. Yes, lead me on this adventure!");
                        System.out.println("2. No, I want to return to the main menu.");
                
                        String choice = sc.nextLine();
                
                        if (choice.equals("1")) {
                            System.out.println("\"Excellent! Brace yourself for a journey beyond the stars. Your path to the unknown awaits...\"");
                            System.out.println();
                             /*i had an issue when trying to run the code... the story was quite hard to read
                             But then i realized that printing nothing would create a space HAHAHAHHA */
                            System.out.println();

                            System.out.println("As you step through the gateway, the stars swirl around you in a mesmerizing dance. You find yourself in a hidden realm, far from the familiar, yet oddly comforting. A feeling of anticipation fills the air, like the calm before a cosmic storm...");
                            System.out.println();
                            System.out.println();

                            System.out.println("\"Welcome, traveler. I am the Guardian of the Lost Realms. Your journey here is not by chance but by choice. Beyond these walls lie secrets of the universe, hidden knowledge that only the brave dare to seek.\"");
                            System.out.println();
                            


                            System.out.println("The Guardian pauses, their eyes gleaming with ancient wisdom. \"This place was once a sanctuary for those who dared to explore the cosmos, to unlock the mysteries of existence. Now, it's a place where the whispers of the universe converge—where paths are chosen and destinies are forged.\"");
                            System.out.println();
                            


                            System.out.println("\"Are you ready to dive deeper, traveler? To face the challenges that lie ahead and unlock the true power of the stars? Or will you turn back and leave this hidden dimension, content with the answers you have so far?\"");
                            System.out.println();
                            


                            System.out.println("With every choice you make, the Guardian watches—your decisions could alter the fate of this realm and beyond. Your adventure has only just begun. What path will you take, space explorer?");
                            System.out.println();
                            System.out.println();
                            System.out.println("\"Welcome, traveler. I'm the Guardian of the Lost Realms. This place is not by chance; it's where truths of the universe rest, hidden among the stars.\"");

                            System.out.println(); 
                            System.out.println("The Guardian's voice softens as they continue, \"But not all who enter can remain. Each explorer must choose their path carefully. The weight of your choice will ripple through this realm and beyond.\"");
                            System.out.println(); 
                            System.out.println("1. Stay and unravel the secrets of the Lost Realms.");
                            System.out.println("2. Leave and return to the stars you know.");

                            String canezares = sc.nextLine();
                            switch (canezares) {

                                // the use of \""\ is like pwede gani sya ma solod sa double qoutes String ky if mag (""sample"") <-- this wont work
 
                                case "1":
     
                                System.out.println("You choose to stay, driven by an unyielding curiosity. The Guardian smiles faintly, their gaze filled with both pride and sorrow.");
                                System.out.println("\"A brave choice, traveler. But know this: the secrets you uncover here come with a price. You may never return to your former life, for knowledge changes everything.\"");
                                System.out.println(); 
                                System.out.println("As the Guardian steps aside, the stars around you begin to shift. Whispers of ancient voices fill the air, revealing fragments of long-forgotten truths. You feel a strange mix of awe and melancholy as the weight of this hidden knowledge settles within you.");
                                System.out.println("\"Your journey here will be eternal,\" the Guardian murmurs, their voice fading as the realm envelopes you.");
                                System.out.println("You glance back one last time, but the gateway to the life you knew is gone.");
                                System.out.println(); 
                                System.out.println("And so, you remain—a keeper of the universe's secrets, bound to the Lost Realms forever.");

                                break;


                                case "2":

                                System.out.println("You choose to leave, your heart heavy with the weight of what might have been. The Guardian nods solemnly, understanding your choice.");
                                System.out.println("\"Not every traveler is destined to stay,\" they say, their voice tinged with sadness. \"But carry this with you: the stars hold more than light—they hold memories, connections, and hope. Never stop seeking, traveler.\"");
                                System.out.println(); 
                                System.out.println("As you step back through the gateway, the realm begins to fade. The whispers grow silent, and the stars lose their strange brilliance. You find yourself back where you began, but something has changed.");
                                System.out.println("The Guardian's final words echo in your mind: \"Even the smallest star can light the darkest sky. Remember this, and your journey will never truly end.\"");
                                System.out.println(); 
                                System.out.println("With a mix of sadness and determination, you gaze up at the cosmos above, knowing your adventure isn't over—it's only just begun.");

                                break;


                                default:

                                System.out.println("The Guardian watches silently as your hesitation grows. \"Every choice shapes the universe,\" they say softly. \"But indecision is also a choice. When you are ready, traveler, the gateway will await you.\"");

                            }


                            
                        } else if (choice.equals("2")) {
                            System.out.println("You step back, feeling the pull of the familiar. Perhaps another time, cosmic explorer.");
                        } else {
                            System.out.println("Invalid choice. Please select a valid option, space adventurer.");
                        }
                    } else {
                        System.out.println("Hmm, that doesn't seem to be the correct passphrase. Perhaps next time!");
                    }
                    break;
                

                default:
                    System.out.println("Invalid input. Please choose a valid option, space explorer!");
            }
        }
    }
}
