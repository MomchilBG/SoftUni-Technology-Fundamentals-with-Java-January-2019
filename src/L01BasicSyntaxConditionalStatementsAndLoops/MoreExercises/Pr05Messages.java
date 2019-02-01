package L01BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class Pr05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chars = Integer.parseInt(scanner.nextLine());

        while (chars-- > 0) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                System.out.print(' ');
                continue;
            }

            if (num == 1) {
                continue;
            }

            int length = 1;
            if (num > 1000) {
                length = 4;
            } else if (num > 100) {
                length = 3;
            } else if (num > 10) {
                length = 2;
            }

            int digit = num % 10;

            int offset = (digit - 2) * 3;
            if (digit >= 8) {
                offset += 1;
            }

            int code = 'a' + (offset + length - 1);
            System.out.print((char) code);
        }
    }
}
