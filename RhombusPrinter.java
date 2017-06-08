package lesson4;
import java.util.Scanner;

public class RhombusPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = scanner.nextInt();

        if (size > 2 && (size % 2 != 0)) {

            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    System.out.print(((y == x + size / 2) || (y == x - size / 2) || (y == -x + size / 2) || (y == -x + size  + size / 2 - 1)) ? "*" : ".");
                }
                System.out.println("");
            }
        } else {
            System.out.println("IllegalArgumentException");
        }
    }
}
