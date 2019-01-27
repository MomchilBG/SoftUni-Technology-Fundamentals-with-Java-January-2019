package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetTrashes = Math.floor(lostGames / 2.0);
        double mouseTrashes = Math.floor(lostGames / 3.0);
        double keyboardTrashes = Math.floor(lostGames / 6.0);
        double displayTrashes = Math.floor(lostGames / 12.0);

        double headsetTotal = headsetPrice * headsetTrashes;
        double mouseTotal = mousePrice * mouseTrashes;
        double keyboardTotal = keyboardPrice * keyboardTrashes;
        double displayTotal = displayPrice * displayTrashes;

        double all = headsetTotal + mouseTotal + keyboardTotal + displayTotal;
        System.out.printf("Rage expenses: %.2f lv.", all);
    }
}
