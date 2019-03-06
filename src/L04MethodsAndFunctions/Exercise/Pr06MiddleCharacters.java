package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().trim();

        System.out.println(getMiddleChars(text));
    }

    private static String getMiddleChars(String text) {
        String midChars = "";
        char mid;
        int middleCharsPosition;

        if (text.length() % 2 == 0) {
            middleCharsPosition = text.length() / 2;
            mid = text.charAt(middleCharsPosition - 1);
            midChars += mid;
            mid = text.charAt(middleCharsPosition);
            midChars += mid;
        } else {
            middleCharsPosition = text.length() / 2;
            mid = text.charAt(middleCharsPosition);
            midChars += mid;
        }

        return midChars;
    }
}
