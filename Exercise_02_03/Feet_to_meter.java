// (This program converts feet into meters.)

import java.util.Scanner; // Import scanner utility.

public class Feet_to_meter 
{
	public static void main(String[] args)
	{
		// Declare a Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declaring constant for one foot to a meter.
		final double METER_PER_FOOT = 0.305;
		
		
		// Prompt user to input feet.
		System.out.print("Enter value for feet: ");
		double feet = input.nextDouble();
		
		// Calculate feet to meters.
		double meter = feet * METER_PER_FOOT;
		
		// Display result in meters.
		System.out.println(feet + " feet is " + meter );
		
	}
}