package L02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Pr10SpecialNumbersAndPr12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num;
        boolean trueOrFalse;
        for (int i = 1; i <= counter; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            trueOrFalse = (sum == 5) || (sum == 7) || (sum == 11);
            if (!trueOrFalse) {
                System.out.printf("%d -> False%n", num);
            } else {
                System.out.printf("%d -> True%n", num);
            }
            sum = 0;
            i = num;
        }
    }
}
