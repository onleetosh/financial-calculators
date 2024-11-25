package com.pluralsight;

import java.util.Scanner;

public class Console {

    static Scanner input = new Scanner(System.in);

    //method used to prompt user for values
    public static double PromptForDouble(String prompt) {
        System.out.print(prompt);
        double number = input.nextDouble();
        input.nextLine();
        return  number;
    }

}
