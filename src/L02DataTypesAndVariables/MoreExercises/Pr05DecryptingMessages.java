package L02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class Pr05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int counter = Integer.parseInt(scanner.nextLine());
        String string = "";

        while (counter-- > 0) {
            char character = scanner.nextLine().charAt(0);
            character += key;
            string += character;
        }
        System.out.printf("%s", string);
    }
}
