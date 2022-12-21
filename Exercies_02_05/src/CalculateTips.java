import java.util.Scanner;

/* This program reads the subtotal and the gratuity rate, then computes the gratuity and total. */
public class CalculateTips {
    /* Main Method */
    public static void main(String[] args) {
        // Create a new scanner and prompts the user to enter subtotal and gratuity.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // Calculates gratuity and total.
        double gratuity = subtotal * (gratuityRate / 100);
        double total = (subtotal + gratuity);

        // Gives answer to the amount for gratuity and the final total.
        System.out.printf("The gratuity is $%.2f and the final total is $%.2f", gratuity, total);
    }
}
