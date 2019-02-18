package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        coffee(item, amount);
        water(item, amount);
        coke(item, amount);
        snacks(item, amount);

    }

    private static void coffee(String item, int amount) {
        if ("coffee".equalsIgnoreCase(item)) {
            double price = 1.5 * amount;
            System.out.printf("%.2f", price);
        }
    }

    private static void water(String item, int amount) {
        if ("water".equalsIgnoreCase(item)) {
            double price = 1.0 * amount;
            System.out.printf("%.2f", price);
        }
    }

    private static void coke(String item, int amount) {
        if ("coke".equalsIgnoreCase(item)) {
            double price = 1.4 * amount;
            System.out.printf("%.2f", price);
        }
    }

    private static void snacks(String item, int amount) {
        if ("snacks".equalsIgnoreCase(item)) {
            double price = 2.0 * amount;
            System.out.printf("%.2f", price);
        }
    }
}
