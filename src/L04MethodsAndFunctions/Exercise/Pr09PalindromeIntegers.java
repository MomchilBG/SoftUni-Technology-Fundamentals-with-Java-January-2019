package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        palindromeOrNot(scanner);

    }

    private static void palindromeOrNot(Scanner scanner) {

        String number = scanner.nextLine();

        while (!"end".equalsIgnoreCase(number)) {
            System.out.println(number.equals(new StringBuilder(number).reverse().toString()));
            number = scanner.nextLine();
        }
    }
}

