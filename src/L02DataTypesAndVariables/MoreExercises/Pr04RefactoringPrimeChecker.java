package L02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class Pr04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= num; i++) {
            boolean trueOrFalse = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    trueOrFalse = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, trueOrFalse);
        }
    }
}
