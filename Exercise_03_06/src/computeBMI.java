/*(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java,
to let the user enter weight, feet, and inches.*/
import java.util.Scanner;

public class computeBMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter weight in pounds, height in feet and inches.
        System.out.println("Enter weight in pounds: ");
        double weight = scan.nextDouble();
        System.out.println("Enter height in feet: ");
        double feet = scan.nextDouble();
        System.out.println("Enter height in inches: ");
        double inches = scan.nextDouble();

        // Convert feet to inches.
        feet *= 12;

        // Constants.
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double HEIGHT = feet + inches;

        // Compute BMI.
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = HEIGHT * METERS_PER_INCH;
        double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));

        // Display the result.
        System.out.println("BMI is: " + bmi);
        /* Alternatively use could use printf for making the number look more formatted.
        You would write System.out.printf("BMI is: %.2f%n", bmi); this will however round off the number. */
        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi < 25) {
            System.out.println("Normal.");
        } else if (bmi < 30) {
            System.out.println("Overweight.");
        } else {
            System.out.println("Obese.");
        }

    }
}
