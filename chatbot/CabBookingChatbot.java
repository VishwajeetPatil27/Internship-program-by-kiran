package chatbot;
import java.util.Scanner;
import java.util.Random;

public class CabBookingChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\n===== CAB BOOKING CHATBOT =====");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("\nSelect Cab Type:");
                System.out.println("1. Auto - Rs.12/km");
                System.out.println("2. Sedan - Rs.18/km");
                System.out.println("3. SUV - Rs.25/km");
                System.out.print("Enter cab choice: ");

                int cab = sc.nextInt();
                int rate = 0;
                String cabName = "";

                if (cab == 1) {
                    cabName = "Auto";
                    rate = 12;
                } else if (cab == 2) {
                    cabName = "Sedan";
                    rate = 18;
                } else if (cab == 3) {
                    cabName = "SUV";
                    rate = 25;
                } else {
                    System.out.println("Invalid cab choice!");
                    continue;
                }

                System.out.println("\nSelect Route:");
                System.out.println("1. Pune Station to Shivajinagar - 5 km");
                System.out.println("2. Swargate to Kothrud - 8 km");
                System.out.println("3. Hinjawadi to Wakad - 10 km");
                System.out.print("Enter route choice: ");

                int route = sc.nextInt();

                String source = "";
                String destination = "";
                int distance = 0;

                if (route == 1) {
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;
                } else if (route == 2) {
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;
                } else if (route == 3) {
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;
                } else {
                    System.out.println("Invalid route choice!");
                    continue;
                }

                int fare = distance * rate;

                System.out.println("\n===== RIDE DETAILS =====");
                System.out.println("Cab Type: " + cabName);
                System.out.println("Source: " + source);
                System.out.println("Destination: " + destination);
                System.out.println("Distance: " + distance + " km");
                System.out.println("Rate per km: Rs." + rate);
                System.out.println("Total Fare: Rs." + fare);

                System.out.println("\n1. Confirm and Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter your choice: ");

                int confirm = sc.nextInt();

                if (confirm == 2) {
                    System.out.println("Ride cancelled successfully.");
                    System.out.println("OTP was not shared.");
                } else if (confirm == 1) {
                    int otp = 1000 + random.nextInt(9000);

                    System.out.println("Your OTP is: " + otp);
                    System.out.println("Ride booked successfully!");
                    System.out.println("You cannot cancel the ride after OTP sharing.");
                } else {
                    System.out.println("Invalid choice. Returning to main menu.");
                }

            } else if (choice == 2) {
                System.out.println("Thank you for using Cab Booking Chatbot!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
