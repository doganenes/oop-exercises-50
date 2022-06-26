import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example: 7.35: ");
        double annualInterestRate = scan.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = scan.nextInt();

        System.out.print("Enter loan amount, for example, 12000000.95: ");
        double loanAmount = scan.nextDouble();
        // Create a Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The monthly was created: " + loan.getLoanDate() + "\nthe total payment is: " + loan.getTotalPayment()
                + "\n" + loan.getLoanAmount() + "\n " + loan.getAnnualInterestRate());
    }

}
