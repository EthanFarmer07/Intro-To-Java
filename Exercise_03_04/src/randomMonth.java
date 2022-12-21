import java.lang.Math;
public class randomMonth {
    public static void main(String[] args) {
        // Random number between 1 and 10.
        int month = (int) ((Math.random()*12)+1);

        System.out.println("This is the random number that was generated: " + month);

        // Declare a switch for outputting what month based on the random number.
        switch (month) {
            case 1:System.out.println("January"); break;
            case 2:System.out.println("February"); break;
            case 3:System.out.println("March"); break;
            case 4:System.out.println("April"); break;
            case 5:System.out.println("May"); break;
            case 6:System.out.println("June"); break;
            case 7:System.out.println("July"); break;
            case 8:System.out.println("August"); break;
            case 9:System.out.println("September"); break;
            case 10:System.out.println("October"); break;
            case 11:System.out.println("November"); break;
            case 12:System.out.println("December"); break;
        }
    }
}
