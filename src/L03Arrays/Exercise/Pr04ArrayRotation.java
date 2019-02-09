package L03Arrays.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr04ArrayRotation {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nums = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int rotations = Integer.parseInt(reader.readLine()) % nums.length;

            for (int i = 0; i < rotations; i++) {
                int first = nums[0];
                System.arraycopy(nums, 1, nums, 0, nums.length - 1);
                nums[nums.length - 1] = first;
            }

            System.out.println(Arrays.toString(nums).replaceAll("[]\\[,]", ""));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
