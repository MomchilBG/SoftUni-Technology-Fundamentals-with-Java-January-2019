package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        System.out.println(characters(firstSymbol, secondSymbol).trim());
    }

    private static String characters(char firstSymbol, char secondSymbol) {

        StringBuilder result = new StringBuilder();

        char start = firstSymbol;
        char end = secondSymbol;

        if (secondSymbol < firstSymbol) {
            start = secondSymbol;
            end = firstSymbol;
        }

        while (++start < end) {
            result.append(start).append(" ");
        }


        return result.toString();
    }
}