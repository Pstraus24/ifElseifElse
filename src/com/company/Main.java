// Write a program that has a variable named temperature and assign a value of between 92.0 and 104.0 to it.
// Get the temperature from the user.
// Using an else structure, determine if the temperature is low (below 97.5), normal (between 97.5 and 99.5
// ) or high (over 99.5). Display to the screen text that indicates what the temperature is, and if it is high,
// low, or normal. Make sure to test the program with each of the three possible value ranges to make sure that
// it works.


package com.company;

import java.util.Scanner;// import package for user input

public class Main {
    public static void main(String[] args) {
        // initialize variables
        double temperature;
        // initialize scanner for user input (temperature)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");// prompt user for any temperature
        temperature = scanner.nextDouble();
        // check range of temperature low, normal or high
        if ((temperature > 91.9) & (temperature < 97.5)) {
            System.out.println("The entered temperature of " + temperature + " is low");
        }
        else if ((temperature >= 97.5) & (temperature <= 99.5)) {
            System.out.println("The entered temperature of " + temperature + " is normal");
        }
        else if ((temperature > 99.5) & (temperature < 104.1)) {
            System.out.println("The entered temperature of " + temperature + " is high");
        }
        // display error message if out of range (92.0 - 104.0)
        else{
            System.out.println("Out of range");
        }

    }
}