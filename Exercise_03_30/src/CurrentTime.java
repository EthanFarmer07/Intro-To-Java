import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        // Create new scanner.
        Scanner sc = new Scanner(System.in);

        // Prompt user for input.
        System.out.println("Enter the time zone offset to UTC: ");
        int num = sc.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970.
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970.
        long totalSeconds = totalMilliseconds / 1000;

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
        currentHour += num;

        // Declares a boolean for AM or PM time.
        boolean pm = false;
        // If hour is greater than 12 subtract 12 and set boolean to true.
        if (currentHour > 12) {
            pm = true;
            currentHour -= 12;
        }
        // Declare a String variable to state whether the time is AM or PM.
        String time = " ";
        if (pm = false) {
            time = " PM.";
        } else {
            time = " AM.";
        }


        // Display the results.
        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + time);
    }
}
