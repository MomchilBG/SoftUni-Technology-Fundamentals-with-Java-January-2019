package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        System.out.println(add(numOne, numTwo) - numThree);

    }

    private static long add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}
