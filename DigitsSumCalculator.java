package lesson4;

import java.util.Scanner;

public class DigitsSumCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eneter from: ");
        int from = scanner.nextInt();

        System.out.println("Enter to: ");
        int to = scanner.nextInt();

        int total = 0;

        if (from <= to) {
            for (int i = from; i <= to; i++) {

                int number = i;

                if (number < 0) {
                    number *= -1;
                }

                int digits;

                for (digits = 10; (number / digits) > 0; digits *= 10) ;

                while (digits >= 10) {
                    total += ((number % digits) / (digits / 10));
                    digits /= 10;
                }
                ;

            }

            System.out.println(total);

        }else {
            System.out.println("IllegalArgumentException");
        }

    }
}
