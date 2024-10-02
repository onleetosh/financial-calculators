/*
    A mortgage calculator - used to find out how much a monthly payment for a
    loan would be (minus an insurance or taxes), as well as how much interest
    you would pay over the life of the loan

 */

package com.pluralsight;

import java.util.Scanner;

public class Calculator1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //declare variables and prompt user for input
        double loanAmount = PromptForValues("Enter loan amount: ") ;
        double annualInterestRate = PromptForValues("Enter interest rate: ");
        double loanLength = PromptForValues("Enter loan length: ");


        //first: find the monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        //calculate the number of payments
        double numberOfPayments = loanLength *12;


        //formula: Compound interest = P [r(1+r)^n] / [(1+r)^n – 1]
        //P: is the principal amount
        //r: is the annual interest rate
        //n: is the number of compounding periods

        //find how much a monthly payment for loan would be
        double monthlyPaymentForLoan =  loanAmount * (monthlyInterestRate * Math.pow(1+ monthlyInterestRate, numberOfPayments)) / (Math.pow(1+ monthlyInterestRate, numberOfPayments) -1 );






        System.out.println("Display results:");
        System.out.printf("Your principle: $%.2f \n", loanAmount);
        System.out.printf("Your interest rate: $%.2f \n", annualInterestRate);
        System.out.printf("Your loan length: $%.2f \n", loanLength);
        System.out.printf("Your monthy payment for the loan: $%.2f \n", monthlyPaymentForLoan);


    }

    //method used to prompt user for values
    public static double PromptForValues(String prompt) {
        System.out.print(prompt);
        double number = input.nextDouble();
        input.nextLine();
        return  number;
    }

}
