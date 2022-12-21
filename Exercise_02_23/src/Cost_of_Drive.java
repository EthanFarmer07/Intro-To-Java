import java.util.Scanner;
/*
This program prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 */
public class Cost_of_Drive {
    public static void main(String[] arg) {
        // Declare a new Scanner.
        Scanner input = new Scanner(System.in);
        // Prompts user for info.
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        // Does calculations.
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
