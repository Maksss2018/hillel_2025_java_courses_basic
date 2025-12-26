package lesson6;

/**
 * @author Viktor Hevod
 */
public class ChatGptTasks {


    static void main() {

        /*
            Calculate and print the sum of numbers from 1 to N, where N is an int variable.
         */

//        int n = 10;
//        int result = 0;
//
//        for (int i = 1; i < n; i++) {
//            result = n + i;
//        }
//        System.out.println(result);


        /*
            Count positives, negatives, and zeros
         */

//        int[] a = new int[]{1, 2, 3, -78, -43534, 5545, 0, 574, 0, 4, 56, 42, -1, 0, -4, -5,};
//
//        int countOfZeros = 0;
//        int countOfPositives = 0;
//        int countOfNegatives = 0;
//
//        StringJoiner positivesStringJoiner = new StringJoiner(",");
//        StringJoiner negativesStringJoiner = new StringJoiner(",");
//        for (int element : a) {
//
//            if (element == 0) {
//                countOfZeros++;
//            } else if (element > 0) {
//                countOfPositives++;
//                positivesStringJoiner.add(String.valueOf(element));
//            } else {
//                countOfNegatives++;
//                negativesStringJoiner.add(String.valueOf(element));
//            }
//        }
//
//        System.out.printf("""
//                        countOfZeros = %d.
//                        countOfPositives = %d. [%s]
//                        countOfNegatives = %d. [%s]
//                        """,
//                countOfZeros,
//                countOfPositives, positivesStringJoiner,
//                countOfNegatives, negativesStringJoiner);

    /*
        Maximum value
     */

        int[] a = new int[]{1, 2, 3, -78, -43534, 5545, 0, 574, 0, 4, 56, 42, -1, 0, -4, -5,};

        int max = 0;
        for (int element : a) {
            max = Math.max(element, max);
        }
        System.out.println("max: " + max);
    }

}
