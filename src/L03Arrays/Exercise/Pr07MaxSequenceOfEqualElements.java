package L03Arrays.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nums = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int maxValue = nums[0];
            int maxLength = 1;
            int currentLength = 1;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    currentLength++;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        maxValue = nums[i];
                    }
                } else {
                    currentLength = 1;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < maxLength; i++) {
                sb.append(maxValue).append(" ");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
