/* Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number.*/

import java.util.Scanner;

public class decToHex {
    public static void main(String[] args) {
        // Implement a new scanner.
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number between 0 and 15.
        System.out.print("Enter a decimal value between 0 and 15: ");
        int decimal = scanner.nextInt();

        // Compute the hexadecimal value for the user entered decimal value.
        if (decimal >= 0 && decimal <= 9)
            System.out.println("The hex value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        // If the user value is not a valid decimal value it will display "Invalid input".
        else
            System.out.println(decimal + " is an invalid input");
    }
}
