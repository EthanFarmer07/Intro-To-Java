/* Write a program that prompts the user to enter a hexadecimal between
0 and F and displays its corresponding binary number.*/

import java.util.Scanner;

public class hexToBin {
    public static void main(String[] args) {

        // Implement a new scanner.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a hexadecimal number.
        System.out.print("Enter a hex digit: ");
        String digit = scanner.nextLine();

        // Check if the string is exactly one character.
        if (digit.length() != 1) {
            System.out.println("You must enter only one character.");
            System.exit(1);
        }

        // Get digit to char.
        char ch = Character.toUpperCase(digit.charAt(0));
        int value = 0;
        if (ch >= 'A' && ch <= 'F')
        {
            value = ch - 'A' + 10;
        }
        else if (Character.isDigit(ch)) {
            value = ch - '0';
        }
        else {
            System.out.println(ch + " is and invalid input");
        }
        System.out.println("The binary value is " + Integer.toBinaryString(value));

        /*
        switch(ch)
        {
            case '0': System.out.println(0000); break;
            case '1': System.out.println(0001); break;
            case '2': System.out.println(0010); break;
            case '3': System.out.println(0011); break;
            case '4': System.out.println(0100); break;
            case '5': System.out.println(0101); break;
            case '6': System.out.println(0110); break;
            case '7': System.out.println(0111); break;
            case '8': System.out.println(1000); break;
            case '9': System.out.println(1001); break;
            case 'A': System.out.println(1010); break;
            case 'B': System.out.println(1011); break;
            case 'C': System.out.println(1100); break;
            case 'D': System.out.println(1101); break;
            case 'E': System.out.println(1110); break;
            case 'F': System.out.println(1111); break;
        }
        */
    }
}
