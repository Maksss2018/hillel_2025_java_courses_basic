package lesson5;

import java.util.Scanner;

/**
 * @author Viktor Hevod
 */
public class App {
    static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        IO.println("enter your age pls.");
        int age = scanner.nextInt();

        int teenagerDiscount = 5;
        int oldPersonDiscount = 10;
        int oldOldPersonDiscount = 15;

//        if (age < 18) {
//            System.out.println("Discount %d%% is applicable".formatted(teenagerDiscount));
//        } else if (age >= 60) {
//            System.out.println("Discount %d%% is applicable".formatted(oldPersonDiscount));
//        } else {
//            System.out.println("Discount is not applicable. Your age is above 18 and below 60");
//        }


//        int discount = age < 18
//                ? teenagerDiscount
//                : age >= 60 && age < 80
//                ? oldPersonDiscount
//                : age > 80
//                ? oldOldPersonDiscount : 0;
//
//        if (discount == 0) {
//            System.out.println("Discount is not applicable.");
//        } else {
//            System.out.println("your discount is %d".formatted(discount));
//        }

        var discount = switch (age) {
            case int a when a < 18 -> teenagerDiscount;
            case int a when a > 80 -> oldOldPersonDiscount;
            case int a when a > 60 -> oldPersonDiscount;
            default -> 0;
        };
        System.out.println("your discount is %d".formatted(discount));




    }
}
