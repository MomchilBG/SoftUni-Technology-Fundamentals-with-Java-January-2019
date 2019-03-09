package ExamPreparation;

import java.util.Scanner;

public class Pr01PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int companions = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        long coins = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 15 == 0) {
                companions += 5;
            }

            if (i % 10 == 0) {
                companions -= 2;
            }

            if (i % 3 == 0) {
                coins -= 3 * companions;
            }

            if (i % 5 == 0) {
                coins += 20 * companions;
                if (i % 3 == 0) {
                    coins -= 2 * companions;
                }
            }

            coins -= 2 * companions;
            coins += 50;
        }

        System.out.printf("%d companions received %d coins each.", companions, coins / companions);
    }
}
