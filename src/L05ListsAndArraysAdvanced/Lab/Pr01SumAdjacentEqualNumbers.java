package L05ListsAndArraysAdvanced.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pr01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                nums.set(i, (nums.get(i)) + nums.get(i + 1));
                nums.remove(i + 1);
                i = -1;
            }
        }

        String output = joinElementsByDelimiter(nums, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        StringBuilder output = new StringBuilder();
        for (Double item : items) {
            output.append(new DecimalFormat("0.#").format(item)).append(delimiter);
        }
        return output.toString();
    }
}
