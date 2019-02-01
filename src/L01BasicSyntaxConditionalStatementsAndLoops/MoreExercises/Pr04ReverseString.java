package L01BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class Pr04ReverseString {
    public static void main(String[] args) {
        // System.out.println(new StringBuilder(new Scanner(System.in).nextLine()).reverse().toString()); // :-P

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String reversed = "";

        for (int i = 0; i < string.length(); i++) {
            reversed += string.charAt(string.length() - i - 1);
        }
        System.out.println(reversed);
    }
}
