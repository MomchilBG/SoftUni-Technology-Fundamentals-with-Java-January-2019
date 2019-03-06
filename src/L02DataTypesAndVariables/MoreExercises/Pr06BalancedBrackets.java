package L02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class Pr06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        boolean isValid = true;
        boolean isOpen = false;

        while (counter-- > 0) {

            char character = scanner.nextLine().charAt(0);

            if ('(' == character) {
                isValid &= !isOpen;
                isOpen = true;
            } else if (')' == character) {
                isValid &= isOpen;
                isOpen = false;
            }
        }

        isValid &= !isOpen;

        if (!isValid) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
