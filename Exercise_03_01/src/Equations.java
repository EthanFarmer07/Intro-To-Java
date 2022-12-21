import java.util.Scanner;
/* This program prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.*/
public class Equations {
    public static void main(String[] args) {
        // Ask for user input.
        System.out.println("Enter a, b, c: ");

        // Create Scanner and get user input.
        Scanner scanner = new Scanner(System.in);
        // Assign input to variable.
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate equations.
        double discriminant = (Math.pow(b, 2) - 4*a*c);
        double r1 = (-b + Math.sqrt(discriminant) )/(2* a);
        double r2 = (-b - Math.sqrt(discriminant) )/(2* a);

        // If statement to determine what roots to return.
        if (discriminant > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + r1);
        } else if (discriminant < 0) {
            System.out.println("The equation had no real roots.");
        }
    }
}
