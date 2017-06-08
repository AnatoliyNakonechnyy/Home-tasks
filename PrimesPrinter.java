package lesson4;

import java.util.Scanner;

public class PrimesPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter from: ");
        int from = scanner.nextInt();

        System.out.println("Enter to: ");
        int to = scanner.nextInt();

        if (from > 1 && to > 1 && to > from) {

            for (int i = from; i <= to; i++) {

                boolean isSimple = true;

                for (int k = 1; k <= i; k++) {

                    if (i % k == 0 && k != 1 && k != i) {
                        isSimple = false;
                    }
                }

                if (isSimple) {
                    System.out.print(i + ", ");
                }

            }

        } else {
            System.out.println("IllegalArgumentException");
        }

    }
}
