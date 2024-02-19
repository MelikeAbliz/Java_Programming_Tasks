package week03;

public class MortgageCalculator {
    public static void main(String[] args) {
        double loanAmount = 600_000;
        int loanTermInYears = 30;
        String loanType = "FHA";

        double today_30_years_fixed_rate = 7.5;
        double today_15_years_fixed_rate = 6.9;
        double today_30_years_fha_rate = 7.24;
        double today_15_years_fha_rate = 6.62;
        double today_30_years_va_rate =  6.5;
        double today_15_years_va_rate =  5.99;

        double annualInterestRate = 0;

        switch (loanType) {
            case "Fixed":
                switch (loanTermInYears) {
                    case 30:
                        annualInterestRate = today_30_years_fixed_rate;
                        break;
                    case 15:
                        annualInterestRate = today_15_years_fixed_rate;
                        break;
                }
                break;

            case "FHA":
                switch (loanTermInYears) {
                    case 30:
                        annualInterestRate = today_30_years_fha_rate;
                        break;
                    case 15:
                        annualInterestRate = today_15_years_fha_rate;
                        break;
                }
                break;

            case "VA":
                switch (loanTermInYears) {
                    case 30:
                        annualInterestRate = today_30_years_va_rate;
                        break;
                    case 15:
                        annualInterestRate = today_15_years_va_rate;
                        break;
                }
                break;

            default:
                System.err.println("Invalid loan type");
                System.exit(1);
        }


        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Loan amount: $" + loanAmount);
        System.out.println("Annual Interest Rate for " + loanTermInYears +" years " +loanType +" loan is " + annualInterestRate + "%");
        System.out.println("Your monthly mortgage payment  is: $" + Math.round(monthlyPayment) );

    }
}
/*
3. Create a Java class named MortgageCalculator with the following requirements:

	Define the following variables:

		loanAmount: Represents the loan amount.
		loanTermInYears: Represents the loan term in years.
		loanType: Represents the type of loan.

	Determine the annual interest rates for different loan types:

			Fixed:
				30 years: 7.5%
				15 years: 6.9%

			FHA:
				30 years: 7.24%
				15 years: 6.62%

			VA:
				30 years: 6.75%
				15 years: 5.99%

	Write a program to calculate the monthly mortgage payment using the following formula:

		monthlyInterestRate = annualInterestRate / 100 / 12
		numberOfPayments = loanTermInYears * 12
		monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))


	Display the output in the following format:

			Example 1:
				loanAmount = $500,000
				loanTermInYears = 30
				loanType = "Fixed"

			Output:
				Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00


	Ensure that the program accurately calculates the monthly mortgage payment based on the
	specified loan amount, term, and type.
 */