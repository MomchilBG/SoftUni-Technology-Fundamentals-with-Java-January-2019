package L03Arrays.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr06EqualSums {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long[] numbers = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToLong(Long::parseLong)
                    .toArray();
            boolean isFound = false;
            long leftSum = 0L;
            long rightSum = Arrays.stream(numbers).sum();

            for (int i = 0; i < numbers.length; i++) {
                rightSum -= numbers[i];

                if (leftSum == rightSum) {
                    System.out.println(i);
                    isFound = true;
                }

                leftSum += numbers[i];
            }

            if (!isFound) {
                System.out.println("no");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
