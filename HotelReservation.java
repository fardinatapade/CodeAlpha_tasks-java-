//Task 3 = Hotel Reservation system 

import java.util.Scanner;

class HotelReservation 
{
    private static boolean[] rooms = new boolean[5]; 
    private static String[] guests = new String[5];

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        while (true) 
        {
            System.out.println("\n----Hotel Reservation System----");
            System.out.println("Enter 1 for View Available Rooms");
            System.out.println("Enter 2 for Make a Reservation");
            System.out.println("Enter 3 for View Booking Details");
            System.out.println("Enter 4 for Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) 
            {
                case 1:
                    viewRooms();
                    break;
                
                case 2:
                    makeReservation(scanner);
                    break;
                
                case 3:
                    viewBookings();
                    break;
                
                case 4:
                    System.out.println("Thank you for using our hotel reservation system. Goodbye!");
                    scanner.close();
                    return;
               
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }

    private static void viewRooms()
    {
        System.out.println("\n Available Rooms:");
        for (int i = 0; i < rooms.length; i++) 
        {
            if (!rooms[i]) 
            {
                System.out.println("Room " + (i + 1) + " - Available");
            }
        }
    }

    private static void makeReservation(Scanner scanner) 
    {
        System.out.print("\n Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("\n Enter room number (1-5) to book: ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > 5) 
        {
            System.out.println(" Invalid room number");
            return;
        }

        if (rooms[roomNumber - 1]) 
        {
            System.out.println(" Sorry, this room is already booked");
        } 
        
        else 
        {
            rooms[roomNumber - 1] = true;
            guests[roomNumber - 1] = name;
            System.out.println(" Room " + roomNumber + " successfully booked for " + name + "!");
        }
    }

    private static void viewBookings() 
    {
        System.out.println("\n📜 Booking Details:");
        
        for (int i = 0; i < rooms.length; i++) 
        {
            if (rooms[i]) 
            {
                System.out.println("Room " + (i + 1) + " - Booked by " + guests[i]);
            } 
            else 
            {
                System.out.println("Room " + (i + 1) + " - Available");
            }
        }
    }
}