package lesson5.hw;

/**
 * @author Viktor Hevod
 */
public class App {


    static void main() {

        String template = "Tax rate for income %.2f is %.2f%%. Calculated taxes: %.2f";
        int firstGroupThreshold = 10_000;
        int secondGroupThreshold = 25_000;

        double firstGroupTaxRate = 2.5;
        double secondGroupTaxRate = 4.3;
        double thirdGroupTaxRate = 6.7;

        int hundred = 100;

        String userInput = IO.readln("enter you income:");
        double income = Double.parseDouble(userInput);


        double taxRate = switch (income) {
            case double i when i < firstGroupThreshold -> firstGroupTaxRate;
            case double i when i < secondGroupThreshold -> secondGroupTaxRate;
            default -> thirdGroupTaxRate;
        };

        double taxes = income / hundred * taxRate;
        System.out.printf(template, income, taxRate, taxes);

    }
}
