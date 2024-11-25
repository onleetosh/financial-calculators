/**
 A mortgage calculator - used to find out how much a monthly payment for a
 loan would be (minus an insurance or taxes), as well as how much interest
 you would pay over the life of the loan
 **/


package com.pluralsight;

public class MortgageCalculator {

    public static void main(String[] args) {

        //declare variables and prompt user for input
        double loanAmount = Console.PromptForDouble("Enter loan amount: ") ;
        double annualInterestRate = Console.PromptForDouble("Enter interest rate: ");
        double loanLength = Console.PromptForDouble("Enter loan length: ");


        // dalculate the monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // calculate the number of payments
        double numberOfPayments = loanLength * 12;

        // calculate the monthly payment
        double monthlyPaymentForLoan = loanAmount *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // calculate the total payment and total interest
        double totalPayment = monthlyPaymentForLoan * numberOfPayments;
        double totalInterest = totalPayment - loanAmount;

        // display results
        System.out.println("\n--- Loan Details ---");
        System.out.printf("Loan Amount: $%.2f%n", loanAmount);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualInterestRate);
        System.out.printf("Loan Length: %.2f years%n", loanLength);
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPaymentForLoan);
        System.out.printf("Total Payment: $%.2f%n", totalPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);


    }
}
