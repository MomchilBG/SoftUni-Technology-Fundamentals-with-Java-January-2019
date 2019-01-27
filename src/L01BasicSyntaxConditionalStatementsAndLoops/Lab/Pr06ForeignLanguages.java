package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Pr06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if ("USA".equalsIgnoreCase(country) || "England".equalsIgnoreCase(country)) {
            System.out.println("English");
        } else if ("Spain".equalsIgnoreCase(country) ||
                "Argentina".equalsIgnoreCase(country) ||
                "Mexico".equalsIgnoreCase(country)) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
