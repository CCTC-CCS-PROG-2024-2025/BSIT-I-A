import java.util.Scanner;

public class VILLAR_FINALS {

    // A class to represent a room "kay permi nalang way room sa other class"
    static class Room {
        int roomNumber;
        boolean isBooked;
        String bookedBy;

        public Room(int roomNumber) {
            this.roomNumber = roomNumber;
            this.isBooked = false;
            this.bookedBy = "";
        }

        // Method to book the room
        public boolean bookRoom(String guestName) {
            if (this.isBooked) {
                return false; // Room is already booked
            }
            this.isBooked = true;
            this.bookedBy = guestName;
            return true;
        }

        // Method to check room status
        public String getRoomStatus() {
            if (this.isBooked) {
                return "Booked by " + this.bookedBy;
            }
            return "Available";
        }
    }

    // Method to display menu
    public static void showMenu() {
        System.out.println("\n---- Room Management System ----");
        System.out.println("1. Book a Room");
        System.out.println("2. Check Room Availability");
        System.out.println("3. List All Rooms");
        System.out.println("4. Exit\n");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a set of rooms 
        int totalRooms = 10; 
        Room[] rooms = new Room[totalRooms];
        
        // Initialize rooms
        for (int i = 0; i < totalRooms; i++) {
            rooms[i] = new Room(i + 1); 
        }

        int choice;
        String guestName;

        // Main control flow
        while (true) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Book a room
                    System.out.print("Enter the guest name: ");
                    guestName = scanner.nextLine();
                    System.out.print("Enter the room number to book (1 to " + totalRooms + "): ");
                    int roomNumber = scanner.nextInt();
                    if (roomNumber < 1 || roomNumber > totalRooms) {
                        System.out.println("Invalid room number.");
                    } else {
                        if (rooms[roomNumber - 1].bookRoom(guestName)) {
                            System.out.println("Room " + roomNumber + " booked successfully for " + guestName);
                        } else {
                            System.out.println("Room " + roomNumber + " is already booked.");
                        }
                    }
                    break;

                case 2:
                    // Check room availability
                    System.out.print("Enter the room number to check availability (1 to " + totalRooms + "): ");
                    roomNumber = scanner.nextInt();
                    if (roomNumber < 1 || roomNumber > totalRooms) {
                        System.out.println("Invalid room number.");
                    } else {
                        System.out.println("Room " + roomNumber + " is " + rooms[roomNumber - 1].getRoomStatus());
                    }
                    break;

                case 3:
                    // List all rooms and their status
                    System.out.println("\n----- Room Status -----");
                    for (Room room : rooms) {
                        System.out.println("Room " + room.roomNumber + ": " + room.getRoomStatus());
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return; 

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
