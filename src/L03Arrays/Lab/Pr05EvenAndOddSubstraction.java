package L03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Pr05EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                oddSum += numbers[i];
            } else {
                evenSum += numbers[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
