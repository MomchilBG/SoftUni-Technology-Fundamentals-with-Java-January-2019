package L02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Pr06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char charOne = scanner.nextLine().charAt(0);
        char charTwo = scanner.nextLine().charAt(0);
        char charThree = scanner.nextLine().charAt(0);

        System.out.printf("%s%s%s", charOne, charTwo, charThree);
    }
}
