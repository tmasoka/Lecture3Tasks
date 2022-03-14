
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculation {
    public static void main(String[] args) throws IOException {

        float height, weight, BMI;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        height = Float.parseFloat(br.readLine()) / 100;
        System.out.println("Enter your weight in cm (and press Enter): ");
        weight = Float.parseFloat(br.readLine());

        BMI = (float) (weight / (Math.pow(height, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", BMI);

        if (BMI < 16) {
            System.out.println("You are starving");
        } else if ((BMI >= 16) && (BMI < 16.99)) {
            System.out.println("You are emancipated");
        } else if ((BMI >= 17) && (BMI < 18.49)) {
            System.out.println("You are underweight");
        } else if ((BMI >= 18.50) && (BMI < 22.99)) {
            System.out.println("You are normal, but low range");
        } else if ((BMI >= 23) && (BMI < 24.99)) {
            System.out.println("You are normal, but high range");
        } else if ((BMI >= 25) && (BMI < 27.49)) {
            System.out.println("You are overweight, low range");
        } else if ((BMI >= 27.50) && (BMI < 29.99)) {
            System.out.println("You are overweight, high range");
        } else if ((BMI >= 30) && (BMI < 34.99)) {
            System.out.println("1st degree obesity");
        } else if ((BMI >= 35) && (BMI < 35.99)) {
            System.out.println("2nd degree obesity");
        } else if ((BMI >= 40)) {
            System.out.println("3rd degree obesity");
        }
    }
}



