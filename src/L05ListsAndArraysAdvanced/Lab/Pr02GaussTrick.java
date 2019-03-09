package L05ListsAndArraysAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pr02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String output = "";

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < nums.size() / 2; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size() - i - 1));
            nums.remove(nums.size() - i - 1);
        }

        output += nums;
        System.out.println(output);
        //TODO
    }
}
