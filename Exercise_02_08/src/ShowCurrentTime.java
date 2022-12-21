import java.util.Scanner;
/*
The program prompts the user to enter the time zone offset to GMT and displays the time in the specified time zone.
*/
public class ShowCurrentTime {
    public static void main(String[] args) {
        // Create new scanner and get input.
        Scanner sc = new Scanner(System.in);

        // Prompt user for input.
        System.out.println("Enter the time zone offset to UTC: ");
        int num = sc.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970.
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970.
        long totalSeconds = totalMilliseconds / 1_000;

        // Compute the current seconds in the minute in the hour.
        long currentSeconds = totalSeconds % 60;

        // Obtain the total minutes since midnight, Jan 1, 1970.
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour.
        long currentMinutes = totalMinutes % 60;

        // Obtain the total hours since midnight, Jan 1, 1970.
        long totalHours = totalMinutes / 60;

        // Compute the current hour.
        long currentHour = totalHours % 24;
        currentHour = currentHour + num;

        // Display the results.
        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " UTC.");
    }
}
