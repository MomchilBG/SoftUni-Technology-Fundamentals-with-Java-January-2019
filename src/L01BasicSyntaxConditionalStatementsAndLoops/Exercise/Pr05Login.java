package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String reversed = "";

        for (int i = 0; i < username.length(); i++) {
            reversed += username.charAt(username.length() - i - 1);
        }

        int count = 1;
        String input = scanner.nextLine();
        while (!input.equals(reversed)) {


            if (count++ == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.%n", username);
    }
}
