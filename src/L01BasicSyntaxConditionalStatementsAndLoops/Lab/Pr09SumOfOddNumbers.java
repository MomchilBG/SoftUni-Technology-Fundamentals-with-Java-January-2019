package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Pr09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfOddNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNumber = 0;

        while (amountOfOddNumbers > 0) {
            currentNumber++;
            if (currentNumber % 2 == 1) {
                System.out.println(currentNumber);
                amountOfOddNumbers--;
                sum += currentNumber;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
