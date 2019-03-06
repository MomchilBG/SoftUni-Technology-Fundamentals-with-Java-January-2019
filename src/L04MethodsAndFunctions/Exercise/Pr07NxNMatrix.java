package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parameter = Integer.parseInt(scanner.nextLine());

        matrix(parameter);
    }

    private static void matrix(int parameter) {
        for (int i = 0; i < parameter; i++) {
            for (int j = 0; j < parameter; j++) {
                System.out.print(parameter + " ");
            }
            System.out.println();
        }
    }
}
