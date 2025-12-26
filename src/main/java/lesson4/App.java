package lesson4;

import java.util.Scanner;

/**
 * @author Viktor Hevod
 */
public class App {

    static void main() {

//        int i1 = 48;
//        int i2 = 47;
//
//        int resultAddition = i1 + i2; // addition
//        int resultSubstraction = i1 - i2; // substraction
////      byte = 8bi = 1b
////      short = 16bi = 2b
////      int = 32bi = 4b
////      long = 64bi  = 8b
//        // float = 32bi = 4b
//        // double = 64bi = 8b
//        // byte -> short -> int -> long -> double
////                              -> float
////                32 bi = 64 bi
//        double resultDivision = ((double) i1 / (double) i2); // division int -> double
//        System.out.printf("result of addition is %d \n", resultAddition); // concatenation
//        System.out.printf("result of substraction is %d \n", resultSubstraction); // concatenation
//        System.out.printf("result of division is %.4f \n", resultDivision); // concatenation

//        int ten = 9;
//        int five = 5;
//        int two = 2;
//
//
//        int result = ten % two;
//        boolean isEven = (result == 0);
//        IO.println(isEven);

//        char otherSymbol = 65; // char -> sting
//        System.out.println("symbol is" + otherSymbol);

//        int i = 42;
//        int j = 47;
//
//        //prefix incr/decr
//
//        //1. add: i =  42 + 1
//        //2. assign: result = i
//        int resultAddition = ++i;
//        IO.println(i);
//        IO.println(resultAddition);
//
//        //1. Substraction: j =  47 - 1
//        //2. assign: resultSubstraction = j
//        int resultSubstraction = --j;
//        IO.println(j);
//        IO.println(resultSubstraction);

        //postfix incr/decr

        long a = 42L;
        int b = 47;
        //1. a --> a1
        //2. add: a = a + 1
        //3. resultIncrPost = a1

        long resultIncrPost = a++;
        IO.println(a);
        IO.println(resultIncrPost);

        //1. b --> b1
        //2. add: b = b + 1
        //3. resultIncrPost = b1
        int resultDecrPost = b--;
        IO.println(b);
        IO.println(resultDecrPost);


        var b1 = 42;
        var a1 = 47;
        var c = 98;
        var d = 43;
        b1 += ++c;
        b1 += 1;  // b1 = b1 + 42
        IO.println(b1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        String i1 = scanner.next();

        if (!i1.matches("\\d+")) {
            System.out.println("not integer");
            return;
        }
        System.out.println("enter the second number");
        int i2 = scanner.nextInt();
        System.out.printf("result: %d", i1 + i2);

    }
}
