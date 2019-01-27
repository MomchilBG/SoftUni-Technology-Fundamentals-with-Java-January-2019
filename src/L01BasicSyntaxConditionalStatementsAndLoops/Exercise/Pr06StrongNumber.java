package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        long sum = 0;

        for (int i = 0; i < number.length(); i++) {

            int symbol = Integer.parseInt(String.valueOf(number.charAt(i)));

            int factorial = 1;
            for (int j = 1; j <= symbol; j++) {
                factorial *= j;

            }
            sum += factorial;
        }
        System.out.println(number.equals(String.valueOf(sum)) ? "yes" : "no");
    }
}
