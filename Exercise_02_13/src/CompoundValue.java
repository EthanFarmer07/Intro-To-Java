import java.util.Scanner;

/* This program gets the information from the user about the balance of their saving account and
compounds their monthly interest plus 100 dollars every month for six months. */
public class CompoundValue {
    /* Main Method */
    public static void main(String[] args) {
        // Create a new scanner.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount.");
        double savingAmt = input.nextDouble();

        double annualInterestRate = .05;
        double monthlyInterestRate = (annualInterestRate/12);
        double total = savingAmt * (1 + monthlyInterestRate);

        System.out.printf("The saving account balance will be $%.2f in one month.\n", total);
        total = (total + 100) * (1 + monthlyInterestRate);
        System.out.printf("The saving account balance will be $%.2f in two months.\n", total);
        total = (total + 100) * (1 + monthlyInterestRate);
        System.out.printf("The saving account balance will be $%.2f in three months.\n", total);
        total = (total + 100) * (1 + monthlyInterestRate);
        System.out.printf("The saving account balance will be $%.2f in four months.\n", total);
        total = (total + 100) * (1 + monthlyInterestRate);
        System.out.printf("The saving account balance will be $%.2f in five months.\n", total);
        total = (total + 100) * (1 + monthlyInterestRate);
        System.out.printf("The saving account balance will be $%.2f in six months.\n", total);

        /*
        //Modified code for simplicity.
        // Create a new scanner.
        Scanner input = new Scanner(System.in);

        // Ask user for information.
        System.out.println("**This program will project the outcome of adding a desired amount to your savings account every " +
                "month, plus the monthly interest that would be added.**");
        System.out.println("Enter the amount of your savings account.");
        double savingBalance = input.nextDouble();
        System.out.println("Enter the monthly saving amount.");
        double monthlySavingAmt = input.nextDouble();
        System.out.println("Enter the amount of months to look forward?");
        int amtMonths = input.nextInt();

        // Vars for calculations.
        double annualInterestRate = .05;
        double monthlyInterestRate = (annualInterestRate/12);
        double total = savingBalance * (1 + monthlyInterestRate);

        for (int i = 1; i <= amtMonths; i++) {
            total  = (total + monthlySavingAmt) * (1 + monthlyInterestRate);
        }
        System.out.printf("The Saving account balance will be $%.2f in %s months.\n", total, amtMonths);
        */
    }
}
