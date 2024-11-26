/**
 * Calculator 3: Used to find the present value of an ordinary annuity.
 * For instance, to fund an annuity that pays $3,000 per month for 20 years and earns an expected 2.5% interest,
 * you would need to invest $566,141.46 today.
 *
 */

package com.pluralsight;

public class PresentValueCalculator {

    public static void main(String[] args) {
        
        //declare variables and prompt user for input
        double monthlyPayout = Console.PromptForDouble("Enter monthly payout amount ");
        double interestRate = Console.PromptForDouble("Enter annual interest rate ");
        double numberOfYears = Console.PromptForDouble("Enter the number of years ");


        // calculate the monthly interest rate
        double monthlyInterestRatePercentageValue = (interestRate / 100) / 12;

        // calculate total number of payments
        double totalPayments = numberOfYears * 12;

        // calculate present value using the formula
        double presentValue = monthlyPayout *
                (1 - Math.pow(1 + monthlyInterestRatePercentageValue, -totalPayments)) /
                monthlyInterestRatePercentageValue;

        // display results
        System.out.println("\n--- Annuity Details ---");
        System.out.printf("Monthly Payout: $%.2f%n", monthlyPayout);
        System.out.printf("Annual Interest Rate: %.2f%%%n", interestRate);
        System.out.printf("Number of Years: %.2f%n", numberOfYears);
        System.out.printf("Present Value (Investment Needed): $%.2f%n", presentValue);
    }

}
