package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeats = Integer.parseInt(scanner.nextLine());
        String result = "";

        System.out.println(repeating(text, repeats, result));
    }

    private static String repeating(String text, int repeats, String result) {
        StringBuilder resultBuilder = new StringBuilder(result);
        for (int i = 0; i < repeats; i++) {
            resultBuilder.append(text);
        }
        result = resultBuilder.toString();
        return result;
    }
}
