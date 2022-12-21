import java.util.Scanner;

public class areaHexagon {
    public static void main(String[] args) {
        // Create new scanner.
        Scanner scanner = new Scanner(System.in);

        // Prompt user for length of a side.
        System.out.print("Enter the side length: ");
        double s = scanner.nextDouble();

        // Compute the area.
        double area = (6 * Math.pow(s,2))/(4 * Math.tan((Math.PI / 6)));

        // Send output to console.
        System.out.printf("The area of the hexagon is: %.2f ", area);
    }
}
