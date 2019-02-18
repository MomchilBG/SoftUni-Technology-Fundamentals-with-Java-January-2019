package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfVariable = scanner.nextLine();

        if ("int".equalsIgnoreCase(typeOfVariable)) {
            System.out.println(greaterInt(scanner));
        } else if ("char".equalsIgnoreCase(typeOfVariable)) {
            System.out.println(greaterChar(scanner));
        } else {
            System.out.println(greaterString(scanner));
        }

    }

    private static int greaterInt(Scanner scanner) {
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    private static char greaterChar(Scanner scanner) {
        char firstCharacter = scanner.nextLine().charAt(0);
        char secondCharacter = scanner.nextLine().charAt(0);

        if (firstCharacter > secondCharacter) {
            return firstCharacter;
        } else {
            return secondCharacter;
        }
    }

    private static String greaterString(Scanner scanner) {
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}
