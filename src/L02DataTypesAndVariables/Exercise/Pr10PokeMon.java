package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int half = (pokePower * 50) / 100;

        while (distance <= pokePower) {
            pokePower -= distance;
            count++;
            if (half == pokePower) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.printf("%d%n%d", pokePower, count);
    }
}
