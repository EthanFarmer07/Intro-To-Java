import java.util.Scanner;

public class MajorAndStatus {
    public static void main(String[] args){
        // Create a new Scanner.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the characters.
        System.out.print("Enter two characters(One letter and one number): ");
        String input = scanner.nextLine();

        // Extract the major and status from the string.
        char major = Character.toUpperCase(input.charAt(0));
        char status = input.charAt(1);

        // Switch statements to decide if the major is a valid character.
        switch(major)
        {
            case 'M': System.out.print("Mathematics, "); break;
            case 'C': System.out.print("Computer Science, "); break;
            case 'I': System.out.print("Information Technology, "); break;
            default : System.out.println("Invalid input");
                System.exit(1);
        }

        switch(status)
        {
            case '1': System.out.println("Freshman"); break;
            case '2': System.out.println("Sophomore"); break;
            case '3': System.out.println("Junior"); break;
            case '4': System.out.println("Senior"); break;
            default : System.out.println("Invalid input");
        }

        //System.out.print("The entered letter was " + major + " and number was " + status);
    }
}
