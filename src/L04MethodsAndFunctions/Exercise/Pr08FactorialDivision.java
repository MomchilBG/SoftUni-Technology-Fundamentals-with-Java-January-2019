package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorialOne = Integer.parseInt(scanner.nextLine());
        int factorialTwo = Integer.parseInt(scanner.nextLine());

        factorial(factorialOne, factorialTwo);
    }

    private static void factorial(int factorialOne, int factorialTwo) {

        double sumOne = 1;
        double sumTwo = 1;

        for (int i = 1; i <= factorialOne; i++) {
            sumOne *= i;
        }

        for (int i = 1; i <= factorialTwo; i++) {
            sumTwo *= i;
        }

        System.out.printf("%.2f", sumOne / sumTwo);
    }
}
