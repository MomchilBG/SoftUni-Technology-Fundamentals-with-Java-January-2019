package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine().trim().replaceAll("[+-]", "");

        System.out.println(multiplyEvenByOdds(number));
    }

    private static long sumOfDigits(String number, boolean even) {
        int expected = even ? 0 : 1;
        long sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int currentNum = number.charAt(i) - '0';

            if (currentNum % 2 == expected) {
                sum += currentNum;
            }
        }

        return sum;
    }

    private static long multiplyEvenByOdds(String number) {
        long evenSum = sumOfDigits(number, true);
        long oddSum = sumOfDigits(number, false);
        return evenSum * oddSum;
    }
}
