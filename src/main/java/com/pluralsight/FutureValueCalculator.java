/**
 * Calculator 2: Used to find the future value of a one-time deposit, assuming compound interest.
 * This calculator assists you in calculating the maturity value of a Certificate of Deposit (CD).
 * For instance, if you deposit $1,000 in a CD that earns an annual interest rate of 1.75 and matures in 5 years,
 * the CD’s ending balance will be $1,092.62. Additionally, you would have earned $92.62 in interest.
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
