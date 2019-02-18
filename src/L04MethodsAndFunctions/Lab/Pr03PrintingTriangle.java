package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr03PrintingTriangle {
    public static void main(String[] args) {
        drawing();
    }

    private static void drawing() {
        Scanner scanner = new Scanner(System.in);
        int hugeness = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < hugeness; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = hugeness; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
