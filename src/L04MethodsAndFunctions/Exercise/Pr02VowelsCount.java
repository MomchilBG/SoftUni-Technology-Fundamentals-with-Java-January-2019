package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(vowels(text));
    }

    private static int vowels(String text) {
        int vowelCounter = 0;
        char letter;

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);

            if ('a' == letter || 'e' == letter || 'i' == letter || 'o' == letter || 'u' == letter || 'y' == letter ||
                    'A' == letter || 'E' == letter || 'I' == letter || 'O' == letter || 'U' == letter || 'Y' == letter) {
                vowelCounter++;
            }

        }

        return vowelCounter;
    }
}
