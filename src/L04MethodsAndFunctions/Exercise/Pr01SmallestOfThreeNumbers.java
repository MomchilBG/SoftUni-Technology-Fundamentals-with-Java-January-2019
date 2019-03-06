package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(smallestOfThreeNums(scanner));

    }

    private static int smallestOfThreeNums(Scanner scanner) {
        int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < smallestNum) {
                smallestNum = number;
            }
        }

        return smallestNum;
    }

}
