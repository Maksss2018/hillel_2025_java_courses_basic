package lesson6;

/**
 * @author Viktor Hevod
 */
public class App {

    static void main() throws InterruptedException {


        String format = "%d x %d = %d" + System.lineSeparator();
        String input = IO.readln("enter the the level (1,2 or 3): ");
        int threshold;
        int sleep;
        switch (input) {
            case "1" -> {
                threshold = 3;
                sleep = 5000;
            }
            case "2" -> {
                threshold = 7;
                sleep = 4000;
            }
            case "3" -> {
                threshold = 9;
                sleep = 2000;
            }
            default -> throw new IllegalArgumentException("invalid input");
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i > threshold) {
                    return;
                }
                Thread.sleep(sleep);
                System.out.printf(format, i, j, i * j);
            }
            IO.println("-----------------------");
        }

//        int[] a = new int[]{1, 2, 3, 4, 56, 42};

//        int currentIndex = 0;
//        for (int element : a) {
//            System.out.println("currentElement is: " + element + " on index " + currentIndex);
//            currentIndex++;
//        }


//        int count = 0;
//        while (true) {
//            if (count == 5) {
//                return;
//            }
//            System.out.println(count + ". hello world");
//            Thread.sleep(200);
//            count++;
//        }

        //        int count = 0;
//        do {
//            System.out.println(count + ". hello world");
//            Thread.sleep(200);
//            count++;
//        }
//        while (count < 0);

//        for (int i = 0; i < 20; i++) {
//            if (i % 2 == 0) {
//                continue;
//            } else {
//                System.out.println(i + " is odd");
//            }
//        }


    }

}
