package ExamPreparation;

import java.util.Scanner;

public class Pr02DungeonestDark {

    private static final int MAX_HEALTH = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean alive = true;
        int health = MAX_HEALTH;
        long coins = 0;
        String[] input = scanner.nextLine().split("[| ]");
        int roomsPassed = 0;

        for (int i = 0; i < input.length; i += 2) {
            roomsPassed++;
            String type = input[i];
            int value = Integer.parseInt(input[i + 1]);
            if ("potion".equalsIgnoreCase(type)) {

                int newHealth = health + value;

                if (newHealth > MAX_HEALTH) {
                    newHealth = MAX_HEALTH;
                }

                int healedHp = newHealth - health;
                health = newHealth;
                System.out.printf("You healed for %d hp.%n", healedHp);
                System.out.printf("Current health: %d hp.%n", health);
            } else if ("chest".equalsIgnoreCase(type)) {
                System.out.printf("You found %d coins.%n", value);
                coins += value;
            } else {
                health -= value;
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n", type);
                    alive = false;
                    break;
                } else {
                    System.out.printf("You slayed %s.%n", type);
                }
            }
        }
        if (alive) {
            System.out.printf("You've made it!%nCoins: %d%nHealth: %d", coins, health);
        } else {
            System.out.printf("Best room: %d", roomsPassed);
        }
    }
}