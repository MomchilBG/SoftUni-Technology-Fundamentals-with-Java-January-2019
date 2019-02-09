package L03Arrays.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr07CondenseArrayToNumber {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] numbers = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            while (numbers.length > 1) {
                int[] condensed = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                }
                numbers = condensed;
            }

            System.out.println(numbers[0]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
