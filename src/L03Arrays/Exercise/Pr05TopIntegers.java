package L03Arrays.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Pr05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = nums[nums.length - 1];
        List<Integer> result = new ArrayList<>();
        result.add(max);

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                result.add(max);
            }
        }
        Collections.reverse(result);

        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
