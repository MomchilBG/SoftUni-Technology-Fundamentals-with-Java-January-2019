package L02DataTypesAndVariables.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Pr02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        while (counter-- > 0) {
            long[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToLong(Long::parseLong)
                    .toArray();

            long num = nums[0];
            if (nums[0] < nums[1]) {
                num = nums[1];
            }

            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.println(Math.abs(sum));
        }
    }
}
