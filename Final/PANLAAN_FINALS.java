import java.util.Scanner;

/* The overall rating of the setup itself is not accurate and Primarily sourced from internet bias.
Some are considered acurate at an extent but its acuracy is not off from its overall performance in general.
The list of components are limitted and are not complete from every computer component ever made.*/

public class PANLAAN_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Restart option to refresh the selection option with yes and no
        
            String motherboard = "", cpu = "", ram = "", gpu = "", storage = "", storageType = "",
                    powerSupply = "", cooler = "", pcCase = "";
            int motherboardChoice = 0, cpuChoice = 0, ramChoice = 0, gpuChoice = 0,
                    storageChoice = 0, storageTypeChoice = 0, powerSupplyChoice = 0,
                    coolerChoice = 0, pcCaseChoice = 0;
            int totalRating = 0;
            int maxRating = 0;

            // Ask user to select a motherboard
            while (true) {
                System.out.println("Select a motherboard: ");
                System.out.println("1. ASUS ROG Strix Z590-E (Intel LGA 1200) - High-performance for Intel users (Rating: 9/10)");
                System.out.println("2. MSI MAG B550 TOMAHAWK (AMD AM4) - Budget option for AMD users (Rating: 8/10)");
                System.out.println("3. Gigabyte Z490 AORUS MASTER (Intel LGA 1200) - Premium features for Intel (Rating: 8.5/10)");
                System.out.println("4. ASRock B660 PRO RS (Intel LGA 1700) - Affordable with PCIe 4.0 support for Intel 12th Gen (Rating: 7.5/10)");
                System.out.println("5. MSI MPG X670E CARBON (AMD AM5) - Future-proof for AMD 7000 series with PCIe 5.0 (Rating: 9.5/10)");
                System.out.println("6. ASUS TUF GAMING B550-PLUS (AMD AM4) - Solid build quality, reliable for AMD (Rating: 8/10)");
                System.out.println("7. Gigabyte A520M S2H (AMD AM4) - Budget motherboard for basic AMD builds (Rating: 6/10)");
                System.out.print("Input Number of Chosen Component: ");
                motherboardChoice = scanner.nextInt();
                scanner.nextLine();

                switch (motherboardChoice) {
                    case 1: // Intel
                        motherboard = "ASUS ROG Strix Z590-E (Intel LGA 1200)";
                        totalRating += 9;
                        break;
                    case 2: // AMD
                        motherboard = "MSI MAG B550 TOMAHAWK (AMD AM4)";
                        totalRating += 8;
                        break;
                    case 3: // Intel
                        motherboard = "Gigabyte Z490 AORUS MASTER (Intel LGA 1200)";
                        totalRating += 8.5;
                        break;
                    case 4: // Intel
                        motherboard = "ASRock B660 PRO RS (Intel LGA 1700)";
                        totalRating += 7.5;
                        break;
                    case 5: // AMD
                        motherboard = "MSI MPG X670E CARBON (AMD AM5)";
                        totalRating += 9.5;
                        break;
                    case 6: // AMD
                        motherboard = "ASUS TUF GAMING B550-PLUS (AMD AM4)";
                        totalRating += 8;
                        break;
                    case 7: // AMD
                        motherboard = "Gigabyte A520M S2H (AMD AM4)";
                        totalRating += 6;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid motherboard.");
                        continue;
                }
                maxRating += 10;
                break;
            }

            // Ask user to select a CPU based on the motherboard chosen
            while (true) {
                System.out.println("Select a CPU: ");

                // Show Intel CPUs if Intel motherboard is chosen
                if (motherboardChoice == 1 || motherboardChoice == 3 || motherboardChoice == 4) {
                    System.out.println("1. Intel i3 12100F - Budget option for basic tasks (Rating: 7/10)");
                    System.out.println("2. Intel i5 12400 - Great value for mid-range gaming (Rating: 8.5/10)");
                    System.out.println("3. Intel i7 12700K - Excellent for gaming and multitasking (Rating: 9.5/10)");
                    System.out.println("4. Intel i9 13900K - Flagship CPU with extreme performance (Rating: 10/10)");
                    System.out.println("5. Intel i5 13600K - Great for gaming and general workloads (Rating: 8.5/10)");
                }
                // Show AMD CPUs if AMD motherboard is chosen
                if (motherboardChoice == 2 || motherboardChoice == 5 || motherboardChoice == 6 || motherboardChoice == 7) {
                    System.out.println("6. AMD Ryzen 5 5600X (AM4) - Solid mid-range CPU for gaming (Rating: 8.5/10)");
                    System.out.println("7. AMD Ryzen 7 5800X (AM4) - High-performance CPU for multitasking (Rating: 9/10)");
                    System.out.println("8. AMD Ryzen 9 5900X (AM4) - Top-tier performance for gaming and productivity (Rating: 9.5/10)");
                    System.out.println("9. AMD Ryzen 5 7600X (AM5) - Great performance with the latest AMD tech (Rating: 9/10)");
                    System.out.println("10. AMD Ryzen 7 7800X3D (AM5) - Exceptional gaming performance (Rating: 9.5/10)");
                }

                System.out.print("Input Number of Chosen Component: ");
                cpuChoice = scanner.nextInt();
                scanner.nextLine(); 

                switch (cpuChoice) {
                    case 1:
                        cpu = "Intel i3 12100F";
                        totalRating += 7;
                        break;
                    case 2:
                        cpu = "Intel i5 12400";
                        totalRating += 8.5;
                        break;
                    case 3:
                        cpu = "Intel i7 12700K";
                        totalRating += 9.5;
                        break;
                    case 4:
                        cpu = "Intel i9 13900K";
                        totalRating += 10;
                        break;
                    case 5:
                        cpu = "Intel i5 13600K";
                        totalRating += 8.5;
                        break;
                    case 6:
                        cpu = "AMD Ryzen 5 5600X (AM4)";
                        totalRating += 8.5;
                        break;
                    case 7:
                        cpu = "AMD Ryzen 7 5800X (AM4)";
                        totalRating += 9;
                        break;
                    case 8:
                        cpu = "AMD Ryzen 9 5900X (AM4)";
                        totalRating += 9.5;
                        break;
                    case 9:
                        cpu = "AMD Ryzen 5 7600X (AM5)";
                        totalRating += 9;
                        break;
                    case 10:
                        cpu = "AMD Ryzen 7 7800X3D (AM5)";
                        totalRating += 9.5;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        continue;
                }
                maxRating += 10;
                break;
            }

            // Ask user to select RAM
            while (true) {
                System.out.println("Select RAM: ");
                System.out.println("1. Corsair Vengeance LPX 16GB - Reliable, no-frills performance (Rating: 8/10)");
                System.out.println("2. G.SKILL Ripjaws V 16GB - Stable and good performance for gaming (Rating: 8.5/10)");
                System.out.println("3. Corsair Vengeance LPX 32GB - Ideal for content creation (Rating: 9/10)");
                System.out.println("4. G.SKILL Trident Z 32GB - High-performance with RGB (Rating: 9/10)");
                System.out.println("5. Corsair Dominator Platinum 32GB - Premium high-speed RAM (Rating: 9/10)");
                System.out.println("6. HyperX Fury RGB 16GB - Affordable with RGB lighting (Rating: 8/10)");
                System.out.println("7. TeamGroup T-Force Delta RGB 32GB - High-performance with RGB lighting (Rating: 9/10)");
                System.out.print("Input Number of Chosen Component: ");
                ramChoice = scanner.nextInt();
                scanner.nextLine(); 

                switch (ramChoice) {
                    case 1:
                        ram = "Corsair Vengeance LPX 16GB";
                        totalRating += 8;
                        break;
                    case 2:
                        ram = "G.SKILL Ripjaws V 16GB";
                        totalRating += 8.5;
                        break;
                    case 3:
                        ram = "Corsair Vengeance LPX 32GB";
                        totalRating += 9;
                        break;
                    case 4:
                        ram = "G.SKILL Trident Z 32GB";
                        totalRating += 9;
                        break;
                    case 5:
                        ram = "Corsair Dominator Platinum 32GB";
                        totalRating += 9;
                        break;
                    case 6:
                        ram = "HyperX Fury RGB 16GB";
                        totalRating += 8;
                        break;
                    case 7:
                        ram = "TeamGroup T-Force Delta RGB 32GB";
                        totalRating += 9;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        continue;
                }
                maxRating += 10;
                break;
            }

            // Ask user to select a GPU
            while (true) {
                System.out.println("Select a GPU: ");
                System.out.println("Nvidia Models:");
                System.out.println("1. Nvidia GeForce RTX 3090 - High-end performance (Rating: 10/10)");
                System.out.println("2. Nvidia GeForce RTX 3080 - Excellent for 4K gaming (Rating: 9.5/10)");
                System.out.println("3. Nvidia GeForce RTX 3070 - Great performance for 1440p gaming (Rating: 9/10)");
                System.out.println("4. Nvidia GeForce RTX 3060 Ti - Solid 1440p performance (Rating: 8.5/10)");
                System.out.println("5. Nvidia GeForce RTX 3060 - Good for 1080p gaming (Rating: 8/10)");
                System.out.println("6. Nvidia GeForce GTX 1660 Ti - Budget option for 1080p gaming (Rating: 7.5/10)");
                System.out.println("7. Nvidia GeForce GTX 1660 Super - Cost-effective performance (Rating: 7.5/10)");
                System.out.println("8. Nvidia GeForce RTX 3050 - Entry-level for gaming (Rating: 7/10)");
                System.out.println("9. Nvidia GeForce RTX 3080 Ti - Premium gaming (Rating: 10/10)");
                System.out.println("10. Nvidia GeForce RTX 4090 - Top-tier performance (Rating: 10/10)");

                System.out.println("AMD Models:");
                System.out.println("11. AMD Radeon RX 6900 XT - Top performance (Rating: 10/10)");
                System.out.println("12. AMD Radeon RX 6800 XT - Great 4K performance (Rating: 9.5/10)");
                System.out.println("13. AMD Radeon RX 6800 - Solid option for 1440p gaming (Rating: 9/10)");
                System.out.println("14. AMD Radeon RX 6700 XT - Good performance for 1440p (Rating: 8.5/10)");
                System.out.println("15. AMD Radeon RX 6600 XT - Excellent 1080p gaming (Rating: 8/10)");
                System.out.println("16. AMD Radeon RX 6600 - Good budget option (Rating: 7.5/10)");
                System.out.println("17. AMD Radeon RX 6500 XT - Entry-level gaming (Rating: 7/10)");
                System.out.println("18. AMD Radeon RX 6950 XT - High-end gaming (Rating: 10/10)");
                System.out.println("19. AMD Radeon RX 5700 XT - Great value for the performance (Rating: 8.5/10)");
                System.out.println("20. AMD Radeon RX 5700 - Good mid-range performance (Rating: 8/10)");
                
                System.out.print("Input Number of Chosen Component: ");
                gpuChoice = scanner.nextInt();
                scanner.nextLine();
                
                switch (gpuChoice) {
                    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                    case 9: case 10: // Nvidia options
                        gpu = gpuChoice <= 10 ? "Nvidia GPU" : "Invalid Nvidia GPU"; // Dummy check, adapting logic can be done
                        totalRating += (gpuChoice <= 10) ? (10 - (gpuChoice - 1) * 0.5) : 0; // Dummy rating logic
                        break;

                    case 11: case 12: case 13: case 14: case 15: case 16: case 17:
                    case 18: case 19: case 20: // AMD options
                        gpu = gpuChoice <= 20 ? "AMD GPU" : "Invalid AMD GPU"; // Dummy check, adapting logic can be done
                        totalRating += (gpuChoice <= 20) ? (10 - (gpuChoice - 11) * 0.5) : 0; // Dummy rating logic
                        break;

                    default:
                        System.out.println("Invalid choice. Please select again.");
                        continue;
                }
                maxRating += 10;
                break;
            }

            // Ask user to select a CPU cooler
            while (true) {
                System.out.println("Select a CPU Cooler: ");
                System.out.println("1. Cooler Master Hyper 212 - Budget-friendly and reliable (Rating: 7/10)");
                System.out.println("2. Noctua NH-D15 - High-performance cooling (Rating: 9.5/10)");
                System.out.println("3. be quiet! Dark Rock Pro 4 - Excellent cooling performance (Rating: 9/10)");
                System.out.println("4. Corsair H100i - AIO liquid cooling (Rating: 9/10)");
                System.out.println("5. NZXT Kraken X63 - Stylish and effective AIO (Rating: 8.5/10)");
                System.out.println("6. Scythe Mugen 5 - Great performance for the price (Rating: 8/10)");
                System.out.println("7. Deepcool Gammaxx 400 - Affordable and efficient (Rating: 7.5/10)");
                System.out.println("8. Arctic Freezer 34 - Solid cooler with great value (Rating: 8/10)");
                System.out.println("9. Thermaltake Floe 240 - Elegant liquid cooler (Rating: 8/10)");
                System.out.println("10. Cryorig H7 - Compact and effective (Rating: 8/10)");
                System.out.print("Input Number of Chosen Component: ");
                coolerChoice = scanner.nextInt();
                scanner.nextLine();

                switch (coolerChoice) {
                    case 1:
                        cooler = "Cooler Master Hyper 212";
                        totalRating += 7;
                        break;
                    case 2:
                        cooler = "Noctua NH-D15";
                        totalRating += 9.5;
                        break;
                    case 3:
                        cooler = "be quiet! Dark Rock Pro 4";
                        totalRating += 9;
                        break;
                    case 4:
                        cooler = "Corsair H100i";
                        totalRating += 9;
                        break;
                    case 5:
                        cooler = "NZXT Kraken X63";
                        totalRating += 8.5;
                        break;
                    case 6:
                        cooler = "Scythe Mugen 5";
                        totalRating += 8;
                        break;
                    case 7:
                        cooler = "Deepcool Gammaxx 400";
                        totalRating += 7.5;
                        break;
                    case 8:
                        cooler = "Arctic Freezer 34";
                        totalRating += 8;
                        break;
                    case 9:
                        cooler = "Thermaltake Floe 240";
                        totalRating += 8;
                        break;
                    case 10:
                        cooler = "Cryorig H7";
                        totalRating += 8;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        continue;
                }
                maxRating += 10;
                break;
            }

            // Ask user to select a power supply
            while (true) {
                System.out.println("Select a Power Supply: ");
                System.out.println("1. EVGA 600 W1 - Budget-friendly and reliable (Rating: 7/10)");
                System.out.println("2. Corsair TX650M - Solid quality and efficiency (Rating: 9/10)");
                System.out.println("3. Seasonic Focus Gold 650W - Premium performance (Rating: 9.5/10)");
                System.out.println("4. be quiet! Straight Power 11 550W - Quiet and efficient (Rating: 9/10)");
                System.out.println("5. Thermaltake Toughpower 650W - Great value for performance (Rating: 8.5/10)");
                System.out.println("6. Cooler Master MWE Gold 650W - Good performance and efficiency (Rating: 8.5/10)");
                System.out.println("7. Corsair RM750x - Excellent performance (Rating: 9/10)");
                System.out.println("8. EVGA SuperNOVA 750 G5 - Reliable and efficient (Rating: 9/10)");
                System.out.println("9. Seasonic Prime TX 750W - Exceptional quality (Rating: 10/10)");
                System.out.println("10. FSP Hydro G 650W - Great overall performance (Rating: 9/10)");
                System.out.print("Input Number of Chosen Component: ");
                powerSupplyChoice = scanner.nextInt();
                scanner.nextLine();
                
                switch (powerSupplyChoice) {
                    case 1:
                        powerSupply = "EVGA 600 W1";
                        totalRating += 7;
                        break;
                    case 2:
                        powerSupply = "Corsair TX650M";
                        totalRating += 9;
                        break;
                    case 3:
                        powerSupply = "Seasonic Focus Gold 650W";
                        totalRating += 9.5;
                        break;
                    case 4:
                        powerSupply = "be quiet! Straight Power 11 550W";
                        totalRating += 9;
                        break;
                    case 5:
                        powerSupply = "Thermaltake Toughpower 650W";
                        totalRating += 8.5;
                        break;
                    case 6:
                        powerSupply = "Cooler Master MWE Gold 650W";
                        totalRating += 8.5;
                        break;
                    case 7:
                        powerSupply = "Corsair RM750x";
                        totalRating += 9;
                        break;
                    case 8:
                        powerSupply = "EVGA SuperNOVA 750 G5";
                        totalRating += 9;
                        break;
                    case 9:
                        powerSupply = "Seasonic Prime TX 750W";
                        totalRating += 10;
                        break;
                    case 10:
                        powerSupply = "FSP Hydro G 650W";
                        totalRating += 9;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        continue;
                }
                maxRating += 10;
                break;
            }

            // Ask user to select a PC case
            while (true) {
                System.out.println("Select a PC Case: ");
                System.out.println("1. NZXT H510 - Clean and modern design");
                System.out.println("2. Cooler Master MasterBox Q300L - Great airflow with a budget price");
                System.out.println("3. Corsair 4000D Airflow - Excellent cooling potential");
                System.out.println("4. Phanteks Eclipse P400A - Stylish with good cooling features");
                System.out.println("5. Fractal Design Meshify C - Great airflow and aesthetics");
                System.out.println("6. Thermaltake V200 - Affordable with a tempered glass panel");
                System.out.println("7. be quiet! Pure Base 500 DX - Solid build quality");
                System.out.println("8. Lian Li PC-O11 Dynamic - Stylish and versatile");
                System.out.println("9. Antec P120 Crystal - Great for showcasing your build");
                System.out.println("10. Cooler Master HAF 700 - Excellent airflow and space");
                System.out.print("Input Number of Chosen Component: ");
                pcCaseChoice = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("PC case selection is optional, no rating assigned.");
                if (pcCaseChoice >= 1 && pcCaseChoice <= 10) {
                    switch (pcCaseChoice) {
                        case 1:
                            pcCase = "NZXT H510";
                            break;
                        case 2:
                            pcCase = "Cooler Master MasterBox Q300L";
                            break;
                        case 3:
                            pcCase = "Corsair 4000D Airflow";
                            break;
                        case 4:
                            pcCase = "Phanteks Eclipse P400A";
                            break;
                        case 5:
                            pcCase = "Fractal Design Meshify C";
                            break;
                        case 6:
                            pcCase = "Thermaltake V200";
                            break;
                        case 7:
                            pcCase = "be quiet! Pure Base 500 DX";
                            break;
                        case 8:
                            pcCase = "Lian Li PC-O11 Dynamic";
                            break;
                        case 9:
                            pcCase = "Antec P120 Crystal";
                            break;
                        case 10:
                            pcCase = "Cooler Master HAF 700";
                            break;
                    }
                } else {
                    System.out.println("Invalid choice. Please select again.");
                    continue;
                }
                break;
            }

            // Display overall rating percentage
            double ratingPercentage = ((double) totalRating / maxRating) * 100;
            System.out.println("Overall Rating: " + totalRating + "/" + maxRating + " (" + String.format("%.2f", ratingPercentage) + "%)");

            // Ask if the user wants to restart
            System.out.println("Would you like to restart the selection? (yes/no)");
            String restart = scanner.nextLine().toLowerCase();
            if (!restart.equals("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the PC Builder!");
    }
}
