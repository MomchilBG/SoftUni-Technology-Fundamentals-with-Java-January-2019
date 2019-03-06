package L02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class Pr01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            if (Integer.getInteger(input) != null) {
                System.out.printf("%s is integer type%n", input);
                continue;
            }

            try {
                Integer integer = Integer.valueOf(input);
                System.out.printf("%s is integer type%n", input);
                continue;
            } catch (NumberFormatException e) {
            }

            try {
                Double aDouble = Double.valueOf(input);
                System.out.printf("%s is floating point type%n", input);
                continue;
            } catch (NumberFormatException e) {
            }

            if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
                continue;
            }

            if ("false".equalsIgnoreCase(input) || "true".equalsIgnoreCase(input)) {
                System.out.printf("%s is boolean type%n", input);
                continue;
            }

            System.out.printf("%s is string type%n", input);
        }
    }
}
