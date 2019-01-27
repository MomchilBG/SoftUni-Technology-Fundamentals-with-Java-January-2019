package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Pr10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplicator = 0;
        while (multiplicator < 10) {
            multiplicator++;
            System.out.printf("%d X %d = %d%n", number, multiplicator, number * multiplicator);
        }
    }
}
