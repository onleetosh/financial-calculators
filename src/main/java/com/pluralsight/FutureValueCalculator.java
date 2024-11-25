/**
 * A calculator that determines the future value of a one-time deposit assuming compound interest.
 * This calculator is used to help you decide how much a CD will be worth when it matures.
 */


package com.pluralsight;

public class FutureValueCalculator {

    public static void main(String[] args){

        //declare variables and prompt user for input
        double deposit = Console.PromptForDouble("Enter deposit amount ");
        double interestRate = Console.PromptForDouble("Enter the annual interest Rate " );
        double numberOfYears = Console.PromptForDouble("Enter number of years ");


        // calculate the interest rate
        double interestRatePercentageValue = interestRate / 100;

        // calculate future value
        double futureValue = deposit * Math.pow(1 + interestRatePercentageValue, numberOfYears);

        // calculate interest earned
        double interestEarned = futureValue - deposit;

        // display results
        System.out.println("\n--- CD Details ---");
        System.out.printf("Deposit Amount: $%.2f%n", deposit);
        System.out.printf("Annual Interest Rate: %.2f%%%n", interestRate);
        System.out.printf("Number of Years: %.2f%n", numberOfYears);
        System.out.printf("Future Value: $%.2f%n", futureValue);
        System.out.printf("Interest Earned: $%.2f%n", interestEarned);

    }
}
