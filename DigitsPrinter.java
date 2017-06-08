package lesson4;

public class DigitsPrinter {
    public static void main(String[] args) {

        int number = 1245;

        if (number < 0) {
            System.out.print(" - ");
            number *= -1;
        }

        int digits;

        for (digits = 10; (number / digits) > 0; digits *= 10);


        while (digits >= 10) {
            System.out.print((number % digits) / (digits / 10) + " ");
            digits /= 10;
        };

    }
}
