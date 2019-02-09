package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Pr03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        StringBuilder zig = new StringBuilder();
        StringBuilder zag = new StringBuilder();

        for (int i = 0; i < counter; ) {

            int[] nums = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0) {
                zig.append(nums[0]).append(" ");
                zag.append(nums[1]).append(" ");
            } else {
                zig.append(nums[1]).append(" ");
                zag.append(nums[0]).append(" ");
            }

            i++;
        }
        System.out.printf("%s%n%s", zig.toString(), zag.toString());
    }
}
