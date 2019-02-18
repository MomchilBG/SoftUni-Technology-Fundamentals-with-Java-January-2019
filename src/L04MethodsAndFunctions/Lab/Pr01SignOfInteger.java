package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr01SignOfInteger {
    public static void main(String[] args) {
        check();
    }

    private static void check() {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}


