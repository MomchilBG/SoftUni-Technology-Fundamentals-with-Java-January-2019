package L03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean equal = true;
        int sum = 0;
        int num;

        for (num = 0; num < firstArray.length; num++) {
            if (firstArray[num] == secondArray[num]) {
                sum += firstArray[num];
            } else {
                equal = false;
                break;
            }
        }
        if (equal) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", num);
        }
    }
}
