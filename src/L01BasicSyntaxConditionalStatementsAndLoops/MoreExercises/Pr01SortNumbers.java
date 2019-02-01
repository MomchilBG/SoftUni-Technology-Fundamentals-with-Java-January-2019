package L01BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pr01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer nums[] = new Integer[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(nums, Comparator.reverseOrder());

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
