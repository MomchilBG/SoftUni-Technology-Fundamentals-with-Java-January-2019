package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String people = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        if ("Students".equalsIgnoreCase(people)) {
            if ("Friday".equalsIgnoreCase(day)) {
                price = 8.45 * numberOfPeople;
            } else if ("Saturday".equalsIgnoreCase(day)) {
                price = 9.8 * numberOfPeople;
            } else if ("Sunday".equalsIgnoreCase(day)) {
                price = 10.46 * numberOfPeople;
            }
            if (numberOfPeople >= 30) {
                price *= 0.85;
            }
        } else if ("Business".equalsIgnoreCase(people)) {
            if (numberOfPeople >= 100) {
                numberOfPeople -= 10;
            }
            if ("Friday".equalsIgnoreCase(day)) {
                price = 10.9 * numberOfPeople;
            } else if ("Saturday".equalsIgnoreCase(day)) {
                price = 15.6 * numberOfPeople;
            } else if ("Sunday".equalsIgnoreCase(day)) {
                price = 16.0 * numberOfPeople;
            }
        } else if ("Regular".equalsIgnoreCase(people)) {
            if ("Friday".equalsIgnoreCase(day)) {
                price = 15 * numberOfPeople;
            } else if ("Saturday".equalsIgnoreCase(day)) {
                price = 20 * numberOfPeople;
            } else if ("Sunday".equalsIgnoreCase(day)) {
                price = 22.5 * numberOfPeople;
            }
            if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                price *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
