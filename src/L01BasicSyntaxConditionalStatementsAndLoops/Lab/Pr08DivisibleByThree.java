package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Pr08DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
