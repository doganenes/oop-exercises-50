public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000); // referred other constructor

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // calculations
    public double getMonthlyPayment() {

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    // find total payment
    public double getTotalPayment() {

        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;

    }

    /* return loanDate */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
