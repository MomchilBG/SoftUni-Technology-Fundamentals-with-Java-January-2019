package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < counter; i++) {
            char character = scanner.nextLine().charAt(0);
            sum += character;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
