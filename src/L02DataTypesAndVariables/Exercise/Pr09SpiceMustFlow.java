package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spice = Integer.parseInt(scanner.nextLine());
        long extracted = -0L;
        int days = 0;

        while (spice >= 100) {
            extracted += spice;
            spice -= 10;
            if (extracted >= 26) {
                extracted -= 26;
            }
            days++;
        }

        if (extracted >= 26) {
            extracted -= 26;
        }
        System.out.printf("%d%n%d", days, extracted);
    }
}
