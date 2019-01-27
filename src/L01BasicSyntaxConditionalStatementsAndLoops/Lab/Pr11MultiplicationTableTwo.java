package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Pr11MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplicator = Integer.parseInt(scanner.nextLine());
        while (multiplicator <= 10) {
            System.out.printf("%d X %d = %d%n", number, multiplicator, number * multiplicator);
            multiplicator++;
        }
        if (multiplicator > 11) {
            System.out.printf("%d X %d = %d", number, multiplicator, number * multiplicator);
        }
    }
}
