package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Pr08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    System.out.println(nums[i] + " " + nums[j]);
//TODO
                }
            }
        }
    }
}
