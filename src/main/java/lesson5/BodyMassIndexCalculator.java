package lesson5;

import java.util.Scanner;

import static java.lang.IO.println;

/**
 * @author Viktor Hevod
 */
public class BodyMassIndexCalculator {


    static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        println("entre your mass in KG");
        int mass = scanner.nextInt();
        println("entre your high in CM");
        double high = scanner.nextDouble();
        double bmi = mass / Math.pow(high, 2);
        println("your BMI is " + bmi);

        switch (bmi) {
            case double v when v < 16.0 -> println("Underweight");
            case double v when v < 17.0 -> println("Underweight (Moderate thinness)");
            case double v when v < 18.5 -> println("Underweight (Mild thinness)");
            case double v when v < 25 -> println("Normal range");
            case double v when v < 30 -> println("Overweight (Pre-obese)");
            case double v when v < 35 -> println("Obese (Class I)");
            case double v when v < 40 -> println("Obese (Class I)");
            default -> println("Obese (Class III)");
        }


    }
}
