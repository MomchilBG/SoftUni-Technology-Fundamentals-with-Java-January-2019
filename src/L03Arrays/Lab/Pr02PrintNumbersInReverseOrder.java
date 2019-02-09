package L03Arrays.Lab;

import java.util.Scanner;

public class Pr02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[counter];

        for (int i = 0; i < counter; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
