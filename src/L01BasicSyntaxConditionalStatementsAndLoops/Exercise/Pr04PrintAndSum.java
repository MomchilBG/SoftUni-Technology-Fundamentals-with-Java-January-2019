package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (start <= end) {
            System.out.print(start + " ");
            sum += start;
            start++;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
