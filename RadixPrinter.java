package lesson4;

import java.util.Scanner;

public class RadixPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Enter radix: ");
        int radix = scanner.nextInt();

        if (radix > 1 && radix < 10) {
            if (n > 0) {

                String stringNumber = "";
                int tempResult = n;

                do {
                    stringNumber = tempResult % radix + stringNumber;
                    tempResult /= radix;
                } while (tempResult >= radix);

                stringNumber = tempResult + stringNumber;

                System.out.println(stringNumber);

            } else {
                System.out.println("IllegalArgumentException");
            }
        } else {
            System.out.println("IllegalArgumentException");
        }

    }
}
